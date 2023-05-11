package j0508_01;

public class Class0508_01 {

	public static void main(String[] args) {
		
		boolean temp = true;
		boolean temp2 = false;
		boolean temp3;
		temp3 = true; //주석 만드는 방법은 슬래시 두번 입력~_~
		
		char ch1 = ' '; //공백 없이는 사용 불가한 문자형 타입
		char ch2 = 'a';
		char ch3 = 'A';
		char ch4 = 't';
		//char ch5 = " "; "" 사용불가
		
		byte num1 = 1;
		//byte num3 = 256; // 127까지 숫자표현가능
		short num2 = 10;
		//short num4 = 32768; // 32767까지 숫자표현 가능
		
		int num5 = 21;
		//int num6 = 2147483648; //2147483647까지 숫자표현 가능
		long num7 = 21;
		long num8 = 2147483648L; //2147483648부터는 숫자 끝에 접미사 L,l 작성 필요(L은 대소문자상관없음)
		
		float num9 = 9.8765432f; //실수형 8자리까지 정밀도 표현 가능
		float num10 = 9.87654321000000f; //초과시 에러가 나진 않지는 않지만 정확도 떨어질 수 있음, 단 접미사 F,f를 미작성시 에러 발생
		
		double num11 = 1.123456789012345; //실수형 16자리까지 정밀도 표현가능 숫자 뒤에 d 작성해도 되나 미작성해도 됌
		
		
		// 문자열 - class 일때 대문자 표현
		String str1 = new String("abc");
				
		char str3 = ' ';
		String str4 = "";
		
		// 변수
		int score = 100;
		score = score + 200; // score 300이라는 값이 들어감.
				
		// 상수(상수는 항상 대문자로 작성함)
		final int SCO = 100;
		//SCO = 200; // 상수는 값을 변경할 수 없음
	}
	
}
