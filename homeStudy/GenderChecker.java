package homeStudy;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("주민번호를 적어주세요.");
		String jmnumber = scanner.next();
		int code = Integer.parseInt(jmnumber.substring(7,8));
		String eval = "";
		
		switch(code) {
		case 0 : eval = "1800 ~ 1899년에 태어난 여성"; break;
		case 1 : eval = "1900 ~ 1999년에 태어난 남성"; break;
		case 2 : eval = "1900 ~ 1999년에 태어난 여성"; break;
		case 3 : eval = "2000 ~ 2099년에 태어난 남성"; break;
		case 4 : eval = "2000 ~ 2099년에 태어난 여성"; break;
		case 5 : eval = "1900 ~ 1999년에 태어난 외국인 남성"; break;
		case 6 : eval = "1900 ~ 1999년에 태어난 외국인 여성"; break;
		case 7 : eval = "2000 ~ 2099년에 태어난 외국인 남성"; break;
		case 8 : eval = "2000 ~ 2099년에 태어난 외국인 여성"; break;
		case 9 : eval = "1800 ~ 1899년에 태어난 남성"; break;
		default : eval = "Error"; break;
		}
		
		System.out.println(eval);
		
	}

}
