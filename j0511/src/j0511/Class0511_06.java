package j0511;

public class Class0511_06 {
	public static void main(String[] args) {
		//배열 만드는 방법
		//int[]num = new int[5];// 아래 두줄과 같은 내용
		int[]num;
		num = new int[5];
//		int[]score = new int[5];
		String[]name = new String[100];
		double[]avg = new double[50];
		
		int[] score = new int[10];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		score[5] = 6;
		score[6] = 7;
		score[7] = 8;
		score[8] = 9;
		score[9] = 10;
		
		int[] input = {1,2,3,4,5,6,7,8,9,10};//위의 줄처럼 하나하나씩 입력해도 되고, 중괄호에 한 번에 입력해도 가능
		
		System.out.println(num);//[I@3d012ddd은 num의 주소값이고, 주소값을 따라가면 5개의 자리가 있음
//		System.out.println(score);
		System.out.println(""+score[0]+score[1]+score[2]+score[3]+score[4]+score[5]
				+score[6]+score[7]+score[8]+score[9]);//""를 안 쓰면 숫자들을 다 더한 합이 출력	
		
	}
}
