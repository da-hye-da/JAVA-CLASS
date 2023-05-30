package j0522;

public class C0522_10 {
public static void main(String[] args) {
//	String str = String.format("%04d",1);//04 => 4자리를 만들고 빈자리는 0을 채워라/ 0을 미작성시 공백으로 채움
//	String str2 = String.format("%,10d",1000000000);//04 => 4자리를 만들고 빈자리는 0을 채워라/ 0을 미작성시 공백으로 채움
//	System.out.println(str);
//	System.out.println(str2);\
	
	Student s1 = new Student();
	System.out.println(s1.stuNo);
	
	Student s2 = new Student();
	System.out.println(s2.stuNo);
	
	Student s3 = new Student();
	System.out.println(s3.stuNo);

	Student s4 = new Student();
	System.out.println(s4.stuNo);

	Student s5 = new Student();
	System.out.println(s5.stuNo);
	
	Student s6 = new Student("홍길동",100,90,80);
	System.out.println(s6.stuNo);

}
}
