//		문제: 성적 입력 기능을 완성하고, 학생들의 성적을 입력받아서 저장하는 프로그램을 작성하시오.
//
//		요구사항:
//		사용자로부터 학생 이름, 국어 점수, 영어 점수, 수학 점수를 입력받아 저장한다.
//		최대 3명의 학생 성적을 입력받을 수 있다.
//		학생 이름을 입력하는 도중에 "0"을 입력하면 이전 페이지로 돌아간다.
//		입력받은 성적은 총점과 평균으로 자동 계산되어 저장된다.
//		
package j0511;

import java.util.Scanner;

public class Class0511_13 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
// 변수선언		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];		
		int count=0, num =0, input=0; 

		
		while(true) {
//초기화면구성
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("0. 종료");
		System.out.println("번호를 입력하세요.");
		input = scan.nextInt();
		//0이면 종료
		if (input==0) {
			System.out.println("종료합니다");
			break;
		}
			
		switch(input) {
		case 1:
//최대 3명까지 반복해서 입력가능			
			for(int i = 0; i <name.length; i++) {
				
//사용자 이름,점수 입력		
				System.out.println("이름을 입력하세요");
				name[i] = scan.next();
				System.out.println("------------------");
				System.out.println("국어점수를 입력하세요");
				kor[i] = scan.nextInt();
				System.out.println("영어점수를 입력하세요");
				eng[i] = scan.nextInt();
				System.out.println("수학점수를 입력하세요");
				math[i] = scan.nextInt();
//합계, 평균
				total[i] = kor[i]+eng[i]+math[i];
				avg[i] = total[i]/3.0;
				count++;
			}//case1 for
			break;
//결과 출력
		case 2:
			System.out.println("  이름\t국어\t영어\t수학\t합계\t평균");
			System.out.println("------------------------------------");
//입력한 학생수 만큼 결과를 반복해서 출력			
			for (int i = 0; i < count; i++) {				
				System.out.printf("   %s \t %d \t %d \t %d \t %d \t %.2f \n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			}//case2 for
			break;
		}//switch
		System.out.println("종료합니다");
//출력
		}//while
		
		
	}//지역
}//전역