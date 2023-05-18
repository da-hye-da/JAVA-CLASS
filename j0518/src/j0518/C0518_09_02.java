package j0518;

import java.util.Scanner;

public class C0518_09_02 {
	public static void main(String[] args) {
		// 자판기 프로그램
		//1. 밀크커피-300 2. 헤이즐럿커피-500 3. 블랙커피-350 4. 코코아-300 5. 우유-400 6. 잔액충전
		Scanner scan = new Scanner(System.in);
		int myMoney = 1000; //소지중인 잔액
		loop: while(true) {//무한루프
			System.out.println("=================================");
			System.out.println(" [ 학교다방 자판기 ] ");
			System.out.println("1. 밀크커피-300");
			System.out.println("2. 헤이즐럿커피-500");
			System.out.println("3. 블랙커피-350");
			System.out.println("4. 코코아-300");
			System.out.println("5. 우유-400");
			System.out.println("6. 잔액충전");
			System.out.println("0. 프로그램 종료");
			System.out.println("=================================");
			System.out.printf("  현재잔액 >> %,d원\n",myMoney);
			System.out.println("=================================");
			System.out.println("원하는 번호를 입력하세요");
			System.out.println("=================================");
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				myMoney = order(myMoney,300,"밀크커피");				
				break;
				
			case 2:
				myMoney = order(myMoney,500,"헤이즐럿커피");
				break;
				
			case 3:
				myMoney = order(myMoney,350,"블랙커피");
				break;
				
			case 4:
				myMoney = order(myMoney,300,"코코아");
				break;
				
			case 5:
				myMoney = order(myMoney,400,"우유");
				break;
				
			case 6:
				System.out.println("잔액을 충전합니다. 충전금액을 입력하세요");
				int temp = scan.nextInt(); //충전할 금액
				if(temp >0) {
					System.out.println("결제수단 : 1.카드");
					System.out.println("결제수단 : 2.현금");
					System.out.println("결제수단 : 3.애플페이");
					
					choice = scan.nextInt();
					if (choice ==1) {
						myMoney += temp;
						System.out.println("카드 결제가 완료되었습니다");
						System.out.printf("충전된 금액: %,d원\n" ,temp);
						System.out.printf("현재 잔액: %,d원\n", myMoney);
						System.out.println();
					} else if(choice==2) {
						myMoney += temp;
						System.out.println("현금 결제가 완료되었습니다");
						System.out.printf("충전된 금액: %,d원\n" ,temp);
						System.out.printf("현재 잔액: %,d원\n", myMoney);
					} else {
						System.out.println(" [잘못된 번호를 입력하였습니다. 다시 실행해 주세요.] ");
						System.out.println();
					}	
				}
				
				break;
			case 0:
				System.out.println(" [ 프로그램 종료 ] ");
				System.out.println();
				break loop;
			}}//switch
		
	}//main
	
	//음료 제조 메소드
	static int order(int myMoney, int price, String title) {//클래스 메소드
		
		if(myMoney>=price) {
			System.out.println(title+"가 자동으로 나옵니다");
			myMoney = myMoney - price;//
			} else {
				System.out.println("=================================");
				System.out.println("잔액이 부족합니다. 잔액을 충전하세요");
			}
		return myMoney;
	}
}//class
