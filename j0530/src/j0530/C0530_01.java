package j0530;

import java.util.Scanner;

public class C0530_01 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("복권을 입력하세요.(예: 1조1234567)");
		//1조와 1234567를 분리 
		String input = scan.next();
		String output1 = input.substring(0,2);
//		input.substring(0,2);
		String output2 = input.substring(2);
//		input.substring(2,8);
		int output3 = Integer.parseInt(output2);
		int random = (int)(Math.random()*10000000)+1000000;	//1000000-9999999
		System.out.println("랜덤 생성 : " + random);
		System.out.println(output1);
		System.out.println("문자 타입 : "+output2); 
		System.out.println("숫자 타입 : "+output3); //output2,3이 1조0007786와 같은 식일때 차이가 남(d/t String,int 형식의 차이)

		
		//output2 숫자가 무엇인지 맞춰보세요.
		//Integer.parseInt(output2)
		//1245780 정수타입으로 변경 후 for문으로 써서 0-9999999까지 비교해보세요.
		
		for (int i = 1000000; i <= 9999999; i++) {
			if(output3==i) {
				System.out.println("입력한 숫자 : " + i);
			}
		} 

		for (int i = 1000000; i <= 9999999; i++) {
			if(random==i) {
				System.out.println("랜덤 숫자 : " + i);
			}
		} 
			
		//랜덤으로 0000000-9999999			1000000-9999999
		
		
		
		
//		String str = new String("abc");//이 줄은 내부적으로는 아래 세줄과 같이  각각 적혀있다.
//		char ch= 'a';
//		char ch1 = 'b';
//		char ch2 = 'c';
//		
//		String str2 = "abc";//예외처리로 이렇게 적어도 가능함 // 보통은 맨 윗줄처럼 적어야 함.
//		//charAt(0)
//		System.out.println(str.charAt(0));
//		
//		String str3="abcdefg";
//		String str4 = str3.substring(3,5);
//		
//		System.out.println(str4);
//		
//		String str5 = "안녕하세요. 반갑습니다.";
////		str5.substring(2, 5);
//		System.out.println(str5.substring(2, 5));
	}

}
