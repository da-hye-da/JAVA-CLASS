package j0530;

import java.util.Scanner;

public class C0530_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "ht";
		String str2 = "http";
		
		String[] files = {"fifamobile","asgard","GODZILLADF","csonline"};
		String domain = "https://forum.nexon.com/";
		String url = "https://forum.nexon.com/asgard";
		String input = url.substring(domain.length());
//		System.out.println(input);
//		System.out.println("파일명 : "+url.substring(domain.length()));
		
		
		System.out.println("원하는 페이지를 호출하시오.");
		input = scan.next();
		
		
		//if문
		if(input.equalsIgnoreCase(files[0])) {
			System.out.println("fifamobile 페이지를 호출합니다.");
		} else if(input.equalsIgnoreCase(files[1])) {
			System.out.println("asgard 페이지를 호출합니다.");
		} else if(input.equalsIgnoreCase(files[2])) {
			System.out.println("GodzilaDF 페이지를 호출합니다.");
		} else {
			System.out.println("csonline 페이지를 호출합니다.");
		}
			
		//switch문
//		switch(input) {
//		case "fifamobile" :
//			System.out.println("fifamobile 페이지를 열어줍니다.");
//			break;
//		case "asgard" :
//			System.out.println("asgard 페이지를 열어줍니다.");
//			break;
//		case "GodzillaDF" :
//			System.out.println("GodzillaDF 페이지를 열어줍니다.");
//			break;
//		case "csonline" :
//			System.out.println("csonline 페이지를 열어줍니다.");
//			break;
//		}
			
		
		//for문
//		String urls = url.substring(domain.length());
//
//		for (int i = 0; i < 4; i++) {	
//			if (urls.equals(files[i])) {
//				System.out.println("files의 " +(i+1) + "번째에 들어있습니다");
//			}
//		}
			
	}

}
