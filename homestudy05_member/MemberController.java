package homestudy05_member;

import javax.swing.JOptionPane;

import homestudy05_grade.Grade;
import homestudy05_grade.GradeService;

public class MemberController {

	public static void main(String[] args) {

		Member member = new Member();
		MemberService memberService = new MemberService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료   1.회원가입   2.My Page")) {
			
			case "0" : 
				return;
			
			case "1" :
				
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				member.setId(JOptionPane.showInputDialog("아이디를 입력하세요."));
				member.setPw(JOptionPane.showInputDialog("비밀번호를 입력하세요."));
				member.setBirth(JOptionPane.showInputDialog("생년월일을 입력하세요."));
				member.setAdult(JOptionPane.showInputDialog("성인/미성년을 입력하세요."));
				member.setH(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요.")));
				member.setW(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요.")));
				member.setBlood(JOptionPane.showInputDialog("혈액형을 입력하세요."));
				break;
			
			case "2" :
				JOptionPane.showMessageDialog(null, memberService.getMyPage(member) );
				break;
		
			}
		}
		
	}

}
