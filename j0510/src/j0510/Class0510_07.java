package j0510;

import java.util.Scanner;

public class Class0510_07 {
	public static void main(String[] args) {
		
		int input = 0;
		int random7 = (int)(Math.random()*10)+1;
		//숫자를 입력 받아 같은 값일 경우 당첨, 그렇지 않을 경우 낙첨을 출력하시오
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인생은 한방!숫자를 입력하세요");
		input = scan.nextInt();
		
		if(random7==input) {
			System.out.println("당첨");
		} else
			System.out.println("낙첨");
		System.out.println("랜덤숫자 : "+random7);
		System.out.println("입력숫자 : "+input);
	
		
		//――――――――――――――――――――――――――――――――――――――――――――――――
//		//랜덤 숫자
//		System.out.println((int)(Math.random()*10)+1);
//		//랜덤 숫자
//		int random = 0;
//		random = (int)(Math.random()*10); // 0~9까지(0부터 10미만)
//		System.out.println(random);
//		//랜덤 숫자
//		double random2 = 0;
//		random2 =Math.random()*1; // 0~0.99999999999까지(0부터 1미만)
//		System.out.println(random2);
//		//랜덤 숫자
//		double random3 = 0;
//		random3 =(Math.random()*15)+1; // 1~14.99999999999까지(1부터 14미만)
//		System.out.println(random3);
//		//랜덤 숫자
//		double random4 = 0;
//		random4 =(int)(Math.random()*15)+1; // 1~15.0까지(1부터 16미만)
//		System.out.println(random4);
//		//랜덤 숫자
//		int random5 = 0;
//		random5 =(int) (Math.random()*15+6); // 6~20까지(6부터 21미만)
//		System.out.println(random5);
	}
}
