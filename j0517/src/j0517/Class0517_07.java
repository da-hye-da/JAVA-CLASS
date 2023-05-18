package j0517;

public class Class0517_07 {

	public static void main(String[] args) {

		// static 붙이면 객체선언 없이 사용가능
		int[] num = new int[2];
		int a = 10;
		int b = 5;
	
		calculate(num,a, b);
		System.out.println("합계 : "+ num[0]);
		System.out.println("평균 : "+ num[1]);
	}

	static void calculate(int[] num, int a, int b) {
		// 두 수의 합과, 평균을 구하기
		num[0] = a + b;
		num[1] = (a + b) / 2;

//	return total,avg; //return 하나당 한개만 사용 가능 so참조 변수(num 만들어) 사용하기

	}
}
