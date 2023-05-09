package j0509;

import java.util.Scanner;

public class Class0509_11 {
	public static void main(String[] args) {
		
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//실수를 입력받아 소수점 4자리에서 올림해서 출력하시오
		double input = 12;//저 숫자 12는 의미 없음 내가 콘솔창에 적는 것이 의미있는 숫자.
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하기 : ");
		input = scan.nextDouble();
		double result2 = Math.ceil(input*1000)/1000.0;
		System.out.println(result2);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오
		//1. 변수선언 2. 입력 3. 출력
//		double in = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 : ");
//		in = scan.nextDouble();
		//반올림 round(), 올림 ceil(), 버림floor()
//		double result1 = Math.round(in*100)/100.0;
//		System.out.println(result1);		
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		double pi = 3.7894; //소수점 2자리에서 반올림해서 출력하시오
//		37.894
//		double pi = 3.7894;
//		double result = Math.round(pi*10)/10.0;
//		System.out.println(result);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――
		
	//소수점 4자리에서 반올림 출력하시오.
	//1. 변수선언 2.출력
//	double pi = 3.141592;
//	double result = Math.round(pi*1000)/1000.0;//소수점 첫자리에서 반올림한 값을 반환
//	System.out.println(result);	
	}
	
}