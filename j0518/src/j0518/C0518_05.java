package j0518;

import java.util.Scanner;

public class C0518_05 {
public static void main(String[] args) {
	

	//숫자를 입력 받아, 양수인지 음수인지 출력하시오, 0은 양수로 인정
	Scanner scan = new Scanner(System.in);
	int num = 0;
	System.out.println("숫자를 입력하세요. 양수 혹은 음수 여부를 확인해드립니다");
	num  = scan.nextInt();
	if (num>=0) {
		System.out.printf("양수입니다, 입력한 숫자는 %d입니다\n", num);
	} else {
		System.out.printf("음수입니다, 입력한 숫자는 %d입니다\n", num);

	}

	//국어, 영어 수학 입력받아 평균 60점을 넘으면 합격, 아닐 경우 불합격 출력하시오.
	int kor = 0;
	int eng = 0;
	int math = 0;
System.out.println("===============");
	System.out.println("성적을 입력하세요");
	System.out.println("국어 성적 : ");
	kor = scan.nextInt();
	System.out.println("영어 성적 : ");
	eng = scan.nextInt();
	System.out.println("수학 성적 : ");
	math = scan.nextInt();
	
	int total = kor+eng+math;
	double avg = total/3.0;//이 두 줄이 위로 올라가면 계산이 되지 않음. 계산은 위에서부터 순서대로 이루어지기 때문
	
	if (avg >=60) {
		System.out.println("합격");
		System.out.println("평균 점수는 :"+avg);//println은  +로 사용
	} else {
		System.out.println("불합격");
		System.out.printf("평균 점수는 : %.1f\n",avg);//printf는 ,로 사용
	}
	
	
}
}