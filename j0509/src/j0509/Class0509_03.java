package j0509;

import java.util.Scanner;

public class Class0509_03 {
	public static void main(String[] args) {

		int kor = 99;
		int eng = 98;
		int math = 100;
		String name = "이다혜";

		//데이터 입력 Scanner-화면에서 입력을 받음
		Scanner scan = new Scanner(System.in); //scan은 변수 이름임 scan 대신 다른 이름을 사용가능,첫글자만 숫자가 아니면 ok!
		//String str = new String("aaa"); //스트링만 new형식을 갖추지 않고 아래 줄처럼 사용 가능함
		//String str2 = "aaa";

		System.out.println("이름을 입력하세요 : ");
		name = scan.next();// 이 다혜 =>'이'만 출력됨
//		name = scan.nextLine();// 이 다혜 => '이 다혜' 모두 출력 가능
		System.out.println("국어점수를 입력하세요 : ");
		kor = scan.nextInt(); //nextInt; int를 받는 형태의 스캐너
		System.out.println("영어점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("\t이름\t국어\t수학\t영어\t합계\t평균");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.printf("\t%s\t%d\t%d\t%d\t%d\t%.2f \n", name,kor,eng,math,total,avg);
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		
		
	}	
}
