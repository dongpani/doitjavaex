package methods;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentAhn1 = new Student(); // �ν��Ͻ�1
		Student studentAhn2 = new Student(); // �ν��Ͻ�2
		
		//System.out.println(studentAhn1);
		//System.out.println(studentAhn2);
		
		studentAhn1.studentName = "�ȿ���";
		studentAhn2.studentName = "�赿ȯ";
		
		System.out.println(studentAhn1.getStudentName());
		System.out.println(studentAhn2.getStudentName());

	}

}
