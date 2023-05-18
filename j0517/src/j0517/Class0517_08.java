package j0517;

import java.util.Scanner;

public class Class0517_08 {
	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 작은 수 부터 순차적으로 출력하시오.
		// calculate() 메소드 만들어서 사용하시오.
		// 10 5 25 -> 5 10 25 
		//array, sort 사용하지 않고 크기 비교를 통하여 만들기

		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		calculate(num1, num2, num3);
	}// main
	public static void calculate(int num1, int num2, int num3) {
        int min, mid, max;
        
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            if (num2 <= num3) {
                mid = num2;
                max = num3;
            } else {
                mid = num3;
                max = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            if (num1 <= num3) {
                mid = num1;
                max = num3;
            } else {
                mid = num3;
                max = num1;
            }
        } else {
            min = num3;
            if (num1 <= num2) {
                mid = num1;
                max = num2;
            } else {
                mid = num2;
                max = num1;
            }
        }
        
        System.out.println("작은 수부터 순차적으로 출력 : "+ min + " " + mid + " " + max);
    }
}