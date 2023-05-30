package shop;

import java.util.ArrayList;

import shopMall.Product;

public class Buyer {
	Buyer(){}
	Buyer(String id, String name, String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	ArrayList<Product> list = new ArrayList();
	
	String id;
	String pw;
	String name;
	String nickName;
	
	int money = 1000;
	int bonusPoint =0;
	int count = 0;
	
//	void buy
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
