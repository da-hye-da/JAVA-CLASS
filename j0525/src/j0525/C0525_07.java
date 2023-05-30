package j0525;

import java.util.Scanner;

public class C0525_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num1 = scan.nextInt();
			System.out.println("숫자를 입력하세요");
			int num2 = scan.nextInt();
			
			try {
				System.out.println("나누기 : " +(num1/num2));
				
			} catch (IndexOutOfBoundsException e) { //Exception, ArithmeticException입력해도됌 but, IndexOutOfBoundsException으로 입력시 진행이 유지되지 않음
				System.out.println("프로그램에 오류가 있어 다시 실행됩니다.");
				e.printStackTrace();//무슨 예외처리를 했는지 확인 가능
				
			}
		}
	}
}
