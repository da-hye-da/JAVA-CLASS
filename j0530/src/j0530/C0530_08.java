package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class C0530_08 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.get(0)
		System.out.println("list : "+list.get(0));//1개만 출력시
		System.out.println("------------------------");
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("========================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		} 	//여러개 돌릴때는 for문 사용
		System.out.println("========================");
		
		
//		Map map = new HashMap<>();
		HashMap<Object, Object>	map = new HashMap<>(); //윗 줄과 같은 내용
		map.put("id", "aaa"); //키 값인 id는 중복이 되지 않음
		map.put("list","data");
		map.put("no","1");
		map.put("lastNo","100");
		map.put("id","bbb");//오류는 뜨지 않음, 단 최종 내용만 출력됨(aaa는 사라짐)
		
//		map.get("id");
		System.out.println("map : "+ map.get("id")); //1개만 출력시
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			it.next();
		}
	}
}
