
package j0512;

import java.util.Scanner;

public class Class0512_08 {
	public static void main(String[] args) {
		//국어, 영어, 수학, 합계(자동계산)
		Scanner scan = new Scanner(System.in);
		
		int[][] score = new int[5][4];
		String[] title = {"국어","영어","수학","합계"};

		//입력
		for (int i = 0; i < score.length; i++) {
			System.out.print("-------------\n"+(i+1)+"번째 학생\n");
			for (int j = 0; j < score[i].length-1; j++) { //합계 입력받기 전까지만 입력
				System.out.println(title[j]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				
				score[i][3] = score[i][0]+score[i][1]+score[i][2];
			}//for j
		}//for i
		//--------------
		//출력
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
			}
		System.out.println();
		System.out.println("===================");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");				
			}//for j
		System.out.println();
		}//for i
		//--------------------------------

	}//main
}//class
