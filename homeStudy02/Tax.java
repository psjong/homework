package homeStudy02;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("연봉(만원) : ");
		int val = scanner.nextInt();
		double taxrate = 0.097;
		double tax = val*10000*taxrate ;
		System.out.printf("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f원 입니다.%n", val, name, tax);
		System.out.printf("현재 세율은 %.3f입니다.",taxrate);
		
	}

}
