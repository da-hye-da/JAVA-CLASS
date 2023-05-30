package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass3 {

//		Map<String, Object> execute3() {
//		Map<String, Object> map = new HashMap<>();
//
//		ArrayList<Student> list = new ArrayList<>();
//
//		list.add(new Student());
//
//		list.add(new Student(1, "홍길동", 100, 100, 99));
//		list.add(new Student(2, "유관순", 99, 98, 99));
//		list.add(new Student(3, "이순신", 90, 91, 90));
//		list.add(new Student(4, "강감찬", 90, 91, 90));
//		list.add(new Student(5, "김구", 90, 91, 90));
//		list.add(new Student(6, "홍길순", 90, 91, 90));
//		list.add(new Student(7, "홍길자", 90, 91, 90));
//		list.add(new Student(8, "김윤자", 90, 91, 90));
//		list.add(new Student(9, "김순자", 90, 91, 90));
//		list.add(new Student(10, "김영자", 90, 91, 90));
//		return map;

	// execute3()메소드를 만들어서 nowPage main 메소드에 전달하시오.

	//메소드 구현
	//리턴타입 메소드명(매개변수){ return 리턴타입일치 }
	// 리턴타입 메소드명() {
		ArrayList<Student> execute3() {
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "홍길동", 100, 100, 99));
		list.add(new Student(2, "유관순", 99, 98, 99));

		return list;
	}
	// return 리턴타입을 맞춰야 함
	// }

}
