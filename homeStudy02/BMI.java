package homeStudy02;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("이름을 적으세요.");
		String name = scanner.next();
		System.out.printf("%s의 몸무게를 적으세요. [단위 : kg] \n",name);
		double w = scanner.nextDouble();
		System.out.printf("%s님의 키를 적으세요. [단위 : cm] \n",name);
		double h = scanner.nextDouble();
		double h2 = h/100 ; 
		
		double bmi = w / (h2*h2) ; 
		
		if (bmi>30) {
			System.out.printf("%s님은 고도비만 입니다. 비만도(BMI) = %.1f", name, bmi) ;
		}else if(bmi>25) {
			System.out.printf("%s님은 비만 입니다. 비만도(BMI) = %.1f", name, bmi) ;
		}else if(bmi>23) {
			System.out.printf("%s님은 과체중 입니다. 비만도(BMI) = %.1f", name, bmi) ;
		}else if(bmi>18.5){
			System.out.printf("%s님은 정상 입니다. 비만도(BMI) = %.1f", name, bmi) ;
		}else {
			System.out.printf("%s님은 저체중 입니다. 비만도(BMI) = %.1f", name, bmi) ;
		}
		
	}

}
