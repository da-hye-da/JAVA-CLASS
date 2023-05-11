package j0508_01;

public class Class0508_07 {
	public static void main(String[] args) {
		//printf, printin, print
		System.out.println(10/3); //둘 다 int타입 so. int로 결과값 3 출력
		System.out.println(10/3.0); // double(글자가 없어서)타입. 큰 쪽으로 형이 변환되어 결과값은 3.3333333333333335(15자리까지는 표현,16자리는 임의적으로 표현되어 출력)
//		System.out.println(); => 입력 방법 sysout 쓰고 ctrl + space, enter
//		\n 단락 \t tab키
		System.out.printf("%.2f",10/3.0); //실수형/ 소수점 2자리까지 출력, 출력 후 자동enter키가 없음
		System.out.printf("%.2f \n",10/3.0);
		System.out.printf("[%5d]",1000);//정수형
		System.out.printf("[%05d]",1000);
		System.out.printf("[%10d]",1000);
		System.out.printf("%x",16); //16진수 //10
		System.out.printf("%x \n",16);
		System.out.printf("%o",9); //8진수 //11
		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년\n", 25, 1986);
//		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년\n", 30, 1993);
//		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년\n", 0, 2023);
		System.out.println("당신의 나이 : "+25+" 세, 생년 : "+1986+" 년"); //같은 결과값 출력
//		System.out.println("당신의 나이 : "+0+" 세, 생년 : "+2023+" 년");
	}

}
