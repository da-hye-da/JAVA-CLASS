package shopMall;

import java.util.ArrayList;

public class Buyer {
	Buyer(){}
	Buyer(String id, String name, String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	//배열
	//Product[] cart = new Product[10];
	//cart[0]=p;
	
	//Collection
	ArrayList<Product> list = new ArrayList();
//	ArrayList<E> list = new ArrayList<>();
	
	//cart[il=p, list.add(p) : 객체 추가	Object o = new Product();
	//cart[0], 	list.get(0)  : 읽어오기 
	//cart.length, list.size : 총 갯수
	String id;
	String pw;
	String name;
	String nickName;
	
	int money = 1000;
	int bonusPoint = 0;
	int count = 0;
	
//	void buy(Tv t) {
//		money = money -t.price; //tv의 가격을 빼고 다시 money에 넣음.
//		bonusPoint = bonusPoint + t.bonusPoint; //현재 보너스에 추가해서 다시 보너스에 넣음.
//		System.out.println(t);
//	}
//	void buy(Computer c) {
//		money = money -c.price;
//		bonusPoint = bonusPoint + c.bonusPoint;
//		System.out.println("구매 목록 : " + c.productName);
//	}
//	void buy(Speaker s) {
//		money = money -s.price;
//		bonusPoint = bonusPoint + s.bonusPoint;
//		System.out.println("구매 목록 : " + s.productName);
//	}
//	void buy(Washer w) {
//		money = money - w.price;
//		bonusPoint = bonusPoint + w.bonusPoint;
//		System.out.println("구매 목록 : " + w.productName);
//	}이렇게 여러 목록을 적어둔 것을 아래의 void 한번으로 작성 가능
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
		money = money - p.price;
		bonusPoint = bonusPoint +p.bonusPoint;
		System.out.println("구매 : "+p.productName);
		list.add(p);
		}
	}
	void buyList() {
		System.out.println("구매 목록 : ");
		for (int i = 0; i <list.size(); i++) { //count를 list.size로 변경
			Product p = list.get(i);//object
			if (i==0) {
				System.out.print(p.productName);
			} else {
					System.out.print(p.productName);
			}
			System.out.println();
			
		}
	}
		
		
	
}
