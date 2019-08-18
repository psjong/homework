package homeStudy02;

import java.util.Scanner ;

public class ArithmeticCalculator {

	/**
	         프로그램을 하나 개발해야 합니다.
		교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
		복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
		몫과 나머지값으로 출력하면 된답니다.
		출력결과물은 예를 들어
		5 + 5 = 10
		2 - 7 = -5
		이렇게 되고,
		10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
		그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
	 */
	
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
