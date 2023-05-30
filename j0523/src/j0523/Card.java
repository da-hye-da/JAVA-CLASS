package j0523;

public class Card {
	
	static String[] shape = {"Space","Heart","Diamond","Clover"};
	static String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"}; //0은 일부러 입력
	
	String kind;// 무늬 - 4가지 space, heart, diamond, clover
	int number;//숫자 - 1~10, 11(j),12(q),13(k)
	
	
	Card() {
		this("Space",1);//다른생성자 호출
	}
	Card(){
		this.kind = kind;
	}
	Card(){}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
