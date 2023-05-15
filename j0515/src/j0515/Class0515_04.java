package j0515;

public class Class0515_04 {
public static void main(String[] args) {
	//2차원 배열 보물 찾기
	//[4][3] 배열
	int[][] box = new int[4][3];
	
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 3; j++) {
			box[i][j] = (3*i)+(j+1);//
		}//for j
	}//for i
		
		System.out.println("==========================");
		
	//번호출력
	for (int i = 0; i < 4; i++) {
		System.out.print(i+" |\t");	//맨 앞에 줄마다 0,1,2,3이 적힌 것
		for (int j = 0; j < 3; j++) {
	System.out.print(box[i][j]+"\t");	
	}//for j
		System.out.println();
	}//for i

	System.out.println("==========================");
	
}//main
}//class
