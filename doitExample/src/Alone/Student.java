package Alone;

public class Student {
	private static int cardNumber;
	int studentCode;
	String studentName;
	
	public Student(String name, int studentCode) {
		this.studentName = name;
		this.studentCode = studentCode;
		cardNumber = studentCode + 100;
	}
	
	public static int getCardNumber() {
		return cardNumber;
	}
	
}
