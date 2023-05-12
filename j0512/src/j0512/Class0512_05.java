package j0512;

import java.util.Scanner;

public class Class0512_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10진수를 2진수로 변경하는 프로그램
		//		index 0  1  2  3  4  5  6  7  8  9
//		int[] data = {0,10,20,30,40,50,60,70,80,90};
//		String[] data = {"0","10","20","30","40","50","60","70","80","90"};
		
		//		 index      0     1      2      3      4      5      6      7      8      9
		String[] data = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001"};
		
//		for(int i = 0; i<5; i++) {//2진수 5번 반복
//			System.out.println("10진수를 입력하세요");//5
//			int num =scan.nextInt();
//			System.out.println(data[num]);
			
		int[] num = new int[5];
		for(int i = 0; i<5; i++) {//2진수 5번 반복
			System.out.println("10진수를 입력하세요");//5
			num[i] = scan.nextInt();
			//2진코드 출력
			for (int i = 0; i <5; i++) {
				System.out.println(data[num[i]]+" ");
			}
			System.out.println();
//			System.out.println();
		
//							{"0000","0001","0010","0011", 
//							"0100","0101","0110","0111",
//							"1000","1001"};

//		binary[0],binary[1],binary[2],binary[3],
//		binary[4],binary[5],binary[6],binary[7],
//		binary[8],binary[9],
		
//		int[] num = new int[10];
//		int[] num = new int[4];
//		
//		//1025 - 0001 0000 0010 0101
//		//1개씩 번호 입력
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("번호를 입력하세요");
//			num[i] = scan.nextInt(); //i는 binary가 됌. [0]은 "0000"이 됌	
//		}
//		// 10진코드 출력
//		System.out.println("10진 코드 : ");
//			for (int i = 0; i < num.length; i++) {
//				System.out.println(num[i]+" ");
//			}
//		System.out.println();//줄바꿈
//		
//		//2진 코드로 번호 입력
//		System.out.println("2진 코드 입력 : ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(binary[num[i]]+" ");
//		}
//		System.out.println( );// 줄바꿈
//		
		
	}//main
}//class
