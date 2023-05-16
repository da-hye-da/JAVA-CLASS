package j0516;

import java.util.Scanner;

public class Class0516_06 {
public static void main(String[] args) {
	Student[] s= new Student[10];//student 참조변수 배열 10개 생성
	s[0]= new Student();//객체 선언
	Scanner scan = new Scanner(System.in);
	int choice = 0;// 선택번호
	int count = 0;// 학생 수
	
	loop: while(true) {
		//화면출력부분
		System.out.println("");
		System.out.println(" [ 학생 성적 처리 프로그램 ] ");
		// 화면 출력
		System.out.println("[학생성적 처리프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생성적검색");
		System.out.println("0. 프로그램종료");
		System.out.println("============================");
		System.out.println("  원하는 번호를 입력하세요");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			for (int i = 0; i < s.length; i++) {
				// 이름입력부분
				System.out.println((count+1) + "번째 학생의 이름을 입력하세요.(0.이전페이지로 이동)");
				s[i].name = scan.next();

				// 이전페이지로 이동
				if (s[i].equals("0")) {
					System.out.println("이전페이지로 이동합니다");
					System.out.println();
					break;
				} // if

				// 국영수
				System.out.println("국어점수를 입력하세요");
				s[i].kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요");
				s[i].eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요");
				s[i].math = scan.nextInt();
				
				//합계
				s[i].sum();
				//평균
				s[i].average();
				}
				for (int j = 0; j < 3.; j++) {
					System.out.println(title[j + 1] + " 과목의 점수 입력");
					score[i][j] = scan.nextInt();
				} // 국영수 for
	}
		break loop;}
}//main
private void screen() {
}

}//class


	
