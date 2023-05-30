package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C0530_09 {
	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(new Student(01,"홍길동",100,100,99));
//		list.add(new Student(02,"유관순",99,98,99));
//		list.add(new Student(03,"이순신",90,91,90));
//		list.add(new Student(04,"강감찬",90,91,90));
//		list.add(new Student(05,"김구",90,91,90));
//		list.add(new Student(06,"홍길순",90,91,90));
//		list.add(new Student(07,"홍길자",90,91,90));
//		list.add(new Student(08,"김윤자",90,91,90));
//		list.add(new Student(09,"김순자",90,91,90));
//		list.add(new Student(10,"김영자",90,91,90));
//		
//		int nowPage = 3;
//		int startRow = 21;
//		int endRow = 30;
		
		Map<String, Object> map = new HashMap<>();//<key, value>입력
		//메소드에서 1개만 리턴이 가능
	
		//list,nowPage,startPage,endPage
		map = subMethod();
		System.out.println("현재페이지 : "+map.get("now.Page"));
		
	}//main
	static Map<String, Object> subMethod() {
		Map<String, Object> map = new HashMap<>();
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,98,99));
		list.add(new Student(3,"이순신",90,91,90));
		list.add(new Student(4,"강감찬",90,91,90));
		list.add(new Student(5,"김구",90,91,90));
		list.add(new Student(6,"홍길순",90,91,90));
		list.add(new Student(7,"홍길자",90,91,90));
		list.add(new Student(8,"김윤자",90,91,90));
		list.add(new Student(9,"김순자",90,91,90));
		list.add(new Student(10,"김영자",90,91,90));
		
		int nowPage = 3;
		int startRow = 21;
		int endRow = 30;
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
//		int result = 0;
//		String name = "홍길동";
		return map;
	}
	

}
