package j0516;

import java.util.Scanner;

public class Class0516_05 {
public static void main(String[] args) {
	   // 리모콘 그림 그리기

    // 1,2,3,4,5,6,7,8 채널 바꾸기
    // channelUp, channelDown, 이전 보기, 자막 버튼
    // volumeUp, volumeDown, 음소거
    // 전원
    //
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    int tempVolume = 0; //임시 볼륨 저장공간
    // 객체 선언
    Tv t = new Tv();

    while (true) {
    	System.out.println("--------------------------");
       System.out.println("[ 리모콘 프로그램 ]");
       System.out.println("1. 전원 on/off");
       System.out.println("2. 채널 up");
       System.out.println("3. 채널 down");
       System.out.println("4. 볼륨 up");
       System.out.println("5. 볼륨 down");
       System.out.println("6. 음소거");
       
       System.out.println("--------------------------");
       System.out.println(" 원하는 번호를 입력하세요 ");
       System.out.println("--------------------------");
       
       choice = scan.nextInt();
    
       switch(choice) {
       
       case 1:
    	   t.power();//객체 사용방법: 참조변수명.메소드명()
    	   if(t.power==true) {
    		   System.out.println("<< 전원 ON >>");
    	   } else {
    		   System.out.println("<< 전원 OFF >>");
    	     		   
    	   }//if
    	   System.out.println("---------------------");
      
       
       case 2:
    	   if (t.power!=true) {
    		   System.out.println("전원을 켜야 작동합니다");
    		   System.out.println("--------------------");
			break;
		}
    	   t.channelUp();
    	   System.out.println("현재 채널 : "+t.channel);
    	   System.out.println();
    	   break;
    	   
       case 3:
    	   if (t.power!=true) {
    		   System.out.println("전원을 켜야 작동합니다");
    		   System.out.println("--------------------");
    		   break;
    	   }
    	   t.channelDown();
    	   System.out.println("현재 채널 : "+t.channel);
    	   System.out.println();
    	   break;
    	   
       case 4:
    	   if (t.power != true) {
    		   System.out.println("전원을 켜야 작동합니다");
    		   System.out.println("--------------------");
    		   break;
    	   }
    	   t.volumeUp();
    	   System.out.println("현재 볼륨 : "+ t.volume);
    	   System.out.println();
    	  break; 
       
       case 5:
    	   if (t.power != true) {
    		   System.out.println("전원을 켜야 작동합니다");
    		   System.out.println("--------------------");
    		   break;
    	   }
    	   t.volumeDown();
    	   System.out.println("현재 볼륨 : "+ t.volume);
    	   System.out.println();
    	  break;
       case 6:
    	   if (t.power != true) {
    		   System.out.println("전원을 켜야 작동합니다");
    		   System.out.println("--------------------");
    		   break;
    	   }
    	   if(t.volume==0) {
    		   t.volume = tempVolume; //임시 볼륨 높이 입력
    	   System.out.println("음소거 해제");
    	   System.out.println("현재 볼륨 : "+t.volume);
    	   
    	   } else {
    	   tempVolume = t.volume; //임시 볼륨 높이 입력
    	   t.volume = 0;
    	   System.out.println("음소거 실행");
    	   System.out.println("현재 볼륨 : "+t.volume);
    	   }
    	   
       }//switch
//					    break;
    }//while

 }//main

}//class