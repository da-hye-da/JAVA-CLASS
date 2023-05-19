package j0519;

public class C0519_06 {

	public static void main(String[] args) {
	
//	String[] saveboard= new String[10];
	
	String no = "1";
	String title = "홈페이지 오픈";
	String date = "2023-05-19";
	String name = "이다혜";
	
	//객체선언
	Board b = new Board();
	String[] saveboard = b.save(no,title,date,name); //class Board의 void save() 사용가능해짐
	
	for(int i =0; i<saveboard.length;i++) {
		System.out.println(saveboard[i]+"");
	}
	System.out.println();
	}

}
