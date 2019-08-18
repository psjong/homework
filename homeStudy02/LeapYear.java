package homeStudy02;
import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("윤년 / 평년 판단기");
		System.out.println("연도를 입력하세요.");
		int val = scanner.nextInt();
		String eval = "";
		
		if(val%4!=0) {
			eval = "평년" ;
		}else if(val%100!=0){
			eval = "윤년";
		}else if(val%400!=0) {
			eval = "평년";
		}else {
			eval = "윤년";
		}
		
		System.out.printf("%d년도는 %s입니다.",val,eval);
		
	}

}
