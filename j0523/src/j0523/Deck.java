package j0523;

import java.util.Iterator;

public class Deck {
	// 52개 카드 생성
	Card[] c = new Card[52];// 배열 선언, 4종류 *13 = 52장

	// 기본생성자 만들기 : 클래스와 이름이 같고, void가 없어야한다.
	Deck() {
		// kind =null;, number =0; //space 1 space 2 space 3 ... clover 13번까지 들어가야 한다.
		// Space :1~13, Heart :1~13, Diamond :1~13, Clover :1~13

		for (int i = 0; i < 52; i++) {
			c[i] = new Card();// 객체 선언
			c[i].kind = c[i].shape[i / 13]; // 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,....//i%13
			c[i].number = (i % 13) + 1;// 1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5...
		} // for

	}// deck

	// 카드 뽑기
	Card pick (int index) {//0~51
		   return c [index];
		   
	}
		   //0-51
		   void shuffle() {
			   for (int i = 0; i < 1000; i++) {
			   int random = (int)(Math.random()*51);
			   Card temp = null;
			   temp= c[0];
			   c[0]= c[random];
			   c[random] = temp;
			   }
			   
		   }
//		   for (int i = 0; i < 52; i++) { //13,26,39,52
//			   c[i] = new Card();
//		}		//공간 생성
			
}
