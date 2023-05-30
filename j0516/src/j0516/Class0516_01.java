package j0516;

import java.util.Iterator;
import java.util.Scanner;

public class Class0516_01 {
	//클래스 변수 - 클래스명.변수명 : 같은 클래스 내에서는 클래스명 생략가능
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
	public static void main(String[] args) {
//		Class0516_01 c = new Class0516_01;
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름, 국어, 영어, 수학, 합계, 평균 -10명
		Scanner scan = new Scanner(System.in);
		int choice = 0;// 선택 번호
		int count = 0;// 학생 수

		String[] name = new String[10]; // 이름
		int[][] score = new int[10][4];// 국영수합
		double[] avg = new double[10];// 평균

		// 무한박복
		loop: while (true) {
			// 화면출력부분
			System.out.println(" [ 학생성적처리 프로그램 ] ");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("====================================");
			System.out.println("원하는 번호를 출력하시오.");
			choice = scan.nextInt();

			switch (choice) {
			

			case 1:
				for (int i = count; i < name.length; i++) {
					// 이름입력부분
					System.out.println(count + 1 + "번째 학생의 이름을 입력하세요.(0. 이전페이지 이동) >> ");
					name[i] = scan.next();

					// 이전페이지 이동확인
					if (name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break;
					}
					// 국영수
					// score[i][0] 국어, score[i][1] 영어, score[i][2] 수학
					for (int j = 0; j < 3; j++) {// 과목의 수 so.3
						System.out.println(title[j+1]+"점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}

					// 합계부분
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					// 평균
					avg[i] = score[i][3] / 3.0;

					System.out.println("-------------------------");
					System.out.println((count + 1) + "번째 학생의 성적이 입력 되었습니다.👍👍");
					System.out.println("------------------------------");
					System.out.println();

					// 학생수 1 증가
					count++;
				} // case 1 for
				break;

			case 2:// 성적 출력
				System.out.println("[ 학생 성적 ]");
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println("");
				System.out.println("==============================================");
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i]+"\t");
				for (int j = 0; j < score[i].length; j++) { // score[i].length = 4(국영수합)
					System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%.2f\t",avg[i]);
				System.out.println();
			}
				
				break;
			case 0:
				// 메소드 호출
				System.out.println(" [ 프로그램 종료 ] ");
				break loop;

			}// switch
		} // while
	}// main
}// class
