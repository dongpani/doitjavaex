package Alone;

public class StudentTest {
	
	public static void main(String[] args) {
		Student stduent1 = new Student("ȫ�浿", 1345);
		System.out.println(Student.getCardNumber());
		System.out.println(stduent1.studentName);
		System.out.println(stduent1.studentCode);
		
		System.out.println();
		
		Student stduent2 = new Student("���¾�", 1412);
		System.out.println(Student.getCardNumber());
		System.out.println(stduent2.studentName);
		System.out.println(stduent2.studentCode);
		
	}

}
