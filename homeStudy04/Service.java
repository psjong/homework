package homeStudy04;


public class Service {

	public String getBmi(Member member) {
	
		String name = member.getName();
		double h = member.getH();
		double w = member.getW();
		double bmi = w / (h*h*0.0001);
		String eval = "";
		
		if (bmi>30) {
			eval = "고도비만";
		}else if(bmi>25) {
			eval = "비만";
		}else if(bmi>23) {
			eval = "과제중";
		}else if(bmi>18.5){
			eval = "정상";
		}else {
			eval = "저체중";
		}
		
		String result = String.format("%s님은 %s 입니다.", name, eval);
		return result;
		
	}
	
	public String getReportCard(Member member) {
		
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int total = kor + eng + math ;
		int avg = total /3 ;
		String pass = "";
		if(avg >= 90) {
			pass = "장학생";
		}else if(avg >=70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}		
		
		String result = String.format("학생명          국어          영어          수학          총점          평균          합격여부\n"
				+ "================================================\n"
				+ "%s     %d     %d     %d     %d     %d     %s", name, kor, eng, math, total, avg, pass);
		return result ;
	}
	
	public String getTax(Member member) {
		String name = member.getName();
		int sal = member.getSal();
		double taxrate = 0.097;
		double tax = sal*taxrate;
		
		String result = String.format("%s님께서 납부할 세금은 %.0f원 입니다.%n"
				+ "현재 세율은 %.3f입니다.\n", name, tax, taxrate);
		return result;
	}
	
}
