package j0518;

public class C0518_10 {
	
	int iv; //인스턴스 변수
	static int cv;//클래스 변수

	void i_Method() {
		System.out.println(iv);
		System.out.println(cv);
	}
	static void c_Method() {
		C0518_10 c2 = new C0518_10();
		System.out.println(c2.iv);
		System.out.println(iv);//static이 필요함 so. 윗의 두줄처럼 써야하므로 사용하지 않는다.
		System.out.println(cv);
	}
	
	public static void main(String[] args) {
		C0518_10.cv = 50; //클래스명.변수명  같은 클래스이기 때문에 C0518_10는 생략 가능
		System.out.println(cv);
		
		C0518_10 c = new C0518_10();
		c.iv =100;
		System.out.println(c.iv);
		
		
	
}//main
}//class
