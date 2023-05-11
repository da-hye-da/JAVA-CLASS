package j0510;

import java.util.Scanner;

public class Class0510_06 {
	public static void main(String[] args) {
		//	//1.변수선언 num1,num2,op 2.scan입력 3번입력
		//	//3.비교(switch) 4.결과값출력 - 더하기결과값:
		//		int num1 = 0, num2 = 0;//같은 값일 경우 이렇게 선언 가능
		//		char op = ' ';
		//		
		//		Scanner scan = new Scanner(System.in);
		//		
		//		System.out.println("<두 개의 숫자를 연산 합니다>");
		//		System.out.println("첫번째 숫자를 입력하세요");
		//		num1 = scan.nextInt(); //scan 입력#1
		//		
		//		System.out.println("두번째 숫자를 입력하세요");
		//		num2 = scan.nextInt(); //scan 입력#2
		//		
		//		System.out.println("연산자를 입력하세요");
		//		op = scan.next().charAt(0);
		//		
		//		switch(op) {
		//		case '+':
		//			System.out.println("결과 값 : "+ (num1 + num2));
		//			break;
		//		case '-':
		//			System.out.println("결과 값 : "+ (num1 - num2));
		//			break;
		//		case '*':
		//			System.out.println("결과 값 : "+ (num1 * num2));
		//			break;
		//		case '/':
		//			System.out.println("결과 값 : "+ (num1 / num2));
		//			break;
		//		}
		//		System.out.println(op);
		//――――――――――――――――――――――――――――――――――――――――――――――――――
		//1.변수선언 num1,num2,op 2.scan입력 3번입력
		//3.비교(switch) 4.결과값출력 - 더하기결과값:
		int num1 = 0, num2 = 0;//같은 값일 경우 이렇게 선언 가능
		char op = ' ';

		Scanner scan = new Scanner(System.in);

		System.out.println("<두 개의 숫자를 연산 합니다>");
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt(); //scan 입력#1

		System.out.println("두번째 숫자를 입력하세요");
		num2 = scan.nextInt(); //scan 입력#2

		System.out.println("연산자를 입력하세요");
		op = scan.next().charAt(0);

		int result = 0;
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.println("결과 값 : "+ result);
	}//2
}//1
