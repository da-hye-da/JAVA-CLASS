package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C0530_09_01 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		
		//	colClass 사용하려면? 객체선언
		ColClass c = new ColClass();
		map= c.execute();
		
		//	colClass2 사용하려면? 객체선언
		ColClass2 c2 = new ColClass2();
		int nowPage = 0;
		c2.execute2();
		
		//colClass3 사용하려면? 객체선언
//		int nowPage2 = 0;
		ColClass3 c3 = new ColClass3();
		ArrayList list = new ArrayList<>();
		list = c3.execute3();
		
		//	colClass4 사용하려면? 객체선언
		ColClass4 c4 = new ColClass4();
		Map<String, Object> map2 = new HashMap<>();
		map2 = c4.execute4();
		
	}//main
}