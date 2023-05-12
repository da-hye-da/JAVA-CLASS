package j0512;

import java.util.Iterator;
import java.util.Scanner;

public class Class0512_07 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			int[][] score = new int[5][3];//5명의 국어/수학/영어 점수
			String [] title = {"국어","영어","수학"};
			
			//입력
			for (int i = 0; i < score.length; i++) {
				System.out.println((i+1)+"번째 학생");
				for (int j = 0; j < score[i].length; j++) {
					System.out.println(title[j]+"점수를 입력하세요");
					score[i][j] = scan.nextInt();					
				}//for j
			} //for i
			//----------
			//출력
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] +"\t");
				}// for j
				System.out.println();
			} //for i
			
				
		}//main
}//class
