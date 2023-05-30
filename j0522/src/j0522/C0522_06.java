package j0522;

public class C0522_06 {
public static void main(String[] args) {
	//car-기본 생성자 사용 : color, geartype, door 출력
	
	Car c= new Car();
	System.out.println(c.color);
	System.out.println(c.geartype);
	System.out.println(c.door);
	
	System.out.println("======================");
	System.out.println(c.color+" / "+c.geartype+" / "+c.door);
	
	System.out.println("======================");
	
	c.color = "red";
	c.geartype = "auto";
	c.door = 5;
	
	System.out.println(c.color);
	System.out.println(c.geartype);
	System.out.println(c.door);
	
	//매개 변수가 있는 생성자 사용 red auto 5출력하시오
	System.out.println();
		
	//매개변수가 있는 생성사 사용 red auto door
	//객체 선언
	Car c2= new Car("red","auto",5);
	System.out.println(c2.color);
	System.out.println(c2.geartype);
	System.out.println(c2.door);	
	
	//객체 선언
	//객체를 복사할때 사용
	Car c3 = new Car(c2);
	System.out.println(c3.color);
	System.out.println(c3.geartype);
	System.out.println(c3.door);	
	//같은 내용이 나오겠지만 서로 다른 저장공간이라 c3에 다른 색상이나 기어타입을 바꾼다고해도 c2에 영향이 없음
	//참조변수로도 객체를 받을 수 있따.
}//main
}//class
 