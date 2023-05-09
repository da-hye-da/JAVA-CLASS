package j0509;

import java.util.Scanner;

public class Class0509_08 {
	public static void main(String[] args) {

		byte a= 10;
		byte b= 20;
//		long c= long(a*b); //이미 이 안에서 결과값을 int로 저장한다
		long c= (long)(a)*b;//이렇게 하나라도 통으로 변환해 주어야 한다
		System.out.println(c);
		
//		//대문자 입력시 소문자로 출력하시오.
//		//1. 변수선언 2. 입력 3. 출력
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("대문자를 입력하세요.");
//		ch = scan.next().charAt(0);//문자열의 첫번째 문자를 가져옴
//		char ch2 = (char)(ch+32);
//		System.out.println("입력된 대문자 : "+ch);
//		System.out.println("변환된 문자 : "+ch2);
		
		//소문자를 입력받아 대문자로 출력하세요.
//		char ch3 = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소문자를 입력하세요");
//		ch3 = scan.next().charAt(0);
//		char ch4 = (char)(ch3-32);
//		System.out.println("입력된 소문자 : "+ch3);
//		System.out.println("변환된 문자 : "+ch4);
		
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		char ch = 'A';
//		int num = ch+1;
//		System.out.println(num);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		//이항연산자
//		int num = 10;
//		double num2 = 10;
////		num3 = num +num2; //num을 입력시 형변환의 오류 발생.
//		double num3 = num +num2;
//		system.out.println();
		
	}

}