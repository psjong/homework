package homeStudy04;

public class Member {

	private String id, pw, name, birth, adult, blood;
	private double h, w;
	private int kor, eng, math, sal;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return this.birth;
	}
	
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getAdult() {
		return this.adult;
	}
	
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	
	public void setH(double h) {
		this.h = h;
	}
	public double getH() {
		return this.h;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	public double getW() {
		return this.w;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	
	public void setmath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getSal() {
		return this.sal;
	}
	
	@Override
	public String toString() {
		return String.format("=== 회원정보 ==== \n"
				+ "아이디 : %s \n"
				+ "비밀번호 : %s\n"
				+ "이름 : %s \n"
				+ "생년월일(1900-01-01) : %s \n"
				+ "성인여부(성인/미성년) : %s \n"
				+ "키 : %.1fcm \n"
				+ "몸무게 : %.1fkg \n"
				+ "혈액형 : %s형 \n",id, pw, name, birth, adult, h, w, blood);
	}
	
}
