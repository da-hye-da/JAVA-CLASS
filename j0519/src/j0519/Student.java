package j0519;

public class Student {
	
	//기본생성자
	Student(){} //처음 한개는 자바에서 자동으로 만들어지는 것으로 생략가능
	
	Student(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		avg = total/3;
	}
	static String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	String name;//각각의 컬럼
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {//void는 return값이 없다
		total = kor +eng +math;
	}
	void average () {
		avg =total /3.0;
		
	}
}

