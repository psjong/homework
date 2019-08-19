package homeStudy03;

public class Student {

	public String getTimeCalc(int sval) {
		int h = 0;
		int m = 0;
		int s = 0;
		h = sval / 3600;
		m = (sval % 3600) / 60;
		s = sval % 60;

		String result = String.format("%d초 = %d시간 %d분 %d초", sval, h, m, s);
		return result;
	}

	public String getAC(int calctype, int a, int b) {
		String result = "";
		switch (calctype) {
		case 1:
			int evaladd = a + b;
			result = String.format("%s + %s = %s", a, b, evaladd);
			break;
		case 2:
			int evaldiv = a - b;
			result = String.format("%s - %s = %s", a, b, evaldiv);
			break;
		case 3:
			int evalmul = a * b;
			result = String.format("%s * %s = %s", a, b, evalmul);
			break;
		case 4:
			int evaldivv = a / b;
			int eval2 = a % b;
			result = String.format("%s / %s = %s [%s]", a, b, evaldivv, eval2);
			break;
		default:
			break;
		}
		return result;
	}

	public String getBMI(String name, double w, double h) {

		double bmi = w / ((h*0.01)*(h*0.01)) ;
		String result = "";
		if(bmi>30)
		{
			result = String.format("%s님은 고도비만 입니다.", name);
		}else if(bmi>25)
		{
			result = String.format("%s님은 비만 입니다", name);
		}else if(bmi>23)
		{
			result = String.format("%s님은 과체중 입니다.", name);
		}else if(bmi>18.5)
		{
			result = String.format("%s님은 정상 입니다.", name);
		}else
		{
			result = String.format("%s님은 저체중 입니다." , name);
		}
		return result;
	}

	public String howMuch(int val, int num) {
		int total = val * num ; 
		int eval = total - (total/10) ;
		String result = String.format("총 금액은 %d원 입니다.%n비싸요, 10%% 깍아주세요. %n그럼 %d원만 주세요.", total, eval);
		return result;
	}

	public String getLeepYear(int year) {
		String eval = "";
		if(year%4!=0) {
			eval = "평년" ;
		}else if(year%100!=0){
			eval = "윤년";
		}else if(year%400!=0) {
			eval = "평년";
		}else {
			eval = "윤년";
		}
		String result = String.format("%d년도는 %s입니다.",year,eval);
		return result;
	}
	
	public String getReporCard(String[] subject, int[] score) {
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
		String result = String.format("학생명     %s       %s       %s     총점       평균       합격여부  %n"
				+ "================================================= %n"
				+ "홍길동    %d     %d     %d     %d    %d      %s"  , subject[0], subject[1], subject[2],score[0], score[1], score[2], sum, avg, eval) ;
		return result;
	}

	public String getTax(String name2, int sal) {
		double taxrate = 0.097;
		double tax = sal*10000*taxrate ;
		String result = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f원 입니다.%n현재 세율은 %.3f입니다.",sal ,name2 ,tax, taxrate);
		return result ;
	}

	public String passOrFail(String[] subject2, int[] score2) {
		int sum = score2[0]+score2[1]+score2[2];
		int avg = sum/3 ;
		String eval = "";
		if(avg >= 90) {
			eval = "장학생";
		}else if(avg >=70) {
			eval = "합격";
		}else {
			eval = "불합격";
		}
		String result = String.format("학생명     %s       %s       %s     총점       평균       합격여부  %n"
				+ "================================================= %n"
				+ "홍길동    %d     %d     %d     %d    %d      %s"  , subject2[0], subject2[1], subject2[2],score2[0], score2[1], score2[2], sum, avg, eval) ;
		return result;
	}
	
	public String getMonthEndDay(int mon) {
		int eval = 0 ;
		switch(mon) {
		case 1 : eval = 31; break;
		case 2 : eval = 29; break;
		case 3 : eval = 31; break;
		case 4 : eval = 30; break;
		case 5 : eval = 31; break;
		case 6 : eval = 30; break;
		case 7 : eval = 31; break;
		case 8 : eval = 31; break;
		case 9 : eval = 30; break;
		case 10 : eval = 31; break;
		case 11 : eval = 30; break;
		case 12 : eval = 31; break;
		default : System.out.println("Error");break;
		}
		String result = String.format("%d월은 %d일까지 입니다.", mon,eval);
		return result ;
	}

	public String join(String[] data, String[] eval2) {
		String result = String.format("===== 회원정보  ==================== %n"
				+ "%s : %s  %n%s : %s  %n%s : %s  %n%s : %s  %n%s : %s  %n%s : %scm  %n%s : %skg  %n%s : %s형  %n",
				data[0],eval2[0],data[1],eval2[1],data[2],eval2[2],data[3],eval2[3],data[4],eval2[4],data[5],eval2[5],data[6],eval2[6],data[7],eval2[7]); 
		return result;		
	}
		
	public String getRanking(String[] name3, double[] recode) {
		String no1 = "", no2="" , no3="";
		double no1record=0 , no2record=0 , no3record=0 ;
		
		if (recode[0]<= recode[1]) {
			if(recode[0]<=recode[2]) {
				no1record = recode[0]; no1 = name3[0];
			}else {
				no2record = recode[0]; no2 = name3[0];
			}
		}else if(recode[0]<=recode[2]){
			no2record = recode[0]; no2 = name3[0];
		}else {
			 no3record = recode[0] ; no3 = name3[0];
		}
		
		if ( recode[0] == no1record ) {
			if(recode[1] <= recode[2]) {
				no2record = recode[1]; no2 = name3[1];
				no3record = recode[2]; no3 = name3[2];
			}else {
				no2record = recode[2]; no2 = name3[2];
				no3record = recode[1]; no3 = name3[1];
			}
		}else {
			if(recode[0] == no2record ) {
				if(recode[1] <= recode[2]) {
					no1record = recode[1]; no1 = name3[1];
					no3record = recode[2]; no3 = name3[2];
				}else {
					no1record = recode[2]; no1 = name3[2];
					no3record = recode[1]; no3 = name3[1];
				}
			}else {
				if(recode[1] <= recode[2]) {
					no1record = recode[1]; no1 = name3[1];
					no2record = recode[2]; no2 = name3[2];
				}else {
					no1record = recode[2]; no1 = name3[2];
					no2record = recode[1]; no2 = name3[1];
				}
			}
		}
		
		String result = String.format("1등 : %s 기록(%.1f초) %n2등 : %s 기록(%.1f초) %n3등 : %s 기록(%.1f초) %n", no1,no1record,no2,no2record,no3,no3record);
		return result ;
	}
	
	public String getScoreCalc(String sequence, int serise , int count ) {
		
		int avge = serise / count ; 	
		String result = String.format("현재까지의 누적값은  %s= %d 이고, 평균은 %d 입니다.", sequence , serise , avge);
		return result ;
	}
	
}



