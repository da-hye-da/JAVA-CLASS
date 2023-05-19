package j0519;

import java.util.Iterator;
import java.util.Scanner;

public class C0519_01 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);//'내용입력받기'위해 객체 선언
		Student[] s = new Student[10];
		
		
		//1. 성적입력 메소드
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
				
			switch () {
			for (int i = 0; i < 10; i++) {
				System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
				s[i].name = scan.nextInt();
				if (s[i].name==0) {System.out.println("잘못 입력하셨습니다");
					
				}
			}


				System.out.println("성적을 입력하세요");
				System.out.println("국어성적 >> ");
				s[i].kor = scan.nextInt();
				System.out.println("영어성적 >> ");
				s[i].eng = scan.nextInt();
				System.out.println("수학성적 >> ");
				s[i].math = scan.nextInt();
				
				s[i].sum();
				s[i].average();
			}

System.out.println("==============================================");				
System.out.println("\t이름\t국어\t영어\t수학\t합계\t평균");
System.out.println("==============================================");				
System.out.println();
System.out.println("==============================================");				

				

	}