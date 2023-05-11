package j0510;

import java.util.Scanner;

public class Class0510_03 {
	public static void main(String[] args) {
		
		//m,f문자로 입력받아 m이면 남자입니다, f면 여자입니다를 출력하세요
		String input = "";//객체, 기본형타입만==가능
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 영문으로 입력하세요");
		input = scan.next();//문자열을 입력받음
		if(input.equals("m")||input.equals("M")) {
			System.out.println("남자입니다");
		} else if (input.equals("f")||input.equals("F")){
			System.out.println("여자입니다");
		} else
			System.out.println("다른 문자를 입력하셨습니다 다시 입력하세요");
		
		//다혜가 작성한거
//		char input = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성별(M 또는 F)을 입력하세요");
//		input = scan.next().charAt(0);
//		if(input == 'm' || input == 'M') {
//			System.out.println("남성입니다");
//		}
//		else if(input == 'f'|| input == 'F') {
//				System.out.println("여성입니다");
//		}
//		else {
//			System.out.println("정확하게입력해주세요");
//			}
		
		
		//――――――――――――――――――――――――――――――――――――――
		//입력한 숫자가 1,6,9만 입력받아 1,6,9만 출력하시오
		//if() else if() else 하나의 변수에는 하나의 값만 입력 가능
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
//		if(input ==1) {
//			System.out.println(1);
//		} else if(input ==6) {
//			System.out.println(6);
//		} else {
//			System.out.println(9);
//		}
		//――――――――――――――――――――――――――――――――――――――
		//점수를 입력 받아 60점 이상이면 합격, 60점 미만이면 불합격 출력하기
		//1.변수 선언 2.scan후 변수입력 3.비교 4.출력
//			int score = 0;
//			Scanner scan = new Scanner(System.in);
//			System.out.println("점수를 입력하세요.");
//			score = scan.nextInt();
//			if(score >= 60) {
//				System.out.println("축하! 합격입니다!!");
//			} else {
//				System.out.println("에고, 불합입니다TT");
//			//if
		}

	private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}//main
}//class
