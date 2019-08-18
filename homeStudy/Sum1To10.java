package homeStudy;

public class Sum1To10 {

	public static void main(String[] args) {

		String sequence = "";
		int serise = 0 ;
		for (int i = 1 ; i<=10 ; i++) {
			if(i!=10) {
				sequence += i + " + ";
			}else {
				sequence  += i + " = ";
			}
			serise += i ; 
		}
		System.out.println(sequence + serise);
	}

}
