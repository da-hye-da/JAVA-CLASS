package j0517;

import java.util.Scanner;

public class Class0517_08_01 {

	    public static void main(String[] args) {
	        // 3개의 숫자를 입력받아 작은 수부터 순차적으로 출력
	        // calculate() 메소드를 만들어서 사용하시오
	        // 10 5 25

	        // scan
	        Scanner scan = new Scanner(System.in);

	        // 변수 만들기
	        int[] num = new int[3];
	        for (int i = 0; i < num.length; i++) {//num.length 대신 3을 입력해도 됌
	            System.out.println((i + 1) + "번째 번호를 입력하세요");
	            num[i] = scan.nextInt();
	        }
			//배열정렬은  Arrays.sort(num);  한줄이면 끝남	            
	        
	        // calculate 메소드 호출하여 결과 출력
	        calculate(num);
	    }

	    // calculate 메소드
	    public static void calculate(int[] num) {
	        int min = Math.min(Math.min(num[0], num[1]), num[2]);
	        int max = Math.max(Math.max(num[0], num[1]), num[2]);
	        int mid = num[0] + num[1] + num[2] - min - max;

	        System.out.println("작은 수부터 순차적으로 출력: " + min + " " + mid + " " + max);
	    }

	}