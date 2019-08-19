package homeStudy02;
import java.util.Scanner ;

public class ScoreCalc {
	// 마지막 + 기호가 생략되지 않습니다. 
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		
	String sequence = "";
	int serise = 0 , avge = 0 , count = 0 ;

	while(true) {
		System.out.println("더하시려는 숫자를 입력하세요.(종료는 -1)");
		int num = scanner.nextInt();
		if(num != -1) {
			sequence += num + " + " ; 
			serise += num ;
			count++;
		}else { break;	}
			
	}
	avge = serise / count ; 	
	
	System.out.printf("현재까지의 누적값은  %s= %d 이고, 평균은 %d 입니다.", sequence , serise , avge);
	}
}


