package j0522;

public class Data {
	
	Data(){//클래스이름과동일하고, void를 생략하는게 생성자. 그러므로 생성자는 총 2개
		//같은 클래스 내 다른 생성자를 호출 this()
		this(1,1);//num1,num2를 1,1로 초기화하는 생성자
		num1 = 1;
		num2 = 1;
		data1 = num1+num2;
		data2 = num1-num2;
		data3 = num1*num2;
		data4 = num1/num2;
		
	}
	Data(int n1, int n2){//매개변수를 받아서 인스턴스변수를 초기화하는 생성자
		this.num1 = n1; 
		this.num2 = n2;	
		data1 = num1+num2;
		data2 = num1-num2;
		data3 = num1 *num2;
		data4 = num1/ num2;
		
	}
	
	int num1;// 입력 받을 1번째 숫자
	int num2;// 입력 받을 2번째 숫자
	int data1;//두 수 더하기
	int data2;//두 수 빼기
	int data3;//두 수 곱하기
	int data4;// 두 수 나누기
	
}
