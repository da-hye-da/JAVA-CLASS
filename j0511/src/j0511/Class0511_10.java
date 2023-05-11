package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class Class0511_10 {
	public static void main(String[] args) {
		
		//시험!!
		//1.성적입력
		//2.성적출력
		//3.성적수정
		//0.프로그램종료
		Scanner scan = new Scanner(System.in);
		int input = 0; //번호선택
		int count = 0; //입력된 학생 수
		
		//성적입력 변수
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		while(true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("――――――――――――――――――――――――――");
			System.out.println("   원하는 번호를 입력하세요");
			System.out.println("――――――――――――――――――――――――――");
			input = scan.nextInt();
			
			switch(input) {
			case 1:// 성적입력
				for (int i = 0; i < name.length; i++) {
					System.out.println("이름을 입력하세요.(0. 이전페이지로 이동)");
					name[i]= scan.next();
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break;
					}//if
					System.out.println("국어점수를 입력하세요");
					kor[i]= scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i]= scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					math[i]= scan.nextInt();
					//자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3;
				count++;
				}// case1 for
					break; //switch
				case 2:
					//출력
					System.out.println("――――――――――――――――――――――――――――――");
					System.out.println(" 이름\t국어\t수학\t영어\t합계\t평균");
					System.out.println("――――――――――――――――――――――――――――――");
					for (int i = 0; i < count; i++) {
						System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \n",name[i],kor[i],eng[i],math[i],total[i], avg[i]);
					}//case2 for
					break;
			}//switch
		}//while
	}//전역
}//지역