package homestudy05_calendar;
import javax.swing.JOptionPane;

public class MyCalendarControler {

	public static void main(String[] args) {

		MyCalendar myCalendar = new MyCalendar();
		MyCalendarService myCalendarService = new MyCalendarService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료  1.마지막 날짜  2.평년/윤년판별")) {
			
			case "0" : 
				return;
			
			case "1" :
				myCalendar.setMonth(Integer.parseInt(JOptionPane.showInputDialog("알고싶은 월을 입력하세요.")));    
				JOptionPane.showMessageDialog(null, myCalendarService.getEndDay(myCalendar));
				break;
			
			case "2" :
				myCalendar.setYear(Integer.parseInt(JOptionPane.showInputDialog("알고싶은 연도를 입력하세요.")));
				JOptionPane.showMessageDialog(null, myCalendarService.getLeepYear(myCalendar));
				break;
			}
		}
		
	}

}
