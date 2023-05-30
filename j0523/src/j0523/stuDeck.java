package j0523;

public class stuDeck {
	Student s = new Student("홍길동", 100, 100,100);
	
	void stuPrint() {
		s.kor = 50;
		//s.eng = 90;
		System.out.println(s.kor);
	}
}
