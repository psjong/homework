package homeStudy03;
import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		String result = "";
		
		
		while(true) {
			
				System.out.println("0.종료  1.TimeCalc  2.AC  3.BMI  4.HowMuch  5.LeepYear  6.ReportCard"
						+ "  7.Tax  8.PassOrFail  9.MonthEndDay  10.Join  11.Ranking  12.ScoreCalc");
				int choice = scanner.nextInt();
			
				switch(choice) {
				case 0 : return;
				
				case 1 : 
					System.out.println("Time Calculator");
					System.out.println("계산하고 싶은 초단위 값을 입력하세요.");
					int sval = scanner.nextInt();
					result = student.getTimeCalc(sval);
					System.out.println(result);
					break;
					
				case 2 : 
					System.out.println("  ***비트캠프 계산기***");
					System.out.println("사용하고 싶은 연산을 선택하세요.");
					System.out.println("1.덧셈  2.뺄셈  3.곱셈  4.나눗셈");
					int calctype = scanner.nextInt();
					System.out.println("계산할 첫 번째 수를 입력하세요");
					int a = scanner.nextInt();
					System.out.println("계산할 두 번째 수를 입력하세요");
					int b = scanner.nextInt();
					result = student.getAC(calctype, a, b);
					System.out.println(result);
					break;
					
				case 3 : 
					System.out.println("==== BMI 측정기 ====");
					System.out.println("이름을 적으세요.");
					String name = scanner.next();
					System.out.printf("%s의 몸무게를 적으세요. [단위 : kg] \n",name);
					double w = scanner.nextDouble();
					System.out.printf("%s님의 키를 적으세요. [단위 : cm] \n",name);
					double h = scanner.nextDouble();
					result = student.getBMI(name, w, h);
					System.out.println(result);
					break;
					
				case 4 : 
					System.out.println("==== How Much ====");
					System.out.println("얼마에요?");
					int val = scanner.nextInt();
					System.out.printf("%s원 입니다. %n", val);
					System.out.println("몇 개 드릴까요?");
					int num = scanner.nextInt();
					System.out.printf("%s개 주세요.%n", num);
					result = student.howMuch(val, num);
					System.out.println(result);
					break;
				
				case 5 : 
					System.out.println("==== 윤년/평년 판단기 ====");
					System.out.println("연도를 입력하세요.");
					int year = scanner.nextInt();
					result = student.getLeepYear(year);
					System.out.println(result);
					break;
				
				case 6 : 
					System.out.println("==== Report Card ====");
					String[] subject = {"국어","영어","수학"};
					int[] score = new int[3];
					for(int i = 0 ; i <=2 ; i++) {
						System.out.printf("%s 점수를 입력하세요.\n", subject[i]);
						score[i] = scanner.nextInt();
					}
					result = student.getReporCard(subject, score);
					System.out.println(result);
					break;
				
				case 7 : 
					System.out.println("이름 : ");
					String name2 = scanner.next();
					System.out.println("연봉(만원) : ");
					int sal = scanner.nextInt();
					result = student.getTax(name2, sal);
					System.out.println(result);
					break;
					
				case 8 : 
					System.out.println("==== Report Card ====");
					String[] subject2 = {"국어","영어","수학"};
					int[] score2 = new int[3];
					for(int i = 0 ; i <=2 ; i++) {
						System.out.printf("%s 점수를 입력하세요.\n", subject2[i]);
						score2[i] = scanner.nextInt();
					}
					result = student.passOrFail(subject2, score2);
					System.out.println(result);
					break;
					
				case 9 : 
					System.out.println("월을 입력하면 해당 월이 몇 일인지 알려주는 프로그램입니다.");
					System.out.println("알고싶은 월을 입력하세요.[해달월의 숫자만 입력]");
					int mon = scanner.nextInt();
					result = student.getMonthEndDay(mon);
					System.out.println(result);
					break;
					
				case 10 : 
					System.out.println("비트헬스장 회원가입");
					System.out.println("아래 질문에 회원정보를 입력해주세요.");
					
					String[] data = {"아이디","비밀번호","이름"
							,"생년월일(예)1990-05-05","성인여부(성인true,미성년false)"
							,"키(소수점 첫째자리까지)","몸무게(소수점 첫째자리까지)","혈액형(A)"};
					String[] eval2 = new String [8];
					for(int i =0 ; i<=7 ; i++) {
						System.out.printf("%s : ", data[i]);
						eval2[i] = scanner.next();
					}
					result = student.join(data, eval2);
					System.out.println(result);
					break;
					
				case 11 : 
					String[] name3 = {"A 선수" , "B 선수" , "C 선수" } ;
					
					double[] recode = new double [3];
					
					for(int i=0 ; i<=2 ; i++) {
						System.out.printf("%s 기록 : ", name3[i]);
						recode[i] = scanner.nextDouble();
					}
					result = student.getRanking(name3, recode);
					System.out.println(result);
					break;

				case 12 : 
					String sequence = "";
					int serise = 0 , avge = 0 , count = 0 ;
					while(true) {
						System.out.println("더하시려는 숫자를 입력하세요.(종료는 -1)");
						int num2 = scanner.nextInt();
						if(num2 != -1) {
							sequence += num2 + " + " ; 
							serise += num2 ;
							count++;
							}else { break;	}
					}
					result = student.getScoreCalc(sequence, serise, count);
					System.out.println(result);
					break;
					
				default : System.out.println("잘못된 값을 입력하였습니다."); break;	
			}
			
		}
		
	}

}