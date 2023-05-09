package j0509;

import java.util.Scanner;

public class Class0509_12 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		ch = scan.next().charAt(0);
		String result = (ch>='a'&&ch<='z')?"첫번째 글자는 영문 소문자":"첫번째 글자는 영문 대문자";
		System.out.println(result);
		System.out.println("―――――――――――――――――――");
		char ch2 = ' ';
//		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		ch2 = scan.next().charAt(1);
		String result2 = (ch2>='A'&&ch2<='Z')?"두번째 글자는 영문 대문자":"두번째 글자는 영문 소문자";
		System.out.println(result2);
		System.out.println("―――――――――――――――――――");


	}

}
