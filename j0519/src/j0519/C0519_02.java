package j0519;

import java.util.Scanner;

public class C0519_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student[] s = new Student[10];
		int count = 0;
		int choice = 0;

		while (true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");

			// 입력
			choice = scan.nextInt();
			switch (choice) {
			case 1:

				for (int i = 0; i < s.length; i++) {

					s[i] = new Student();
					System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요");
					s[i].name = scan.next();
					System.out.println("성적을 입력해주세요");

					System.out.println("국어성적 : ");
					s[i].kor = scan.nextInt();
					System.out.println("영어성적 : ");
					s[i].eng = scan.nextInt();
					System.out.println("수학성적 : ");
					s[i].math = scan.nextInt();
					s[i].sum();
					s[i].average();
					
					break;
				} // for
			case 2:
				System.out.println("성적 출력");
				
				break;
				
			}// switch
		} // while
	}// main

}// class
