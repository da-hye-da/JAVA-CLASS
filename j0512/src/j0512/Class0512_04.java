package j0512;

import java.util.Iterator;
import java.util.Scanner;

public class Class0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램
		
		//변수선언
		int temp=0;//임시저장변수
		int random=0;//랜덤변수
		int count=0;//당첨개수

		//1. 배열생성-45개
		int[] mynum = new int[6]; //내가 입력할 숫자
		int[] lotto = new int[45];//로또 숫자개수
		int[] lottonum = new int[6];//당첨 숫자개수
		
		//2. 로또번호생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]= i+1;
		}
		//3. 번호섞기
		for (int i = 0; i < 999; i++) {
			random = (int)(Math.random()*45);//인덱스 0~44 랜덤번호(총 45개)
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		
		}
		//4. 로또번호 입력
			for (int i = 0; i < 6; i++) {
				System.out.println("인생역전!!"+(i+1)+"번째 숫자를 입력하세요");
				mynum[i] = scan.nextInt();
			}
		//5. 로또번호확인
			for (int i = 0; i < 6; i++) {//로또 당첨번호 갯수
				for (int j = 0; j < 6; j++) {// 내가 적은 로또번호 갯수
					lottonum[count]= lotto[i];
					count++; //당첨갯수 증가
					continue;
			}//5번 for j
			}//5번 for i
		//6. 로또번호출력
			System.out.println("당첨 번호 출력 : ");
			for (int i = 0; i < 6; i++) {
				System.out.println(lottonum[i] +" ");
			}
		//7. 입력번호출력
			System.out.println("입력 번호 출력 : ");
			for (int i = 0; i < 6; i++) {
				System.out.println(mynum[i] +" ");
				
			}
		//8. 당첨번호출력
			System.out.println("당첨갯수 : "+ count);
	}//main
}//class
	