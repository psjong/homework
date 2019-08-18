package homeStudy02;
import java.util.Scanner;
import java.util.Arrays;

public class Ranking {

	public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);
	
	String[] name = {"A 선수" , "B 선수" , "C 선수" } ;
	
	double[] recode = new double [3];
	
	for(int i=0 ; i<=2 ; i++) {
		System.out.printf("%s 기록 : ", name[i]);
		recode[i] = scanner.nextDouble();
	}
	
	String no1 = "", no2="" , no3="";
	double no1record=0 , no2record=0 , no3record=0 ;
	
	if (recode[0]<= recode[1]) {
		if(recode[0]<=recode[2]) {
			no1record = recode[0]; no1 = name[0];
		}else {
			no2record = recode[0]; no2 = name[0];
		}
	}else if(recode[0]<=recode[2]){
		no2record = recode[0]; no2 = name[0];
	}else {
		 no3record = recode[0] ; no3 = name[0];
	}
	
	if ( recode[0] == no1record ) {
		if(recode[1] <= recode[2]) {
			no2record = recode[1]; no2 = name[1];
			no3record = recode[2]; no3 = name[2];
		}else {
			no2record = recode[2]; no2 = name[2];
			no3record = recode[1]; no3 = name[1];
		}
	}else {
		if(recode[0] == no2record ) {
			if(recode[1] <= recode[2]) {
				no1record = recode[1]; no1 = name[1];
				no3record = recode[2]; no3 = name[2];
			}else {
				no1record = recode[2]; no1 = name[2];
				no3record = recode[1]; no3 = name[1];
			}
		}else {
			if(recode[1] <= recode[2]) {
				no1record = recode[1]; no1 = name[1];
				no2record = recode[2]; no2 = name[2];
			}else {
				no1record = recode[2]; no1 = name[2];
				no2record = recode[1]; no2 = name[1];
			}
		}
	}
	
	
	System.out.printf("1등 : %s 기록(%.1f초) %n",no1, no1record);
	System.out.printf("2등 : %s 기록(%.1f초) %n",no2, no2record);
	System.out.printf("3등 : %s 기록(%.1f초) %n",no3, no3record);
	}

}
