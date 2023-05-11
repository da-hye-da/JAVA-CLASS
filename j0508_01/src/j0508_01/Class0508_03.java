package j0508_01;

public class Class0508_03 {
   
   static int num; //전역변수- class 영역에서도 변수선언 가능 /num에 값을 입력 안하면 0이라는 값을 기본값으로 넣어줌
   
   public static void main(String[]args) {
      int num; //지역변수(한군데에서만 사용가능한 변수) / num에 값을 입력 안하면 오류 발생
//      System.out.println("main메소드 num호출 : " + num); //so num이 null값이 되므로 호출시 error 발생함
      sub();
   }
   
   static void sub() {
//      System.out.println(num); //이렇게는 사용 불가
      System.out.println("sub메소드 num호출 : " + num);
   }

}