package homeStudy02;
import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		String[] subject = {"국어","영어","수학"};
		int[] score = new int[3];
		
		for(int i = 0 ; i <=2 ; i++) {
			System.out.printf("%s 점수를 입력하세요.\n", subject[i]);
			score[i] = scanner.nextInt();
		}
		
		int sum = score[0]+score[1]+score[2];
		int avg = sum/3 ;
		
		String eval = "";
		
			if(avg >= 90) {
			eval = "장학생";
		}else if(avg >=70) {
			eval = "합격";
		}else {
			eval = "불합격";
		}

		System.out.println("  학생명          국어          영어          수학          총점          평균          합격여부");
		System.out.println("====================================================");
		System.out.printf("   홍길동          %d     %d     %d     %d    %d      %s", score[0], score[1], score[2], sum, avg, eval);
		
	}

}
