 package j0518;

import java.util.Scanner;

public class C0518_01 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	
	//5! = 5 * 4 * 3* 2 * 1;
	//10! = 10 * 9 * 8 * 7 ..... * 1;
	//for문으로 해보세요
	//숫자를 입력받아 해당되는 팩토리얼을 구현하시오
	int input =1;
	int num = 1;
	System.out.println("원하는 숫자를 입력하세요");
	input = scan.nextInt();
	
	for (int i = input; i >=1; i--) {
		num = num * i;
//		System.out.println("num : " +num);
	}
	System.out.println("결과값 : " +num);
	
	
//	for (int i = 5; i >=1; i--) {
//		num = num*i;
////		System.out.print(num +" ");
//	}
//	System.out.println();
//	System.out.println("결과값 : "+num);
//	
	
	
	
		
//	//1-10까지 합을 구하시오. =>55
//		int sum = 0;
////		Scanner scan = new Scanner(System.in);
//		
//		for (int j = 1; j <= 10; j++) {			
//			sum +=j;
//			System.out.print(j+" ");
//		}
//		System.out.println();
//			
//	//1-100까지 합을 구하시오. => 5050
//		int sum_2=0;
//		for (int k = 1; k < 101; k++) {
//			sum_2+=k;
//			System.out.print(k+" ");
//		}
//		System.out.println();
//	//1-1000까지 합을 구하시오. => 500500
//		int sum_3 = 0;
//		for (int l = 0; l < 1001; l++) {
//			
//		}
//		
	
			
}
}//class
