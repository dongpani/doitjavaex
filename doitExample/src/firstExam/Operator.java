package firstExam;

public class Operator {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 2;
		char operator = '+';
		
		/*
		if(operator == '+') {
			System.out.println(num + num2);
		}else if(operator == '-') {
			System.out.println(num - num2);
		}else if(operator == '*') {
			System.out.println(num * num2);
		}else if(operator == '/') {
			System.out.println(num / num2);
		}else {
			System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
		}
		*/
		
		switch (operator) {
			case '+':
				System.out.println(num + num2);
				break;
			case '-':
				System.out.println(num - num2);
				break;
			case '*':
				System.out.println(num * num2);
				break;
			case '/':
				System.out.println(num / num2);
				break;				
	
			default:
				System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
				break;
		}
		
		
	}
}
