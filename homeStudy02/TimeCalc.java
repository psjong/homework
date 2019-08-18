package homeStudy02;
import java.util.Scanner;

public class TimeCalc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("계산하고 싶은 초단위 값을 입력하세요.");
		int val = scanner.nextInt();
		int h = 0 ;
		int m = 0 ;
		int s = 0 ;
		h = val / 3600 ;
		m = (val%3600)/60 ; 
		s = val % 60 ;
		
		System.out.printf(val + "초 = %d시간 %d분 %d초",h,m,s);
	
	}

}