package j0530;

import java.util.ArrayList;
import java.util.Iterator;

public class C0530_06 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);//0
		list.add(2);//1
		list.add(3);//2
		list.add(4);//3 >지워짐
		list.add(5);//3
		list.add(6);//4 >지워짐
		list.add(7);
		
//		list.remove(3);
//		list.remove(4);
//		list.remove(3,4); 이거는 못함
		System.out.println("==================================");

		
		//Iterator 사용출력
//		Enumeration enum = new Enumeration<E>(); // Iteration의 예전 버전
		Iterator it = list.iterator();
		
		while(it.hasNext()) { //데이터가 있는지 확인
			System.out.println(it.next());//1개의 데이터를 가져옴.
		}
		
		while(it.hasNext()) { //데이터가 있는지 확인
			System.out.println(it.next());//1개의 데이터를 가져옴.
		}// 두번 세번이고 써도 한번만 나옴

		Iterator it2 = list.iterator();
		
		while(it2.hasNext()) { //데이터가 있는지 확인
			System.out.println(it2.next());//1개의 데이터를 가져옴.
		} //여러번 쓰고 싶으면 매번 선언후 while 작성해야함
		
				
		System.out.println("==================================");
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list);
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println("===========");
		System.out.println("현재 : "+list.size());
		System.out.println("===========");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.remove(i));
//		System.out.println("출력 : "+list);
//		}
		for (int i = list.size()-1; i >=0 ; i--) {
			System.out.println("출력 : "+list.remove(i));
		}

		
	
	}
}
