package firstExam;

public class stars01 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i+=2) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
