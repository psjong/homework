package homestudy05_grade;

import javax.swing.JOptionPane;

import homestudy05_calendar.MyCalendar;
import homestudy05_calendar.MyCalendarService;

public class GradeController {

	public static void main(String[] args) {

		Grade grade = new Grade();
		GradeService gradeService = new GradeService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료  1.ReportCard")) {
			
			case "0" : 
				return;
			
			case "1" :
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요.")));    
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요.")));    
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요.")));    
				JOptionPane.showMessageDialog(null, gradeService.getReportCard(grade));
				break;
			
			case "2" :

				break;
		
			}
		}
	}
}
