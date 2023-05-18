package j0517;

import java.util.Scanner;

public class Class0517_05 {
public static void main(String[] args) {
	
	//3개의 수를 입력받아 평균60이상이면 성공/미만이면 실패
	Scanner scan = new Scanner(System.in);
	Class0517_05 c = new Class0517_05();
	//
	//average() return int
	int num[]= new int [3];
	
	String result = "";
	
	//new int [0],new int [1],new int [2]
	//
	for (int i = 0; i < 3; i++) {
		System.out.println("숫자를 입력하세요");
		num[i] = scan.nextInt();
		result = c.average(num[0], num[1], num[2]);
	}//3번만입력 10,20,30
	System.out.println("합격여부 : "+result);
	
}//main 

String average(double a, double b, double c) {
	String result = "";
	if(((a+b+c)/3.0)>=60) {
		result = "합격";
	} else {
		result = "불합격";
	}
	return result;
}
}//class

