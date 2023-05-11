package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class Class0511_08 {
	public static void main(String[] args) {
		//랜덤숫자맞추기
		//10번의 기회 후 정답 출력하기
		Scanner scan = new Scanner(System.in);

		int input=0; //입력받은 변수
		int random=0; //랜덤숫자 저장변수
		int count =0; //도전횟수
		int[] num = new int[10];// 입력한 숫자 저장
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 : "+random);
		
		while(true) {
			//몇번 도전했는지 확인
			
			if(count>=10) {
				System.out.println("10번을 도전했습니다. 프로그램을 종료합니다.");
				break;
			}
			System.out.println(count+1+"번째 숫자를 입력하세요.>>");
			num[count] = scan.nextInt();
			if(num[count]==random) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다. 다시 도전하세요");
			}
			count++;
		}
		//입력한 숫자 출력
		System.out.println("정답 : "+random);
		for (int i = 0; i <count; i++) {
			System.out.println((i+1)+"번째 입력한 숫자 : " + num[i]);
//			System.out.printf(num[i]+" ");
		}
	}
		}