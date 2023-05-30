package j0522;

public class C0522_05 {
public static void main(String[] args) {
	Data d1 = new Data();
	//int num1, num2, data1, data2, data3, data4

	Data d2 = new Data();
	//int num1, num2, data1, data2, data3, data4
	
	Data d3 = new Data(1,2);
	
	Data[]d = new Data[5];// 배열 선언
	//Data를 담을 수 있는 5개의 공간이 생김
	
	d[0] = d1;
	d[0] = new Data();//객체 선언 되어있는 것을 넣어도 됌. 상관없음. 
	d[1] = d2;
	d[2] = d3;
	d[2] = new Data(1,2);
	
	
	int num1=0;
	int num2=0;
	int data1=0;
	int data2=0;
	int data3=0;
	int data4=0;
	
	int num3=0;
	int num4=0;
	int data5=0;
	int data6=0;
	int data7=0;
	int data8=0;
	
	
}//main

}//class
