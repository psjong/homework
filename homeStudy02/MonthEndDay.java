package homeStudy02;
import java.util.Scanner;

public class MonthEndDay {

/**
 	월을 입력하면 해당 월이 몇일까지인지
	알려주는 프로그램을 작성해 주세요.
	단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
	출력문장 : "??월은 **일 까지 입니다."
 */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("월을 입력하면 해당 월이 몇 일인지 알려주는 프로그램입니다.");
		System.out.println("알고싶은 월을 입력하세요.[해달월의 숫자만 입력]");
		int mon = scanner.nextInt();
		
		int eval = 0 ;
		switch(mon) {
		case 1 : eval = 31; break;
		case 2 : eval = 29; break;
		case 3 : eval = 31; break;
		case 4 : eval = 30; break;
		case 5 : eval = 31; break;
		case 6 : eval = 30; break;
		case 7 : eval = 31; break;
		case 8 : eval = 31; break;
		case 9 : eval = 30; break;
		case 10 : eval = 31; break;
		case 11 : eval = 30; break;
		case 12 : eval = 31; break;
		default : System.out.println("Error");break;
		}
		
		System.out.printf("%d월은 %d일까지 입니다.",mon,eval);
		
	}

}
