package j0522;

public class Car {

	String color;
	String geartype;
	int door;
	
	Car() {
//		this("white","auto",4);//이렇게 쓰는 걸 추천 두가지중 한가지로 쓰면 됌
		color = "white";
		geartype = "auto";
		door= 4;
	}
	Car	(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		geartype = c.geartype;
		door = c.door;
		
	}
	
}
