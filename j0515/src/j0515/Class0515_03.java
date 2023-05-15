package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class Class0515_03 {
		public static void main(String[] args) {
			//10개 중 2개의 보물을 찾기 프로그램을 구성하시오.
			//꽝 - 0, 1- 1억보물, 2-2억보물
			//box 배열 10개
			//arr 배열 10개
			//섞기 temp, random
			//scan입력 -> input
			//while - 무한반복
			//화면출력 - arr출력, 번호출력
			Scanner scan = new Scanner(System.in);
			int[]box = {0,0,0,0,0,0,0,0,1,2};
			String[]arr = {"?","?","?","?","?","?","?","?","?","?"};
			int input = 0;
			int random = 0;
			int temp = 0;
			
			//box 번호 섞기
			for (int i = 0; i < 100; i++) {
				random = (int)(Math.random()*10);//0-9
				temp = box[0];
				box[0] = box[random];
				box[random]= temp;
				
			}
			while(true) {
				//화면출력
				System.out.println(" [보물 찾기 프로그램] ");
				for(int  i = 0; i <10; i++) {
					System.out.print(i+"\t");
					System.out.println();
				}//while for
				System.out.println("-----------------------------------------------------------------------------------");
				//정답화면 출력
				for (int i = 0; i < 10; i++) {
					System.out.print(arr[i]+"\t");
				}//for
				
				System.out.println();
				System.out.println("번호를 입력하세요");
				input = scan.nextInt();//번호를 받음
				
				// 입력된 번호 당첨여부 확인
				if(box[input]==0) {
					arr[input]="꽝!";
				}else if(box[input]==1) {
					arr[input]="1억";
				}else {
					arr[input]="2억";}
				
				
			}//while
			
			
		}//main
}//class
