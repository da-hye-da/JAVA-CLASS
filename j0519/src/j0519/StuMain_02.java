package j0519;

import java.util.Scanner;

public class StuMain_02 {

		//
		Scanner scan = new Scanner(System.in);// '내용입력받기'위해 객체선언
		Student[] s = new Student[10];// 객체 배열선언 덕분에 아래 변수들 작성없이 이 한줄로도 끝남
//	int[]kor = new int[10];
//	int[]eng = new int[10];
//	int[]math = new int[10];
//	int[]total = new int[10];
//	double[]avg = new int[10];
//	int[]rank = new int[10];

		int choice = 0;// 원하는 번호 입력하는 변수
		int count = 0;// 입력한 학생 수
		int chk = 0;// 학생이 있는지 확인하는 변수
		String Searchname = ""; // 입력받을 학생 이름

		// 반복문 : while,for 조건문 : if, switch

		while (true) { // 조건이 true이면 실행. 100%맞으면 무한 반복
			System.out.println("S ");
			System.out.println("-----------------------");
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요."); // 이대로 실행하면 이 내용들의 출력이 무한반복됌
			choice = scan.nextInt();// 이때 실행하면 scan.nextInt() 때문에 입력을 받기 위해 대기중

//		if(choice==1) {// 1개마다 1초씩 걸린다고 하면
//		} else if(choice==2) {
//		} else if(choice==3) {
//		} else if(choice==4) {
//		} else if(choice==5) {
//		} else {//총 6초가 걸리지만 switch를 쓰면 1초만 걸림
//		}

			// 입력된 번호를 선택하는 조건문
			loop: switch (choice) {// choice가
			case 1:// 1이면
				System.out.println("[ 학생성적 입력 ]");
				for (int i = count; i < s.length; i++) {// 10명의 성적을 입력하는 반복문 - (초기식;조건식;증감식) //int i=0이 아니라 i=count인 것은
														// 다음에 적힐 할생이 이전 내용에 덮어쓰이지 않기 위해
					s[i] = new Student();// 객체 선언 - 공간할당을 해줌
					System.out.println("이름을 입력하세요. (0. 이전페이지로 이동) ");

					s[i].name = scan.next();// 이름입력 또는 이전페이지이동 입력
					// 이전페이지 이동입력이 되었는지 확인 string은 equals로 비교, 나머지는 ==으로 비교
					if (s[i].name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다. ]");

						break; // break는 반복문(for,while,switch)에서만 사용가능
					} // if
					System.out.println("국어 점수를 입력하세요.");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					s[i].math = scan.nextInt();
					count++;// 입력이 완료되면 입력된 학생수 1 증가

					s[i].sum();// 합계처리
					s[i].average();// 평균처리
				} // case1 for
				break; // switch빠져나올때 사용되는 구문
			case 2:
				System.out.println();
				System.out.println("[ 학생성적 출력 ]");
//			Student.title; //title는 student의 static String[] title = {"이름","국어","영어","수학","합계","평균","등수"};를 의미
//			String[]title = Student.title;
				// 클래스변수사용방법: 클래스명.변수명
				// 상단타이틀 출력
				for (int i = 0; i < Student.title.length; i++) {
					System.out.print(Student.title[i] + "\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------------");
				// 입력된 성적 출력
				for (int i = 0; i < count; i++) {
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f\t", s[i].avg);
					System.out.print(s[i].rank + "\t");
					System.out.println();
					System.out.println("---------------------------------------------------");
				}
				System.out.println();
				break;
			case 3:
				chk = 0;// 초기화
				System.out.println("[ 학생성적 수정 ] ");
				System.out.println("수정할 학생의 이름을 입력하세요. (0. 이전페이지로 이동)");
				Searchname = scan.next();

				if (Searchname.equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
				} // if
				for (int i = 0; i < count; i++) {
					if (s[i].name.equals(Searchname)) {
						System.out.printf("[ %s 학생이 검색되었습니다. ]\n", Searchname);
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.println("-----------------------");
						System.out.println("수정할 과목을 선택하세요.");
						choice = scan.nextInt();

						switch (choice) {
						case 1:
							System.out.printf("[수정 전 국어 점수 : %d ]\n", s[i].kor);
							System.out.println("수정 할 점수를 입력하세요.");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();

							System.out.println("[ 국어 점수 수정 완료 ]");
							System.out.println();
							break;

						case 2:
							System.out.printf("[수정 전 영어 점수 : %d ]\n", s[i].eng);
							System.out.println("수정 할 점수를 입력하세요.");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();

							System.out.println("[ 영어 점수 수정 완료 ]");
							System.out.println();
							break;

						case 3:
							System.out.printf("[수정 전 수학 점수 : %d ]\n", s[i].math);
							System.out.println("수정 할 점수를 입력하세요.");
							s[i].math = scan.nextInt();
							s[i].sum();
							s[i].average();

							System.out.println("[ 수학 점수 수정 완료 ]");
							System.out.println();
							break;
						}// switch

						chk = 1; // 학생이 존재시 1로 변경
					} // if
				} // for

				// 학생이 존재하지 않을 경우 출력
				if (chk == 0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ]\n", Searchname);
					System.out.println();
				}
				break;

			case 4:// 등수처리
				System.out.println("[ 등수 처리 ]");
				// 등수처리 for문
				for (int i = 0; i < count; i++) {
					int rankcount = 0;
					for (int j = 0; j < count; j++) {
						if (s[i].total < s[j].total) {
							rankcount++;
						} // if
					} // for j
					s[i].rank = rankcount;
				} // for i
				System.out.println("등수처리가 완료되었습니다");
				System.out.println();

				break;
			case 5:
				System.out.println("[ 학생 검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요. (0. 이전페이지로 이동)");
				Searchname = scan.next();

				if (Searchname.equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
				} // if
				for (int i = 0; i < count; i++) {
					if (s[i].name.equals(Searchname)) {
						System.out.printf("[ %s 학생이 검색되었습니다. ]\n", Searchname);
						chk = 1; // 학생이 존재시 1로 변경
					} // if
				} // for

				// 학생이 존재하지 않을 경우 출력
				if (chk == 0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ]\n", Searchname);
					System.out.println();
				}

				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;

			}// switch

		} // while
		
			}
}// class
