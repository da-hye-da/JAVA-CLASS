package j0518;

import java.util.Iterator;
import java.util.Scanner;

public class C0518_07 {
public static void main(String[] args) {
	//1에서 100까지 랜덤 숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오.
	//10회까지 맞추기 가능
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1부터 100까지의 랜덤 숫자 맞추기");
	int random = (int)(Math.random()*100)+1;//1~100번까지의 숫자 /+1을 적는 이유는 숫자가 처음엔 0부터 시작하기 때문//
	
	//배열을 사용해서, 입력한 숫자를 모두 출력하시오.
	int[] num = new int[10];//
	
	//num에 배열 10개 생성
	
	for (int i = 0; i <10; i++) {//10대신 num.length를 써도 됌
		//1, 숫자 입력
		System.out.println((i+1)+"번째 입력입니다.");
		num[i] = scan.nextInt();//숫자를 입력 받아 변수에 넣기
		
		//2. 비교if
		if (num[i]==random) {//num과 random이 같으면
			System.out.println("정답!");
			break;
		} else {//num과 random이 다르면
			System.out.println("다시!");
		}//System.out.println(random); //random 숫자를 확인하고 싶으면 주석 지워서 프로그램 제대로 작동가능한지 확인하기
	}//for
	System.out.println("정답은 : "+random);

	
	System.out.println("내가 입력한 번호는 ");
	for (int i = 0; i < num.length; i++) {//배열 출력 위한 for 문
		System.out.printf(num[i]+" ");
		
	}
	
//	//for문
//	for (int i = 1; i <=10; i++) {
//		//1, 숫자 입력
//		System.out.println("원하는 숫자를 입력하세요");
//		int num =0;//입력할 숫자의 변수 선언
//		num = scan.nextInt();//숫자를 입력 받아 변수에 넣기
//
//		//2. 비교if
//		if (num==random) {//num과 random이 같으면
//			System.out.println("정답!");
//			break;
//			} else {//num과 random이 다르면
//			System.out.println("다시!");
//		}//System.out.println(random); //random 숫자를 확인하고 싶으면 주석 지워서 프로그램 제대로 작동가능한지 확인하기
//	}//for
	
}//main
}//class
