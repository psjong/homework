package homestudy05_grade;

public class GradeService {

	public String getReportCard(Grade grade) {
		
		String result = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
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
		
		result = String.format("학생명          국어          영어          수학          총점          평균          합격여부\n"
				+ "================================================\n"
				+ " 홍길동     %d     %d     %d     %d     %d     %s", kor, eng, math, total, avg, pass);
		return result ;
		
	}

}
