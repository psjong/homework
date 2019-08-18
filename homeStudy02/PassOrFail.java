package homeStudy02;
import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] subject = {"국어","영어","수학"};
		double[] score = new double [3];
		
		for (int i = 0 ; i <=2 ; i++) {
			System.out.printf("%s 점수를 입력하시오 %n", subject[i]);
			score[i] = scanner.nextInt();
		}
		
		double sum = score[0] + score[1] + score[2] ;
		double avg = sum / 3 ;
		String eval = "";
		
		if (avg >= 90) {
			eval = "장학생";
		}else if(avg >= 70){
			eval = "합격";
		}else {
			eval = "불합격";
		}
		
		System.out.printf("학생     %s         %s          %s          총점              평균          합격여부 %n",subject[0],subject[1],subject[2]);
		System.out.println("================================================");
		System.out.printf("학생     %.0f     %.0f     %.0f     %.0f     %.1f     %s",score[0],score[1],score[2],sum,avg, eval);
		
	}
}
