package j0522;

public class C0522_09 {
public static void main(String[] args) {
	//객체선언 후
	//serialNo = 1;
	Product p1 = new Product();
	System.out.println("p1 count : "+p1.count);
	System.out.println("p1 serialNo : "+p1.serialNo);
	
	//serialNo = 2;
	Product p2 = new Product();
	System.out.println("p2 count : "+p2.count);
	System.out.println("p2 serialNo : "+p2.serialNo	);
	
	//serialNo = 3;
	Product p3 = new Product();
	System.out.println("p3 count : "+p3.count);
	System.out.println("p3 serialNo : "+p3.serialNo	);

	System.out.println("p1 count : "+p1.count);//
	System.out.println("p2 count : "+p2.count);//
	System.out.println("p2 count : "+p3.count);//
	
	//int count = 0
	//int serialNo = 0;
	
	//초기화블럭 실행 : count = 1; serialNO =1;
	//생성자 호출 : count = 1; serialNO =1;
	
	
}
}
