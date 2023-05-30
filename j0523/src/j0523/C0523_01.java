package j0523;

import java.util.Iterator;

public class C0523_01 {
	public static void main(String[] args) {
		Deck d = new Deck();
		//Card c = new Card();
		
		//d.c[0].kind
		System.out.printf("%s, %d \n", d.c[0].kind,d.c[0].number);
		System.out.printf("%s, %d \n", d.c[51].kind, d.c[51].number);
		System.out.print(d.c[0].number);
		System.out.println(d.c[1].kind);
		System.out.println(d.c[1].number);
		System.out.println(d.c[2].kind);
		System.out.println(d.c[2].number);
		
		for (int i = 0; i < 52; i++) {
			System.out.printf("%s, %d \n", d.c[i].kind,d.c[i].number);
		}
		
//		int a= 0;
//		System.out.println(a);
//		
//		int[]arr = {1,2,3,4,5};//배열을 출력하기 위해서는 for문을 사용해야 한다
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int[]arr1 = new int[5];
//		arr[0] =1;
//		arr[1] =2;
//		arr[2] =3;
//		arr[3] =4;
//		arr[4] =5;
//		
//		for (i = 0; i < arr.length; i++) {
//		i++;
//		}
//		System.out.println();
//		
//		//구구단
//		for (int b = 1; b <= 9; b++) {
//			for (int c = 1; c <= 9; c++) {
//				System.out.printf("%d * %d = %d \n"
//						,b,c,b*c);
//				
//			}
//		}
			
	}//main
	
}//class
