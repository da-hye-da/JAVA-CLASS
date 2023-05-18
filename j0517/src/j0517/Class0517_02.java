package j0517;

import java.util.Scanner;

public class Class0517_02 {

	public static void main(String[] args) {
		Class0517_02 c = new Class0517_02();
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;

		// 객체선언
		// 클래스명 참조변수명 = new 클래스명();
		// Card c1 = new Card();

		// 두 수를 입력받아 더하기 결과 값을 출력하시오.
//		System.out.println("첫번째 숫자를 입력하세요");
//		num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		num2 = scan.nextInt(); //이와 같은 4줄은 숫자가 여러개일 경우 계속 생성해야하는 단점. so for문을 이욯하는게 필요

		//사칙연산 메소드 만들기
		int[] num = new int[2];// for문을 만들기 위한 배열만들기

		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + "번째 번호를 입력하세요");
			num[i] = scan.nextInt();
		} // for

		int result = c.add(num[0], num[1]); // ③ (①②③ 순서로 실행됨)
		System.out.println("두 수의 더하기 : " + result);

		int result_1 = c.sub(num[0], num[1]); //
		System.out.println("두 수의 빼기 : " + result_1);

		int result_2 = c.multi(num[0], num[1]);
		System.out.println("두 수의 곱하기 : " +result_2);
		
		int result_3= c.div(num[0],num[1]);
		System.out.println("두 수의 나누기 : " +result_3);
	}// main

	// 더하기 메소드
	int add(int num1, int num2) { // ①
		int result = num1 + num2;
		return result; // ②
	}// int add

	// 빼기 메소드 sub
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}// int sub

	// 곱하기
	int multi(int num1, int num2) {
		int result = num1 *num2;
		return result;
	}
	
	// 나누기
	int div(int num1, int num2){
		int result = num1 / num2;
		return result;
	}
}// class
