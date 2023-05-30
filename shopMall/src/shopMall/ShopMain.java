//학생성적프로그램과 비슷함.
package shopMall;

public class ShopMain {
	public static void main(String[] args) {
		System.out.println("[ 삼성 쇼핑몰 ]");
		System.out.println("1. QLED TV 70인치");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("=====================================");
		System.out.println("구매 원하는 제품의 번호를 입력하세요");

		// id, pw
		Buyer b = new Buyer("hong", "홍길동", "길동스");
//		Tv t = new Tv();
//		b.buy(t);
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());

		// pc 구매하기
		Computer c = new Computer();
		b.buy(c);
		// b.buy(new Computer()); //위 두줄과 같은 내용

		// speaker 구매하기
//	Speaker s = new Speaker()
//	b.buy(s);
		b.buy(new Speaker());

		// washer 구매하기
//	Washer w = new Washer();
//	b.buy(w);
		b.buy(new Washer());

		System.out.println("=====================================");
		System.out.println("잔액 : " + b.money);
		System.out.println("구매 갯수 : " + b.count);

		System.out.println("포인트 : " + b.bonusPoint);
		System.out.println("=====================================");
		System.out.println("고객님의 주문 내역 목록입니다.");
		for (int i = 0; i < b.count; i++) {
			System.out.println("구매 목록 : "+ [i].productName);
		}
		System.out.println("=====================================");

		//구매 목록 메소드 호풀
		b.buyList();
		
		
//	System.out.println("nickName : "+b.nickName);
//	System.out.println("name : "+b.name);

	} // main

}// class
