package j0522;

import java.util.Scanner;

public class C0522_02 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	// 두 수를 입력받아 더하기, 빼기, 곱하기, 나누기
	// 생성자를 활용
		
	int[]num = new int[10];
	int[]data = new int[20];

	for (int i = 0; i < 2; i++) {
		
//	===============================
	for (int j = (2*i)+0; j < (2*i)+2; j++) {
		//(2*0)+0=,(2*0)+1   (2*1)+0= 2,(2*1)+1= 3
	System.out.println((j+1)+"번째 숫자를 입력하세요"); //1,2
	num[j] = scan.nextInt();
	}
	
	data[4*i]= num[(2*i)]+num[(2*i)+1]; //data[0]=>4*0, 4*i data[4]=>4*1
	System.out.println(data[4*i]);
	data[4*i+1]= num[(2*i)]-num[(2*i)+1]; //
	System.out.println(data[4*i+1]);
	data[4*i+2]= num[(2*i)]*num[(2*i)+1];
	System.out.println(data[4*i+2]);
	data[4*i+3]= num[(2*i)]/num[(2*i)+1];
	System.out.println(data[4*i+3]);
	}
//	===============================
//	for (int i = 2; i < 4; i++) {
//		
//	System.out.println((i-1)+"번째 숫자를 입력하세요");
//	num[i] = scan.nextInt();
//
//	}
//	data[4] = num[3]+num[4];
//	System.out.println(data[4]);
//	data[5] = num[3]-num[4];
//	System.out.println(data[5]);
//	data[6] = num[3]*num[4];
//	System.out.println(data[6]);
//	data[7] = num[3]/num[4];
//	System.out.println(data[7]);
//
	}
	}

//변수 선언이 자유로워짐
//for문 사용가능
//코드 양이 줄어듬