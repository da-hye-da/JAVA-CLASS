package j0511;

import java.util.Scanner;

public class Class0511_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=0, num1=0, num2=0, sum=0;
		
		while(true) {//무한반복
			System.out.println("1.더하기");
			System.out.println("2.곱하기");
			System.out.println("――――――");
			System.out.println("원하는 번호를 입력하세요");
			input = scan.nextInt();
			if(input ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		switch(input) {
		case 1:
			while(true) {
			System.out.println("첫번째 숫자를 입력하세요.");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			num2 = scan.nextInt();
			System.out.printf("결과값 : %d + %d = %d \n"+num1,num2,num1+num2);
			break;
		}
			
		}
		}

		//구구단 5단 빼고 출력하시오
//		loop:for (int i = 2; i <=9; i++) {
////			System.out.println(i);
//			if(i%2 ==0) continue;//2로 나눠지는것이면 제외 후 진행
//			for (int j = 1; j <=9; j++) {
//				if(j==5) break loop;//break;(해당숫자부터 중단)continue;(해당숫자만 제외하고 진행)
//				System.out.println(i+" * "+j+" = "+(i*j));
//				} //if
//			} System.out.println();
//		}
//		for (int i = 0; i <=10; i++) {
////			if(i%2 ==1) { // (i를 2로 나눠서 나머지가 1인 것)해당되면 제외하고 출력
//			if(i ==5) {// (i가 5인것)해당되면 제외하고 진행
//				continue;
//			}//if
//			System.out.println(i);
//
//			
//		}//for
	}//지역
}//전역
