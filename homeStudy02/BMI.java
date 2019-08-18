package homeStudy02;
import java.util.Scanner;

public class BMI {
/**
	사람의 이름을 입력하고, 몸무게 , 키를 입력하면
	해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
	BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

	Example for 175 cm height and 70 kg weight:
	BMI = 70 / (1.75 * 1.75) = 22.86

	(bmi > 30.0) 고도비만
	(bmi > 25.0) 비만
	(bmi > 23.0) 과체중
	(bmi > 18.5) 정상
	저체중
 */
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
