package homeStudy04;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Service service = new Service();
		
		while(true) {
			
			System.out.println("메뉴 : 0.종료  1.회원가입  2.회원정보  3.BMI  4.ReportCard  5.Tax");
			
			switch(scanner.nextInt()) {
			
			case 0 : return;
				
			case 1 :
				System.out.println("==== 회원가입 ====");
				System.out.println("아래 정보를 입력하세요.");
				System.out.println("아이디 : ");
				member.setId(scanner.next());
				System.out.println("비밀번호 : ");
				member.setPw(scanner.next());
				System.out.println("이름 : ");
				member.setName(scanner.next());
				System.out.println("생년월일(1900-01-01) : ");
				member.setBirth(scanner.next());
				System.out.println("성인여부(성인/미성년) : ");
				member.setAdult(scanner.next());
				System.out.println("키 : ");
				member.setH(scanner.nextDouble());
				System.out.println("몸무게 : ");
				member.setW(scanner.nextDouble());
				System.out.println("혈액형 : ");
				member.setBlood(scanner.next());
				System.out.println("국어점수 : ");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수 : ");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수 : ");
				member.setmath(scanner.nextInt());
				System.out.println("연봉 : ");
				member.setSal(scanner.nextInt());
				break;
				
			case 2 : 
				System.out.println(member.toString());
				break;
				
			case 3 :
				System.out.println("BMI 측정");
				System.out.println(service.getBmi(member));
				break;
			case 4 : 
				System.out.println("=== Report Card ===");
				System.out.println(service.getReportCard(member));
				break;
				
			case 5 :
				System.out.println("Tax 계산기");
				System.out.println(service.getTax(member));
				break;
			
			}
		}
		
	}

}
