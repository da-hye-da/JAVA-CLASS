package j0530;

import java.util.Scanner;

public class C0530_03 {
	public static void main(String[] args) {
		//소문자를 대문자로 출력하시오. a=97, A=65, Z= 96, 0=48
		Scanner scan = new Scanner(System.in);
//		System.out.println("영문 소문자를 입력하세요");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 소문자 : " + input);
//		char output = (char) (input-32);//char + int = int+int = int so. char로 형변환하기 
//		System.out.println("변환된 대문자 : " + output);
		
		
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		String str2 = "abcdef";
		System.out.println(str2.toUpperCase());
		
		//소문자는 대문자로, 대문자는 소문자로 변환하여 출력하시오
		System.out.println("영문을 입력하세요.(입력된 문자는 소→대/ 대→소 변환되어 출력됩니다)");
		String input = scan.next();//들어오는 모든 문자열을 변경하시오. aBcDe→AbCdE
		String output = "";
		char temp = ' ';
		
		for (int i= 0; i<input.length(); i++) {
			temp = input.charAt(i);
			if (temp>='a' && temp<='z') {
				output = output +(char)(temp-32);
			} else if (temp>='A' && temp<='Z'){
				output = output +(char)(temp+32);
			}
			
		}//for
			System.out.println("입력한 문자 : "+ input);
			System.out.println("변환된 문자 : "+ output);
			
			//입력된 1개의 문자를 치환
			//소문자는 대문자로, 대문자는 소문자로 변환하여 출력하시오
//			char input = scan.next().charAt(0);//들어오는 모든 문자열을 변경하시오. aBcDe→AbCdE
//			
//			if (input>='a' && input<='z') {
//				System.out.println("입력된 문자 : "+input);
//				System.out.println("변환된 문자 : "+(char)(input-32));
//			} else {
//				System.out.println("입력된 문자 : "+input);
//				System.out.println("변환된 문자 : "+(char)(input+32));
//				
//		}
			
			
		
	}
}
