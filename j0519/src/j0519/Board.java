package j0519;

public class Board {
String[] saveboard = new String[4];
String[] save(String no, String title, String date, String name) {//인스턴스메소드 =>객체선언 후 사용 가능. b.save();의 내용이 이쪽으로 넘어옴
	saveboard[0] = no;
	saveboard[1] = title;
	saveboard[2] = date;
	saveboard[3] = name;
	return saveboard;
}
}
