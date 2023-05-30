package j0522;

import java.util.Scanner;

public class C0522_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 두 수를 입력받아 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용
		
		//배열 선언
		Data[] d = new Data[2];// new Data[2];안에 적은 숫자는 만드려고 하는 객체의 갯수를 의미, [100]으로 작성시 100개를 만들겠다는 것.
		
		
//		//객체 선언
//		Data d = new Data();
		
		for (int i = 0; i < 2; i++) {
			//객체 선언
			d[i]= new Data();
			
		System.out.println("1번째 숫자를 입력하세요");
		d[i].num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요");
		d[i].num2 = scan.nextInt();
		
		d[i].data1= d[i].num1+d[i].num2;
		System.out.println(d[i].data1);
		d[i].data2= d[i].num1-d[i].num2;
		System.out.println(d[i].data2);
		d[i].data3= d[i].num1*d[i].num2;
		System.out.println(d[i].data3);
		d[i].data4= d[i].num1/d[i].num2;
		System.out.println(d[i].data4); //참조변수명.변수명
				
		}//for
	}//main
}//class
