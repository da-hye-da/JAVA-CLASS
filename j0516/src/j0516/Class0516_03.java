package j0516;

public class Class0516_03 {
	
	//메소드
	public static void main(String[] args) { 
		
		//변수 선언
		int a = 0;
		String str = new String();//객체 선언./ string 처럼 앞글자가 대문자 인 것은 class 
		String s = "";//new라는 참조 변수를 적은 윗줄처럼 작성해야 하지만 String(배열포함)은 자주 사용하게 되면서 예외처리가 되어 있음
		
		//객체 선언
		Tv t = new Tv();
		
		t.color= "white";
		System.out.println(t.color);
		
		//객체 선언
		Tv t2 = new Tv();
		t2.color = "red";
		System.out.println(t2.color);
		// Tv t 와 Tv t2는 각자의 객체
		
		
	}// main
}// class
