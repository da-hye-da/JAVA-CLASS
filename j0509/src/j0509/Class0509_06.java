package j0509;

import java.util.Scanner;

public class Class0509_06 {
	public static void main(String[] args) {
		int num = 5;
		num = num+1;
		System.out.println(num);
		
		int num1 = 5;
		int result = ++num1;
		System.out.println(result); //위와 같은 결과. num에 1을 더해 그 결과값을 result대입
		
		int num2 = 5;
		int result2 = num2++;
		System.out.println(result2);
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		삼항식(https://ssdragon.tistory.com/4 =>참고)
		String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다";
		System.out.println(answer);
		//1개의 정수형을 입력받아 10보다 큰 수인지 출력하시오
		//1. 변수선언 2. 입력 3. 확인출력
		Scanner a = new Scanner(System.in); //Scanner작성 후 ctrl + space하여 첫번째것 누르기 (윗 줄에'import java.util.Scanner;' 작성된것 확인 가능)
		//1. 변수선언 
		int input = 10;
		//2. Scanner - 입력클래스
		String answer2 = (input > 10)?"10 초과":(input == 10)?"10입니다":"10보다 작습니다";
		//"10 초과":__" => __ 자리에 '(input == 10)?"10입니다":"10보다 작습니다' 를 입력해주기
		//3. 출력
		System.out.println(answer2);
//		가독성은 높아지나 식이 복잡해짐. 이는 error 발생률을 높임. so, if문을 사용해서 만들면 됨
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
//		삼항식 같은 
		int i = 0;
	      //1개의 정수형을 입력받아 10보다 큰 수인지 출력하시오 
	      Scanner scan1 = new Scanner(System.in);
	      System.out.printf("숫자를 입력하시오." );
	      i = scan1.nextInt();
	      String b= (i>10)?(i ==10)?"10보다 큽니다.":"10보다 작습니다.":"10과 같습니다.";
	      System.out.println(b); 
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//정수를 입력받아 음수면 양수로, 양수면 음수로 변경하시오.
		Scanner scan11 = new Scanner(System.in);
		System.out.println("음수면 양수로, 양수면 음수로 변경합니다. 숫자를 입력하세요.");
		int input1 = scan11.nextInt();
		int result3 = (input1 > 0)? - input1:-input1;
		System.out.println("결과 값 : "+result3);
		
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");
		int k = scan11.nextInt();
		int j = (k>0)?-k:-k;
		System.out.println("결과값 : " +j);

//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//정수를 입력받아 음수면 양수, 양수면 음수로 변경하시오. 
	      
	      System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");   
	      i = scan11.nextInt();
	      int r2 = (i>0)?-i:-i;
	      System.out.println("결과값 : " +r2);
	   
//		――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
		//숫자를 입력받아 짝수인지 홀수인지 출력하시오 .
	      //변수선언
	      int i1 = 0;
	      //입력
	      Scanner scan = new Scanner(System.in);
	      System.out.printf("숫자를 입력하시오." );
	      i1 = scan.nextInt();
	      String a1= (i1%2 ==0)?"짝수입니다.":"홀수입니다.";
	      System.out.println(a1);   
	}

}
