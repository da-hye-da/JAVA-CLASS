package StuProject;

public class Student {
	
	static String[] title= {"이름","국어","영어","수학","합계","평균","등수"};
	
	static int count =1000;//클래스 변수 - 객체
	int stuNo;	//인스턴스 변수 - 
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
		total = kor+eng+math;
	}
	void average() {
		avg = total/3.0;
	}
}














