package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class Class0515_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int random = 0;
		int temp = 0;
		int count = 0;
		int[] mynum = new int[6];//내가 입력할 6개의 숫자
		int[] lottonum = new int[6];//

		//배열 -45개
		int[]arr = new int[45];//45개
		//1~45
		for (int i = 0; i < arr.length; i++) {//0~44(45개)
			arr[i] = i+1;
		}//1~45
		
		//섞기
		for (int i = 0; i < 1000; i++) {//1000번 섞기
			random = (int)(Math.random()*45);
			temp= arr[0]; //a = b
			arr[0] =arr[random]; //b=c
			arr[random] = temp;//c= a 이렇게 섞기
		}//섞기 for
			
			
		// 번호입력
			for (int i = 0; i < mynum.length; i++) {//mynum.length 자리에 6을 입력해도가능
			System.out.println("숫자 "+(i+1)+"번째 입력하기");
			mynum[i] = scan.nextInt();
			
			}//번호입력 for
		
		// 맞춘 개수
			
			//맞춘 개수 출력
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j< 6; j++) {
					if(arr[i]==mynum[j]) {
						lottonum[count] = arr[i];
						count++;
						continue;
					}//if
				}// j for
			}//i for
			
			// 로또 번호 출력
			System.out.println("로또번호 출력 : ");
			for (int i = 0; i < 6; i++) {
				System.out.print(arr[i]+" \t");
			}
			System.out.println();
			
			// 로또 번호 입력
			System.out.println("입력번호 출력 : ");
			for (int i = 0; i < 6; i++) {
				System.out.print(mynum[i]+" \t");
			}
			System.out.println();
		//로또 맞춘 번호 출력
			System.out.println("맞춘 번호 출력");
			for (int i = 0; i < count; i++) {
				System.out.print(lottonum[i]+"\t");
			}
			System.out.println();
			
			System.out.println("맞춘 갯수 : "+count+"개");
		
	}//main
}//class
