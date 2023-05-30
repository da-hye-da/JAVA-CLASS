package j0525;

import java.util.ArrayList;
import java.util.Iterator;

public class C0525_01 {
	public static void main(String[] args) {
		// 객체선언

		Card[] c = new Card[4];

		Card c1 = new Card(Card.kinds[0], 1);
		Card c2 = new Card(Card.kinds[1], 2);
		Card c3 = new Card(Card.kinds[2], 3);
		Card c4 = new Card(Card.kinds[3], 4);

		c[0] = c1;// Card[]c = new Card[3];으로 쓰면 프로그램상 문제는 없으나 실행시키면 오류가 나옴 so. 진행이 안됨
		c[1] = c2;
		c[2] = c3;
		c[3] = c4;

		ArrayList<Card> list = new ArrayList();
		// ArrayList 추가
		list.add(c1);// 0 // Object o= new Card(Card.kinds[1],1)
		list.add(c2);// 1
		list.add(c3);// 2//list.메소드(매개변수)
		list.add(c4);// 3

		// ArrayList 읽기
//	list.get(0);//c1을 읽어옴 //object라 형 변환을 시켜주어야 함
//		Card card = (Card) list.get(0);
//	System.out.println(c1);
//	System.out.println(list.get(0));//두 줄 모두 같은 주소를 가짐(=같은 곳을 바라보고 있음)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + ", " + list.get(i).number);
		}
		System.out.println("개수 : " + list.size());

//	list.remove(2);
//	list.remove(1);

		System.out.println("=================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + ", " + list.get(i).number);
		}
		System.out.println("=================================");
		// 퀴즈. list 안에 kind-HEART 삭제하시오
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).kind.equals("HEART")) {
				list.remove(i);
			}
		}
		// 퀴즈. list 안에 number-4 삭제하시오
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).number == 4) {
				list.remove(i);
			}

		}

//		System.out.println("=================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + ", " + list.get(i).number);
		}
		System.out.println("=================================");
		System.out.println("개수 : " + list.size());
		System.out.println("프로그램 종료");
	}//
}
