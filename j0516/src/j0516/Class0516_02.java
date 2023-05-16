package j0516;

import java.util.Scanner;

public class Class0516_02 {
	public static void main(String[] args) {

		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름, 국어, 영어, 수학, 합계, 평균 -3명
		Scanner scan = new Scanner(System.in);
		int choice = 0;// 선택번호
		int count = 0;// 학생 수
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[3];// 3명의 이름
		int[][] score = new int[3][4];// 3명의 4과목
		double[] avg = new double[3];// 3명의 평균
		String searchName = "";//검색이름
		int[] rank = new int[10];//등수
		int rankCount = 0;
		int chk = 0; //존재 유무
		
		// 무한반복
		loop: while (true) {
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
				for (int i = 0; i < name.length; i++) {
					// 이름입력부분
					System.out.println((count+1) + "번째 학생의 이름을 입력하세요.(0.이전페이지로 이동)");
					name[i] = scan.next();

					// 이전페이지로 이동
					if (name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break;
					} // if

					// 국영수
					for (int j = 0; j < 3.; j++) {
						System.out.println(title[j + 1] + " 과목의 점수 입력");
						score[i][j] = scan.nextInt();
					} // 국영수 for
					
					//합계
					score[i][3] = score[i][0] +score[i][1] +score[i][2];
					//평균
					avg[i] = score[i][3]/3.0;
					count++;
					
					//출력
					System.out.println("===============================");
					System.out.println("   👍👍 성적 입력 완료 👍👍");
					System.out.println("===============================");
					System.out.println();
				} // case 1 for
				break;

	         case 2://성적 출력 
	             System.out.println("[ 학생 성적 ]");
	             for(int i = 0 ; i<title.length; i++ ) {
	                System.out.print(title[i]+ "\t");
	                
	             }
	             System.out.println("");
	             System.out.println("=============================================");
	             for(int i = 0 ;i < count; i++) {
	                System.out.print(name[i]+ "\t");
	                for(int j = 0 ;j<score[i].length;j++) {
	                   System.out.print(score[i][j]+ "\t");
	                }
	                System.out.printf("%.2f\n", avg[i]);
	                System.out.println();
	             }//case 2
	              break;
	         
	         case 3://성적 수정
				//수정할 학생이름 입력
				System.out.println("수정할 학생 이름 검색");
				searchName = scan.next();
				
				//수정할 학생 검색
				int chk = 0;
				for (int i = 0; i <count; i++) {
		
				if (name[i].equals(searchName)) {//모든 학생을 검색
					//수정할 과목 선택
					System.out.println("[ 수정할 학생을 찾았습니다👍👍 ]");
					System.out.println("수정할 과목 선택");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("==========================");
					
					System.out.println("수정할 과목 번호를 입력");
					choice = scan.nextInt();
					
					//수정할 과목 이전 점수 표시
//					score[1][0] 국어, score[1][1] 영어, score[1][2]수학
					
					System.out.printf("[ 현재 %s 점수 ] : %d \n ", title[choice],score[i][choice-1]);
					System.out.println("================================");
					System.out.println("수정할 점수 입력 >> ");
					score[i][choice-1] = scan.nextInt();
					
					//합계, 평균 수정
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					avg[i]=score[i][3]/3.0;
					
					System.out.println("   👍👍 점수 수정 완료 👍👍");
					System.out.println();
					chk = 1;
					
					
				}//if
				}//for
	        	 
				if(chk==0) {
				
				System.out.println("입력한 학생이 없습니다. 다시 입력하세요");
				System.out.println();
				}
				break;
				
			case 4: //등수처리 score[i][3]:합계
					for (int i = 0; i < count; i++) {
						rankCount = 1;
						for (int j = 0; j < count; j++) {
							//학생성적 합계 비교
							if(score[i][3]<score[j][3]) {
							//자기 점수보다 높으면 등수 1 증가,
								rankCount++;
							}//case if
								
						} //case 4 for j
						//등수 부분에 등수 입력
						rank[i]= rankCount;
					} //case 4 for i
				break;
				
				
	

	         case 5:
	        	 System.out.println("[ 학생 검색 ]");
	        	System.out.println(" 검색할 학생의 이름을 입력하세요.");
	        	searchName = scan.next();
	        	chk=0;
	        	for (int i = 0; i < count; i++) {
	        		//contains; 홍 -> 홍길동, 홍길순, 홍길자 와 같은 이름 중 해당되는 것들이 나오면 true/ 아니면 false
	        		if (name[i].contains((searchName)) {
	        			System.out.print(name[i]+ "\t");
	        			for(int j = 0 ;j<score[i].length;j++) {
	        				System.out.print(score[i][j]+ "\t");
	        			}
	        			System.out.printf("%.2f\n", avg[i]);
	        			System.out.println("%d\n", rank[i]);
	        			

					}
					
				}
				
				
				case 0:
					System.out.println("[ 프로그램 종료 ]");
					System.out.println();
					break loop;
							
						

}// switch

} // loop

} // main
}// class
