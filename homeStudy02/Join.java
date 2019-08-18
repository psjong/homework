package homeStudy02;
import java.util.Scanner;

public class Join {

	public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);
	
	System.out.println("비트헬스장 회원가입");
	System.out.println("아래 질문에 회원정보를 입력해주세요.");
	
	String[] data = {"아이디","비밀번호","이름"
			,"생년월일(예)1990-05-05","성인여부(성인true,미성년false)"
			,"키(소수점 첫째자리까지)","몸무게(소수점 첫째자리까지)","혈액형(A)"};

	String[] eval = new String [8];
	
	
	for(int i =0 ; i<=7 ; i++) {
		System.out.printf("%s : ", data[i]);
		eval[i] = scanner.next();
	}
	
	System.out.println("===== 회원정보  ====================");
	
	for (int i=0 ; i<=7 ; i++) {
		System.out.printf("%s : %s \n", data[i], eval[i]);
	}
	
	}

}
