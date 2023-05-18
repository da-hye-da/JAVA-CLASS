package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수를 입력받아 평균 점수가 90점 이상이면 A, 80점 이상이면 B, C, D, F..
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("성적을 입력하세요");
		System.out.println("===============================");
		System.out.println("국어 성적");
		kor = scan.nextInt();
		System.out.println("영어 성적");
		eng = scan.nextInt();
		System.out.println("수학 성적");
		math = scan.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.printf("A+등급. 당신의 평균 점수는 %.1f \n",avg);
			} else {
				System.out.printf("A등급. 당신의 평균 점수는 %.1f \n",avg);
			}

		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.printf("B+등급. 당신의 평균 점수는 %.1f \n",avg);
			} else {
				System.out.printf("B등급. 당신의 평균 점수는 %.1f \n",avg);
			}
		} else if(avg >=70) {
			if(avg>75) {
				System.out.printf("C+등급. 당신의 평균 점수는 %.1f \n",avg);
			}
			else {
				System.out.printf("C등급. 당신의 평균 점수는 %.1f \n",avg);
			}
		} else if(avg >=60) {
			if(avg>65) {
				System.out.printf("D+등급. 당신의 평균 점수는 %.1f \n",avg);
			}
			else {
				System.out.printf("D등급. 당신의 평균 점수는 %.1f \n",avg);
			}
		} else {
			System.out.printf("F등급. 당신의 평균 점수는 %.1f \n",avg);
		}
				
				
			
		

	}
}
