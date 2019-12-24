package statics;

public class StudentTest1 {
	 public static void main(String[] args) {
		 Student studentLee = new Student();
		 studentLee.setStudentName("������");
//		 System.out.println(studentLee.studentID);
//		 System.out.println(Student.serialNum);
		 System.out.println(Student.getSerialNum());
		 System.out.println(studentLee.getStudentName());
		 
		 Student studentKim = new Student();
		 studentKim.setStudentName("�赿ȯ");
//		 System.out.println(studentKim.studentID);
//		 System.out.println(Student.serialNum);
		 System.out.println(Student.getSerialNum());
		 System.out.println(studentKim.getStudentName());
		 
		 
		 
		 
		 
	 }
}
