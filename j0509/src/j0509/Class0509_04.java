package j0509;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		//아이디, 패스워드, 이름을 입력받아 출력하시오.
		//문자열, 정수형, 문자열
		//―――――――――――――――――――――――――――――
		//아이디    패스워드    이름
		//―――――――――――――――――――――――――――――
		//abcd     1111    이다혜    
		//―――――――――――――――――――――――――――――
		
		String ID = "abcd";
		int PW = 1111;
		String NAME = "이다혜";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		ID = scan.next();
		System.out.println("비밀번호를 입력하세요 : ");
		PW = scan.nextInt();
		System.out.println("이름을 입력하세요 : ");
		NAME = scan.next();
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("\tID\tPW\tNAME");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.printf("\t%s\t%d\t%s\n", ID,PW,NAME);
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
		
		//1. 변수 선언
		String id = "";
		int pw = 0;
		String name = "";
		
		//2. Scanner - 입력클래스
		Scanner scan1 = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		ID = scan1.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		PW = scan1.nextInt();
		System.out.println("이름을 입력하세요.");
		NAME = scan1.nextLine();
		
		//3. 출력
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("\tID\tPW\tNAME");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.printf("\t%s\t%d\t%s\n", id,pw,name);
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");
			
		
}
}
