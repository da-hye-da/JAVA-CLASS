package j0518;

import java.util.Scanner;

public class C0518_04 {
public static void main(String[] args) {
	//문자를 입력받아 해당 소문자로 변환하시오
	Scanner scan = new Scanner(System.in); //문자를 입력해야 할때 작성해야 함!!!!
	 
	//대문자 A-65, 66.. Z-96, 소문자 a-97,98....
	//대,소문자인지 비교
	
	// 대문자를 소문자로 바꿔줌
	System.out.println("대문자를 소문자로 바꿔줍니다. 문자를 입력하세요");
	char ch = scan.next().charAt(0);
	ch = (char)(ch+32);
	System.out.println(ch);
	
	// 소문자를 대문자로 바꿔줌
	System.out.println("소문자를 대문자로 바꿔줍니다. 문자를 입력하세요");
	char ch_2 = scan.next().charAt(0);
	ch_2 = (char)(ch-32);
	System.out.println(ch_2);
	
	
	// 입력된 문자를 판단해서 대->소, 소->대 
	System.out.println("문자를 입력하세요");
	char ch_3 = scan.next().charAt(0);

	
	if(ch_3<=96) {
		ch_3 = (char)(ch_3+32);
	} else {
		ch_3 = (char)(ch_3-32);
	}
	System.out.println(ch_3);
	
}//main
}//class
