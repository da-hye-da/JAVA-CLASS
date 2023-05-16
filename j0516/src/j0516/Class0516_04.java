package j0516;

public class Class0516_04 {
public static void main(String[] args) {


	Student s1 = new Student();
	s1.name = "홍길동";
	s1.kor = 100;
	s1.eng = 99;
	s1.math= 100;
	s1.sum();
	s1.average();

	System.out.println(s1.total);
	System.out.println(s1.avg);

	Student s2 = new Student();
	s2.name = "홍초롱";
	s2.kor = 99;
	s2.eng = 100;
	s2.math= 99;
	s2.sum();
	s2.average();

	System.out.println(s2.total);
	System.out.println(s2.avg);
	
	
//하단의 내용이 맨 윗줄의 Student s1 = new Student();로 해결됨	
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math = 0;
//	int total = 0;
//	double avg = 0;
//	int rank = 0;
//	
//	//Scanner scan = new Scanner(System.in);
//	name = "홍길동";
//	kor = 100;
//	eng = 99;
//	math = 100;
//	total = kor+eng+math;
//	avg = total /3.0;
	
	
}//main
}//class
