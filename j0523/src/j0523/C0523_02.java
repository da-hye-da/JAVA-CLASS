package j0523;

public class C0523_02 {
 public static void main(String[] args) {
	Card[]c= new Card[52];//배열선언
	///Space, Heart, Diamond, Clover;
	Deck d = new Deck();
	d.pick(5);
//	System.out.println(d.pick(5).kind);
//	System.out.println(d.pick(16).kind);
//	System.out.println(d.pick(51).kind);
	
	//카드 뽑기 메소드 = d.pick(번호)
//	System.out.printf("%s, %d \n",d.pick(51).kind, d.pick(51).number);

	//카드 섞기
	d.shuffle();
	

//	for (int i = 0; i <52; i++) {
//		c[i] = new Card();//객체 선언
//		c[i].kind = c[i].shape[i/13]; //0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,....//i%13
//		c[i].number = (i%13)+1;//1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5...
//	}
	
	//출력하시오
	for (int i = 0; i <52; i++) {
	
		System.out.printf("%s, %s \n", d.c[i].kind,Card.numbers[d.c[i].number]);//Card창에 일부러 0을 입력하지 않으면 number-1를 해야 함..
	}
}
}
