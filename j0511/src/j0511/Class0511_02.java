package j0511;

import java.util.Scanner;

public class Class0511_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	//무한반복 while
	//for은 while에서 조건을 걸어서 해당하는 부분만 출력함
	
	//무한반복
	for(;;) {
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		if(num==0) {
			//프로그램을 종료
			System.out.println("프로그램을 종료합니다.");
			break;}
		}
	}
}
//	}
	
//	//무한반복
//	while(true) {
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num==0) {
//			//프로그램을 종료
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}