package homeStudy02;
import java.util.Scanner ;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("  ***비트캠프 계산기***");
		System.out.println("사용하고 싶은 연산을 선택하세요.");
		System.out.println("1.덧셈  2.뺄셈  3.곱셈  4.나눗셈");
		
		int choice = scanner.nextInt();
		System.out.println("계산할 첫 번째 수를 입력하세요");
		int a = scanner.nextInt();
		System.out.println("계산할 두 번째 수를 입력하세요");
		int b = scanner.nextInt();
				
		switch(choice) {
		case 1 : 
			int evaladd = a + b ;
			System.out.printf("%s + %s = %s",a,b,evaladd);
			break;
		case 2 : 
			int evaldiv = a - b ;
			System.out.printf("%s - %s = %s",a,b,evaldiv);
			break;
		case 3 : 
			int evalmul = a * b ;
			System.out.printf("%s * %s = %s",a,b,evalmul);
			break;
		case 4 : 
			int evaldivv = a / b ;
			int eval2 = a % b ;
			System.out.printf("%s / %s = %s [%s]",a,b,evaldivv,eval2);
			break;
		default : break;
		
		}
		
	}

}
