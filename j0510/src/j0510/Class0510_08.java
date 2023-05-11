package j0510;

import java.util.Scanner;

public class Class0510_08 {
	public static void main(String[] args) {
		//――――――――――――――――――――――――――――――――――
		//랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하시오.
		Scanner scan = new Scanner(System.in);
		int random = 0;
		random = (int)(Math.random()*100)+1;
//		System.out.println(random);
		//숫자 맞추기 프로그램
		//10번
		int g = 1;
		while(g<=10) {
			System.out.println(g+"번째 숫자를 입력하세요");
			int input = scan.nextInt();
			if(input==random) {
				System.out.println("정답입니다");
			break;
			} else if(input>random) {
				System.out.println("오답입니다");
				System.out.println("입력한 수보다 작은 수입니다");
			} else {
				System.out.println("오답입니다");
				System.out.println("입력한 수보다 큰 수입니다");
			}
			g++;
		}
		//―――――――――――――――――――――――――――――――――
//		//초기화(-)
//		int f=0;
//		while(f<10) {
//			System.out.println(f);
//			f++;
//		}
		//――――――――――――――――――――――――――――――――――
		//i--, i-=1, i=i-1
		//i++, i+=1, i=i+2
//		for(int d=100; d>=0; d-=5) {
//			System.out.println(d);		
//		}
		//――――――――――――――――――――――――――――――――――
//		//반복문 - for, while
//		//――――――――――――――――――――――――――――――――――
//		//00 01 02 03 04.....09 10 11 ....99까지
//		//중첩(이중)반복문을 사용해서 출력하시오
//		for(int b = 0; b <=9; b++) {
//			System.out.println("첫 자리 : " + b);
//			for(int c=0; c<=9; c++) {
//				System.out.printf("%d%d\n",b,c);// 세로 한 줄 하는 방법
////				System.out.printf("%d%d ",b,c);// 가로 한 줄 하는 방법
//			}
//			System.out.println(); //하나의 숫자 끝날때마다 한 줄씩 띄는 법
//		}
		//――――――――――――――――――――――――――――――――――
//		//0~9까지 출력하시오
//		for(int a =0; a<=9; a++) {
//			System.out.println(a);
//		}
		//――――――――――――――――――――――――――――――――――
		//
		//――――――――――――――――――――――――――――――――――
		//중첩반복문-구구단
////		for(int m=1; m<=9; m++) {
////			System.out.println(m+" * "+m+" = "+(m*m));}
//		for(int n=2; n<=9; n++) {
//			System.out.println("[ 구구단 "+n+"단 ]");//"[ %d 단]\n" 으로 작성해도 가능
//			for(int o=1; o<=9; o++) {
//				System.out.printf("%d * %d = %d \n", n,o,n*o);
//			}
//			System.out.println();//단이 끝날때마다 비어있는 한 줄을 만들어준다
//		}
		//――――――――――――――――――――――――――――――――――
//		//단순반복문
//		//숫자를 3번 반복해서 입력받아, 합을 출력하시오
//		//1.변수선언 num, sum
//		//2.scan 1번선언
//		//3.반복문
//		//4.숫자입력 넣어줌
//		//5.sum 변수에 더하기 해줌
//		//6.sum을 출력
//		
//		int num = 0;
//		int sum = 0;
//		Scanner scan = new Scanner(System.in);// 처음부터 미리 작성후 시작해도 됌
//		for(int i = 1; i <= 3; i++) {
//			System.out.println(i+"번째 숫자를 입력하세요.");
//			num= scan.nextInt();
//			sum += num;}
//		System.out.println("입력한 3개의 숫자의 합계는 "+sum+"입니다.");
//		
		//――――――――――――――――――――――――――――――――――
//		int num = 0;
//		int sum = 0;
//		System.out.println();
//		for(num = 1; num <= 15; num++) {
//			sum += num;}
//		System.out.println("1부터 15까지의 숫자는 "+sum+"입니다.");
//		
//		//――――――――――――――――――――――――――――――――――
//		
//		for(int i = 1; i <= 15; i++) {
//			System.out.println(i);}
//			
//		int sum2 = 0;
//		int j=1;
//		for(j = 1; j <= 15; j++) {
//			sum2 = sum2 +j; //sum +=j; 와 같음
//		}
//		System.out.println("j의 합계는:"+sum2); //출력되는 i의 값을 모두 더하고 싶을때
//		
//		int sum3 = 0;
//		int k=1;
//		for(k = 1; k <= 15; k++) {
//			sum3 = sum3 +j; //sum +=j; 와 같음
//		}
//		System.out.println("k가 "+(k-1)+"이면 총 합계는:"+sum3);
	}//지역

}//전역
