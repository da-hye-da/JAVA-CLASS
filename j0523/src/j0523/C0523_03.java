package j0523;

//import java.util.Scanner;

public class C0523_03 {
public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
	java.util.Scanner scan = new java.util.Scanner(System.in); //위에 주석을 대체하고 싶으면 이렇게 적어도 되나, 길다라는 단점.
	
	Card c = new Card("Space",1);
	
	Card c2 = null;
	Deck d1 = new Deck();
	
	//c2 = d1; //타입이 달라 넣을 수 없음
	
	Object o = null;
	o= d1;//조상과 자손이라는 관계가 맺어져서 가능
	
	c2 = c;// 같은 타입이라 넣을 수 있음
	
	int a =5;
	
	String str = null;
	//str =a ; //타입이 다르기에 넣을 수 없음
	
	System.out.println(c);
			
}//main
static void add() {
	
}

static void add(int x) {//오버로딩. 다른 메소드가 됨
	
}
}//class