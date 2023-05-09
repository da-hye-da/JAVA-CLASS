package j0509;

public class Class0509_01 {
	
	public static void main(String[] args) {
		//변수 - 8가지
		//논리형 - boolean => 
		//문자형 - char => ' ' 한글자만 들어가고, 공백이 있어야 함
		//정수형 - byte, short, int, long
		//실수형 - float, double
		//문자열 - String(길이상관없음)
		
		int num = 3;
		char ch = 'a'; //A=65, a=97, 0=48 =>아스키 코드
		
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		System.out.printf("더하기 결과 값 : %d \n",num+num2); //%n \n println 다 같은 줄 바꿈
		System.out.printf("나누기 결과 값 : %.2f \n",num/(double)num2); //%d 정수 %f 실수 so, 이 줄에 %d를 쓰면 오류발생
		
		
		System.out.print("더하기 결과 값 : "+(num+num2)+"\n"); //5
		System.out.println(num-num2); //1
		System.out.println(num*num2); //6
		System.out.println(num/num2); //1 int끼리 나누면 int로만 결과가 나옴
		System.out.println(num/(double)num2);//so, 소수점 표현을 원하면 둘 중 하나를 float/double로 입력해야함
		System.out.println(10/3.0); //주로 더블을 사용, float를 사용하면 뒤에 f를 붙여야 하므로/더블은 숫자뒤에 알파벳을 따로 안 붙여도 됌
		System.out.println(7+5);
		System.out.println(7-5);
		System.out.println(7*5);
		System.out.println(7/5);
		
	}

}
