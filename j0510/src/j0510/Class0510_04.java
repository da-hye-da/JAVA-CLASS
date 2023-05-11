package j0510;

import java.util.Scanner;

public class Class0510_04 {
	public static void main(String[] args) {
		
		//m,f를 입력받아 m는 남자, f는 여자라고 출력하시오
		char gender = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 영문으로 입력하세요");
		gender = scan.next().charAt(0);
		switch(gender) {
		case 'm': case 'M':
			System.out.println("남성");
			break;
		case 'f':
		case 'F':
			System.out.println("여성");
			break;
		default:
			System.out.println("정확한 성별을 입력해주세요");
			break;
		}
		//―――――――――――――――――――――――――――――――――――――――
//	int input = 0;
//	Scanner scan = new Scanner(System.in);
//	System.out.println("숫자를 입력하세요.");
//	input = scan.nextInt();
//	
//	//switch() //if문은 반복문이므로 속도가 느림 switch문이 더 빠름. 크기비교(크다,작다)는 불가
//	switch(input) {
//	
//	case 1:
//		System.out.println("1");
//		break;//스위치문은 케이스를 만나 브레이크를 통해 문장이 종료됨
//	case 6:
//		System.out.println("6");
//		break;
//	case 9:
//		System.out.println("9");
//		break;
//	default:
//		System.out.println("원치 않는 숫자입니다");
//		break;
//	}
//	//switch
//	if(input==1) {
//		System.out.println("1");
//	} else if(input==6) {
//		System.out.println("6");
//	} else if(input==9) {
//		System.out.println("9");
//	} else {System.out.println("원치 않는 숫자입니다");}
	
//	
}//2
}//1
