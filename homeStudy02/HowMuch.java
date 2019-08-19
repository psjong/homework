package homeStudy02;
import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("얼마에요?");
		int val = scanner.nextInt();
		System.out.printf("%s원 입니다. %n", val);
		System.out.println("몇 개 드릴까요?");
		int num = scanner.nextInt();
		System.out.printf("%s개 주세요.%n", num);
		
		int total = val * num ; 
		System.out.printf("총 금액은 %s원 입니다. %n", total);
		System.out.println("비싸요, 10% 깍아주세요.");
		
		int eval = total - (total/10) ;
		System.out.printf("그럼 %s원만 주세요.", eval);
		
	}

}
