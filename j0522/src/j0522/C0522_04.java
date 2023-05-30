package j0522;

import java.util.Scanner;

public class C0522_04 {
	//매개 변수가 있는 생성자를 호출해서 사용
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 두 수를 입력받아 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용

		// 배열 선언
		Data[] d = new Data[2];// new Data[2];안에 적은 숫자는 만드려고 하는 객체의 갯수를 의미, [100]으로 작성시 100개를 만들겠다는 것.
		int num1 = 0, num2 = 0;

//		//객체 선언
//		Data d = new Data();

		for (int i = 0; i < 100; i++) {

			System.out.println("1번째 숫자를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요");
			num2 = scan.nextInt();
			
			//매개 변수를 받는 생성자
			d[i] = new Data(num1,num2);//이렇게 적어도 되고  1)
			
			//기본 생성자
//			d[i]= new Data();
//			d[i].num1 = n1;
//			d[i].num2 = n2;/
//			d[i].data1 = d[i].num1+d[i].num2;
//			d[i].data2 = d[i].num1-d[i].num2;
//			d[i].data3 = d[i].num1*d[i].num2;
//			d[i].data4 = d[i].num1/d[i].num2; // 이렇게 적어도 됨 2) 두개 중 한가지 사용하면 되는데 1)이 짧고 한 눈에 보기 쉬움.

			//객체 선언
//			d[i] = new Data();//기본생성자
			d[i] = new Data(num1,num2);

		} // for
	}// main
}// class
