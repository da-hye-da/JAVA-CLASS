package j0511;

import java.util.Iterator;

public class Class0511_07 {
	public static void main(String[] args) {
		
				
		//―――――――――――――――――――――――――――――――
		
		//―――――――――――――――――――――――――――――――
		//10개의 배열을 만들고 랜덤숫자 1-10까지 숫자를 입력해서 출력하시오
	int[]num = new int[10];//저장할 공간 만드는 것 
	for(int i = 0; i < num.length; i++) {
		num[i] =(int)(Math.random()*10)+1;
		System.out.println(num[i]);

		//―――――――――――――――――――――――――――――――
		//배열 100개를 만들고 1-100까지 숫자 입력
//	int[] num = new int[100];
//	for (int i = 0; i < num.length; i++) {//i의 인덱스 위치,i 글자길이, i는 1씩 커짐) 
//		num[i]= i+1;
//		System.out.println(num[i]);
		//―――――――――――――――――――――――――――――――
		//int 배열
//		int[]num = new int[5];
//		num[0]= 1;
//		num[1]= 2;
//		num[2]= 3;
//		num[3]= 4;
//		num[4]= 5;
//		
//		for (int i = 0; i < num.length; i++) {//0,1,2,3,4
//			System.out.println(num[i]);	
		}
	}
}
