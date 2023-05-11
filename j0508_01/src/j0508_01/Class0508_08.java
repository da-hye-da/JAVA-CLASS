package j0508_01;

public class Class0508_08 {
	public static void main(String[] args) {
		// num1 변수 10, num2 변수 3 을 선언 후 두 숫자를 나누고 소수점 2자리까지 출력하시오.
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%.2f \n", (float)num1/num2);
	
		System.out.printf("%.2f\n", 10/3.0);// 변수선언 없이 실행하는 방법. 위와 같은 결과 도출 가능

		//변수 n1 : 3.14, 변수 n2 : 5
		//[n1+n2의 결과값 : 8.14]를 출력하시오
		
		double n1 = 3.14;
		double n2 = 5;
		System.out.printf("[ n1+n2의 결과값 : %.2f ]\n", n1 + n2);
		
		double a1 = 3.14;
        int a2 = 5;
        System.out.printf("[ n1+n2의 결과값 : %.2f ]\n", a1+(float)a2); 
        
        float b1 = 3.14f;
        int b2 = 5;
        System.out.printf("[ n1+n2의 결과값 : %.2f ]\n", b1+(float)b2);
        
        float c1 = 3.14f;
        int c2 = 5;
        System.out.printf("[ n1+n2의 결과값 : %.2f ]\n", c1+c2);
        
        //시험점수 kor 100, eng 100, math 99
        // 합계와 평균을 출력하시오. 평균은 소수점 2자리까지 출력
        // [ 합계 : 299, 평균 99.99 ]
        int kor = 100;
        int eng = 100;
        int mat = 99;
        System.out.printf("[합계 : %d, 평균 :%.2f]", kor+eng+mat, (float)(kor+eng+mat)/3);
        
        int k = 100, e = 100, m = 99;
        int total = k+e+m;
        double avg = total/3.0;
        System.out.printf("[합계: %d, 평균:  %.2f]\n", total, avg);
        		
        int kr = 100;
		int en = 100;
		int math = 99;
		System.out.printf("[합계 : "+(kr+en+math)+", 평균 : "+(kr+en+math)/(float)3+"]");
		//아쉽군............ㅜ 소수점이 안돼여!!!!!!!!
        
	}
}
