import java.util.Scanner;

public class StuMain {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice = 0;//지역변수(d/t method 안에 위치)
		int count = 0;//학생 수
		String name = "";
		int kor = 0,eng=0,math=0;		
		Student[] s= new Student[10];//배열 선언
		
//		s[0] = new Student(); //객체 선언
		
		while(true) {
			System.out.println("[ 학생 성적 처리 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("=====================================");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			if(choice ==0) {
			System.out.println("시스템을 종료합니다");
			System.out.println("=====================================");
			}
			
			switch(choice) {
			
			case 1: //성적 입력
				//성적입력 프로그램 부분
				count = StuMain.stuInput(count, s);
				
				break;
				
			}//switch
				
		}//while
				
	}//main
			
//다른 메소드 선언 - 리턴타임 메소드명(매개변수) {   }
	static int stuInput(int count, Student[] s) {
	//학생 입력
		String name = "";
		int kor = 0, eng = 0, math=0;
		
		for (int i = count; i < s.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요. (0. 이전페이지 이동)");
		name = scan.next();
		//이전 페이지 이동확인
		if(name.equals("0")) {
			System.out.println("[ 이전페이지로 이동합니다 ]");
			System.out.println("=====================================");
			break;
		}
		System.out.println("국어 점수를 입력하세요");						
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();				
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();
		s[i]= new Student(name,kor,eng,math);
		count++;
		}//for
		return count;
	}//stuInput
}//class
