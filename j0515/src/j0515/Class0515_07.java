package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class Class0515_07 {
	public static void main(String[] args) {

		Scanner	scan = new Scanner(System.in);
		// 5.5배열
		String[][] box = new String[5][5];

		// 1차원 배열에 숫자 넣기
//		int[] num = {11,14,2,3,12,15,8,9,13,4,5,6,24,16,1,22,10,17,7,25,20,21,18,19,23};
		int[] num = new int[25];
		for (int i = 0; i < 25; i++) { //25 대신 num.length로 넣어도 됌
			num[i] = i + 1;// 1차원은 배열 1개  num[0]=1,num[1]=2.......
		}

		// 배열 섞기
		int temp =0, random=0;
		for (int i = 0; i < 100; i++) { //100번 섞기
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0]= num[random];
			num[random] = temp;
			
		}
		// 2차원 배열에 숫자 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = "" + num[5 * i + j];//num[5 * i + j] 은 num[0,1,2,3,4]와 같음
				// box[0][0] = 1 string 타입은 = "" +int;로 쓰면 됌
				// 1차원 배열의 num={1}은 2차원배열의 box[0][0] = 1를 의미
			} // 2차원 배열 for j
		} // 2차원 배열 for i //2차원은 배열 2개
		
		//box[0][0] = num[1];
		//box[0][1] = num[2];
		//box[0][2] = num[3];
		//box[0][3] = num[4];
		//box[0][4] = num[5];
		//box[1][0] = num[6];
		//box[1][1] = num[7];
		//box[1][2] = num[8];
		//box[1][3] = num[9];
		//box[1][4] = num[10];
		//box[2][0] = num[11];
		//box[2][1] = num[12];
		//box[2][2] = num[13];
		//box[2][3] = num[14];
		//box[2][4] = num[15];
		//box[3][0] = num[16];
		//box[3][1] = num[17];
		//box[3][2] = num[18];
		//box[3][3] = num[19];
		//box[3][4] = num[20];
		//box[4][0] = num[21];
		//box[4][1] = num[22];
		//box[4][2] = num[23];
		//box[4][3] = num[24];
		//box[4][4] = num[25];

		while(true) {
			
		// 상단 번호 출력
		System.out.print("  |"+"\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("―――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		
		//1~25까지 번호입력
		System.out.println("1~25까지 번호를 입력하세요.>> ");
		int input = scan.nextInt()	;
		//해당값을 찾기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(box[i][j].equals(input+"")) {
					box[i][j] = "😢";
					continue;
				}
			}
			
		}
		// 화면출력
		for (int i = 0; i < box.length; i++) {
			System.out.print(i +" |\t");
			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j] + "\t");
			} // for j
			System.out.println();
		} // for i
		
		//좌표입력
//		System.out.println("X 좌표를 입력하세요. >> (0~4까지 번호)") ;
//		System.out.println("Y 좌표를 입럭하세요. >> (0~4까지 번호)") ;
//		int no1 = '4'- '0'; //char - '0'= int 이 됌. 
//		int no2 = '1'- '0';//char= 1
//		box[no1][no2] = "X";
		
		
		}//while

	}// main
}// class
