package homeStudy;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("선택 : 1.가위  2.바위  3.보");
		
		int computer = random.nextInt(2)+1;
		int choice = scanner.nextInt();
		
		String eval = "";
		
		switch (choice) {
		case 1 : 
			
			switch(computer) {
			case 1 : eval = "무승부"; break;
			case 2 : eval = "패배"; break;
			case 3 : eval = "승리"; break;
			}
			System.out.println(computer + eval); break;
			
		case 2 : 
			
			switch(computer) {
			case 2 : eval = "무승부"; break;
			case 3 : eval = "패배"; break;
			case 1 : eval = "승리"; break;
			}
			System.out.println(computer + eval); break;
		
		case 3 : 
			
			switch(computer) {
			case 3 : eval = "무승부"; break;
			case 1 : eval = "패배"; break;
			case 2 : eval = "승리"; break;
			}
			System.out.println(computer + eval); break;
			
		}
		
	}

}
