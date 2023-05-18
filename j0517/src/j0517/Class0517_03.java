package j0517;

import java.util.Scanner;

public class Class0517_03 {
	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 합계를 구하시오
		// add 메소드를 사용하시오

		// 객체선언
		Class0517_03 c = new Class0517_03();
		int num1 = 0;
		int num2 = 0;

		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			Scanner scan = new Scanner(System.in);
			num[i] = scan.nextInt();
		} // for

		int result = c.add(num[0], num[1], num[2]);
		System.out.println("더하기 결과값 : " + result);
	}// main

	//add
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;

	}// main
}// class
