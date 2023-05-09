package j0509;

import java.util.Scanner;

public class Class0509_10 {
	public static void main(String []args) {
//		//double num = 564.124586 소수점 3자리 절사 2자리까지 존재
//		double num = 564.124586;
//		double result = (int)(num*100)/100.0;
//		System.out.println(result);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//실수 소수점자리 7자리까지 입력받아, 소수점 4자리까지만 출력하시오.
		//double num = 564.1245868
//		double num = 564.1245868;
//		double result = (int)(num*10000)/10000.0;
//		System.out.println(result);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		//1. 변수선언 2. 입력 3. 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		double num1 = scan.nextDouble();
		double result1 = (int)(num1*10000)/10000.0;
		System.out.println(result1);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0; //.0을 입력하여 실수형을 만들기. .0 입력 안하려면 d 적어주기
//		System.out.println(result);
		
	}
}
