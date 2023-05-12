package j0512;

import java.util.Iterator;
import java.util.Scanner;

public class Class0512_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		int[] num =new int[3];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("점수를 입력하세요.");
//			num[i] = scan.nextInt();
//		} 
		//2차원 배열
//		int[][] score = new int[5][3];
		int[][] score = new int[3][4]; {//국영수합
			//출력
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.println("2차원 점수를 입력하세요");
					score[i][j] = scan.nextInt();
				}
			}
		//출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+" \t");

				} //for j
			System.out.println();	
			} //for i
		} //int[][]score
	}//main
}//class
