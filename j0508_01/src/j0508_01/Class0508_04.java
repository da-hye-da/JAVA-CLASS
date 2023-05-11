package j0508_01;

public class Class0508_04 {
	
	public static void main(String[] args) {
		long num = 2; //long 타입보다 낮은 타입은 숫자가 형 변환이 되므로 num 안으로 들어감
		long num2 = 0L; // 되도록 L을 넣어서 쓰는 습관을 들여보자
		char ch = 'A';
		//char ch2 = 'AB';
		String str1 = "";
		
		String str2 = "a" + "b";
		System.out.println(str2);
		
		int num3 = 7;
		int num4 = 7;
		String num5 = "7"; //문자열로 인식함
		System.out.println(num3 + num4); //14
		System.out.println(num3 + num4 + num5); //147
		System.out.println(num5 + num4 + num3); //777 문자열의 위치(앞 또는 뒤)에 따라 결과 값이 달라짐
		
		System.out.println("결과값 : "+num3+num4); // 결과값 : 77
	}

}
