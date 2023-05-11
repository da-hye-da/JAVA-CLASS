package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class Class0511_09 {
	public static void main(String[] args) {
		//성적처리프로그램
		//1.이름 2.국어 3.영어 4.수학 합계, 평균은 자동으로 들어 갈 수 있도록 함
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];//한번 정해둔 배열은 프로그램이 진행되는 동안에는 변경할 수 없다
		
		for (int i = 0; i < avg.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i]= scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i]= scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i]= scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i]= scan.nextInt();
			//자동계산
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3;

		}
		
		//출력
		System.out.println("이름\t 국어\t 수학\t 영어\t 합계 \t 평균");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \n",name[i],kor[i],eng[i],math[i],total[i], avg[i]);
			
		}
		
//		System.out.println();
//		//변수 선언
//		String name ="";
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0;
//		double avg = 0;
//		
//		System.out.print("이름을 입력하세요.\n");
//		name = scan.next();
//		System.out.println("국어점수를 입력하세요");
//		kor = scan.nextInt();
//		System.out.println("수학점수를 입력하세요");
//		math = scan.nextInt();
//		System.out.println("영어점수를 입력하세요");
//		eng = scan.nextInt();
//
//		//자동계산
//		total = kor+eng+math;
//		avg = total/3;
//		
//		//출력
//		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
//		System.out.println("\t이름 \t 국어 \t 수학 \t 영어 \t 합계 \t 평균");
//		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
//		System.out.printf("\t%s \t %d \t %d \t %d \t %d \t %.2f \n" ,name, kor, math, eng, total, avg);
//		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
//			
	}//지역

}//전역