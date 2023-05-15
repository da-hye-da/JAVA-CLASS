package j0515;

import java.util.Scanner;

public class Class0515_08 {
	public static void main(String[] args) {

//5,5배열을 만들어서 해당번호를 x표시하는 프로그램을 구현하시오
		Scanner scan = new Scanner(System.in);
		String[][] box = new String[5][5];
		// 1차원 배열에 숫자 넣기
		int[] num = new int[25];
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
		} // for

		// 배열 섞기
		int temp = 0, random = 0;
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		} // for

		// 2차원
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = "" + num[5 * i + j];
			} // for j
		} // for i

		while (true) {

			// 상단 번호 출력
			System.out.print(" |" + " \t");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + " \t");
			}
			System.out.println();
			System.out.println("=========================================");

			for (int i = 0; i < box.length; i++) {
				System.out.print(i+"| \t");
				for (int j = 0; j < box[i].length; j++) {
					System.out.print(box[i][j]+"\t");
				}//for i
				System.out.println();
			}//for j
						
			
			
			System.out.println("1~25번까지의 숫자를 입력하세요.");
			int input = scan.nextInt();
			// 해당값을 찾기
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (box[i][j].equals(input + "")) {
						box[i][j] = "😉";
						break loop;//
					}
				}
			} // loop
			
		} // while
	}// main
}// class
