package j0518;

import java.util.Scanner;

public class C0518_08 {
	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("  로또 번호 맞추기  ");
		System.out.println("=====================");
		// 로또 맞추기
		// 1부터 45까지 숫자 입력하기
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45]; // 로또 갯수
		int[] myNum = new int[6]; // 내가 적은 숫자 갯수
		int[] myLotto = new int[6]; // 로또 당첨 숫자
		// 1~45번까지 숫자를 lotto에 넣어보세요
		// for

		for (int i = 0; i < 45; i++) {
			// lotto[0] =1, lotto[1]=2, lotto[2] =3, .... lotto[44]=45
			lotto[i] = i + 1;
		} // 입력 for

		// 로또 섞기
		int temp = 0; // 임시 저장 변수
		// for 0~1000까지
		for (int i = 0; i <= 1000; i++) {// 천번 섞기
			int random = (int) (Math.random() * 45); // 45개의 숫자를 랜덤으로
			temp = lotto[0]; // temp에 lotto의 0번째를 입력
			lotto[0] = lotto[random];// lotto에 0번째에 lotto random을 입력하고
			lotto[random] = temp; // lotto random에 temp를 입력하기
		} // 1000번 섞기 

		// 내가 입력한 로또 숫자 6개
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"번째 로또 번호를 입력하세요");
			myNum[i] = scan.nextInt(); // [](배열)안의 숫자를 i갯수만큼 여러번 실행하겠다는 의미
		}

		// 당첨된 번호 입력
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == myNum[j]) {
					myLotto[count] = lotto[i];
					count++;
					break;//같은 숫자가 나타나면 그 다음 숫자와는 비교하지 않아도 되니 다음 중괄호로 넘어감.안 적어도 되긴 함(출력속도에 차이가 조금 있을 수 있음)
				}
			}
		}//입력 for

		// 당첨된 번호 출력
		System.out.println("=====================");
		System.out.println("내가 입력한 번호");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println("당첨된 로또 번호");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");

		} // 출력 for
		
		

	}// main
}// class
