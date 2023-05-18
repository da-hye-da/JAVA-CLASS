package j0517;

public class Class0517_01 {

	public static void main(String[] args) {
		//객체 선언
		Card c1 = new Card();
		
		//사용방법 =>참조변수명.변수명
		c1.kind = "Heart";
		c1.number = 7;
		c1.width =  500; //c1의 높이를 바꿈 => c2의 높이도 바뀜
		c1.number = 25; //c1의 숫자를 바꿈 => c1의 숫자만 바뀜
		//static 변수의 사용여부에 따라 결과가 달라짐 (static변수는 공용으로 사용됌)
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		Card c3  = new Card();
		
		System.out.println("c1 카드 종류 : "+ c1.kind);
		System.out.println("c1 카드 숫자 : "+ c1.number);		
		System.out.println("c1 너비 : "+ Card.width);
		System.out.println("c1 높이 : " + Card.height); //static 변수를 사용하는 것은 공용명칭을 입력해주자.
		System.out.println();
		System.out.println("c2 카드 종류 : "+ c2.kind);
		System.out.println("c2 카드 숫자 : "+ c2.number);		
		System.out.println("c2 너비 : "+ c2.width);
		System.out.println("c2 높이 : " + c2.height);
		System.out.println();
		System.out.println("c3 너비 : "+c3.width);
	}//main
}//class

