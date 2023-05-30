package j0525;

import java.util.ArrayList;

public class C0525_02 {
	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		
		//퀴즈 1
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[0],2);
//		Card c3 = new Card(Card.kinds[0],3);
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
		
//		list.add(new Card(Card.kinds[0],1));
//		list.add(new Card(Card.kinds[0],2));
//		list.add(new Card(Card.kinds[0],3)); //이렇게 쓰면 6줄짜리가 3줄로 줄어들음
//		list.add(new Card(Card.kinds[0],4));
//		list.add(new Card(Card.kinds[0],5));
//		list.add(new Card(Card.kinds[0],6));
//		list.add(new Card(Card.kinds[0],7));
//		list.add(new Card(Card.kinds[0],8));
//		list.add(new Card(Card.kinds[0],9));
//		list.add(new Card(Card.kinds[0],10));
//		list.add(new Card(Card.kinds[0],11));
//		list.add(new Card(Card.kinds[0],12));
//		list.add(new Card(Card.kinds[0],13));
		
		
		
		//퀴즈 1 - 1,13
//		for (int i = 0; i < 13; i++) {
//			list.add(new Card(Card.kinds[0],i+1));;
//		}
//		System.out.println("==============================");
//		//출력
//		for (int i = 0; i < 13; i++) {
//			System.out.println(list.get(i).kind+", "+Card.numbers[list.get(i).number]);//Card의 numbers 가져오는 방법(static이 붙어 있어서) = 클래스명.변수명쓰고 []안에 내용 적기
//			
//		}
		
		
		//퀴즈 2 - 카드 4개를 만들어서, 4가지 종류를 넣으시오.
//		for (int i = 0; i < 4; i++) {
//			list.add(new Card(Card.kinds[i],1));
//		}
//		System.out.println("==============================");
//		for (int i = 0; i < 4; i++) {
//			System.out.println(list.get(i).kind+", "+list.get(i).number); 
//		}
		
		//퀴즈 3 - 카드 52장을 만들어서 SPACE 13장, HEART 13장, DIAMOND 13장, CLOVER 13장 숫자로 1로 넣으시오
		for (int i = 0; i < 52; i++) {
			list.add(new Card(Card.kinds[i/13],i%13+1));
		}
		System.out.println("==============================");
		for (int i = 0; i < 52; i++) {
			System.out.println(list.get(i).kind +", "+Card.numbers[list.get(i).number]);
			
		}
			
	}
}
