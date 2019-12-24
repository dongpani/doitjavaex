package ArrayExam;

public class CharArray {	
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 97;
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			System.out.println(alphabets[i]);
		}
		
	}
}
