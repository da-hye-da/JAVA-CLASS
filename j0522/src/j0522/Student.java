package j0522;

public class Student {
	static int count = 1000; // 클래스 변수
	int stuNo;// 20231011001
	String name; // 인스턴스변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{// 초기화블럭
//		++count; //1001
//		stuNo = count;//1001,1002,1003,1004
	}

	Student(String name){++count; // 1001
	stuNo=count;// 1001,1002,1003,1004
	}
	Student(){
//	초기화블럭은 생성자에 넣어도 가능함
		++count; //1001
		stuNo = count;//1001,1002,1003,1004	
	}

	Student(String name, int kor, int eng, int math) {
		++count; //1001
		stuNo = count;//1001,1002,1003,1004
		this.name = name; // this는 인스턴스변수의 name을 의미함.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
}
