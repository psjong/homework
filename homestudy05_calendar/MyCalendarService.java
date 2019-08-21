package homestudy05_calendar;

public class MyCalendarService {

	public String getEndDay(MyCalendar myCalendar) {
		String result ="";
		
		int eval = 0 ;
		switch(myCalendar.getMonth()) {
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
		default : result = "월을 잘못 입력하셨습니다.";break;
		}
		
		result = String.format("%d월은 %d일까지 입니다.",myCalendar.getMonth(),eval);
		return result;
	}
	
	public String getLeepYear(MyCalendar myCalendar) {
		String result = "";
		
		String eval2 = "";
		
		if(myCalendar.getYear()%4!=0) {
			eval2 = "평년" ;
		}else if(myCalendar.getYear()%100!=0){
			eval2 = "윤년";
		}else if(myCalendar.getYear()%400!=0) {
			eval2 = "평년";
		}else {
			eval2 = "윤년";
		}
		
		result = String.format("%d년도는 %s입니다.",myCalendar.getYear(),eval2);
		return result;
	}
	
	
}
