package j0530;

import java.util.ArrayList;
import java.util.List;

public class C0530_05 {
	public static void main(String[] args) {
		//list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
		
		ArrayList list = new ArrayList(); //import 만들기 => ctrl +shift +m
		list.add("abc");//0
		list.add("abc");//1
		list.add("bbb");//2
		list.add("aaa");//3
		list.add(3); //4 	integer로 자동 형변환이 됨
		System.out.println(list.get(0));//abc가 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list : " + list.get(i));
			
		}
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		ArrayList<Student> list2 = new ArrayList(); //<>;지네릭스 => soso. list2에는 <Student>만 들어와라 하는 것 
		list2.add(new Student(01, "홍길동", 100,100,99));
		list2.add(new Student(02, "유관순", 90,90,99));
		list2.add(new Student(03, "이순신", 80,80,87));
//		list2.add(2);
//		list2.add("abc"); //이렇게 2줄 추가 가능하지만 아래모습처럼 출력할때 형변환이 어려울 수 있음.
		// so. <Student> 를 사용하면 student 이외에는 추가하지 못하게 만듬
		//출력하시오
		System.out.println(list2.get(0));
		for (int i = 0; i < list2.size(); i++) {
			Student Student = (Student) list2.get(i);
//			Student s = list2.get(i);로 쓰면 아래 적었던 Student를 s로 변경해서 쓸 수 있어 한눈에 보기 쉬워짐
			
//			System.out.println("list2 번호: "+ Student.getStuNo()+"번");
//			System.out.println("list2 이름: "+ Student.getName());
//			System.out.println("list2 국어: "+ Student.getKor()+"점");
//			System.out.println("list2 영어: "+ Student.getEng()+"점");
//			System.out.println("list2 수학: "+ Student.getMath()+"점");
//			System.out.println("list2 합계: "+ Student.getTotal()+"점");
//			System.out.println("list2 평균: "+ Student.getAvg()+"점");
			
//			System.out.println("list2 : "+Student.getStuNo()+ " "+Student.getName()+ Student.getKor()+"점 "+Student.getEng()+"점 "+Student.getMath()+"점 "+Student.getTotal()+"점 "+Student.getAvg()+"점");
//			System.out.println("list2 : "+s.getStuNo()+ " "+s.getName()+ s.getKor()+"점 "+s.getEng()+"점 "+s.getMath()+"점 "+s.getTotal()+"점 "+s.getAvg()+"점");
			
			System.out.println("===============================");
			System.out.printf("%d %s %d %d %d %d %.2f \n",Student.getStuNo(),Student.getName(),Student.getKor(),Student.getEng(),Student.getMath(),Student.getTotal(),Student.getAvg());
//			System.out.printf("%d %s %d %d %d %d %.2f \n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath()s.getTotal(),s.getAvg());
			
		}
		System.out.println("===============================");
			
		// 형변환하기
//		list2.get(i);		Student.getName();
		
	}
}
