package homeStudy;

import java.util.Scanner;

public class OddSumStartToEnd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("시작값을 입력하세요");
		int start = scanner.nextInt();
		System.out.println("마지막 값을 입력하세요");
		int end = scanner.nextInt();
		
		String sequence = "";
		int serise = 0 ;
		for(int i=start ; i<=end ; i++) {
		
			switch(i%2){
				case 1 : 
					int end2 = i ;
					end2 = ( end == end2) ? end : end-1 ;  
					sequence += (i == end2)? i + " = " : i + " + ";  //eval += (i==5)? i + " = " : i + "+";	//3항 이용
					serise += i ; 
					break;
				case 0 : break;
				default : break;
			}
			
		}
		
		System.out.println(sequence + serise);	
		
	}

}
