//중요!! 초기화(인스턴스/지역 변수)!!
package j0522;

public class C0522_07 {
	
	int x;//인스턴스 변수 //인스턴스 변수는 초기화하지 않아도 자동으로 실행됨
	int y =x;//인스턴스 변수 
	char ch;
	String str;//변수 선언하는 것은 모두 초기화임. 위의 한줄한줄이 각각 초기화하는 것이다.
	
	public static void main(String[] args) {
		int a=0;// int =a 으로만 쓰면 에러가 남, 지역변수는 초기화하지 않으면 에러가 감. so, int a=0;로 적어서 초기화를 해줘야 함
		int b=a;
		
		//a, b, x, y를 출력하시오

	System.out.println("a,b,x,y");
	System.out.println(a);
	System.out.println(b);
	System.out.println();
	//x와 y를 쓰기위해 class를 객체 선언
	//객체 선언 후 참조변수명.변수명
	C0522_07 c = new C0522_07();
	System.out.println(c.x);
	System.out.println(c.y);
	System.out.println("ch: "+c.ch);
	System.out.println("str: "+c.str);// 빈공백이라는 의미로 null이 출력됨(데이터는 없는 상태)
	}//main
}//class
