package This;

class Person {
	String name;
	int age;
	
	// �⺻������ -> �����ε� ������ ȣ��.
	Person() {
		this("�̸� ����", 1); // �ڱ��ڽ��� �ν��Ͻ��� ���ڰ� �ִ� �����ڸ� ȣ��.
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void getThisPrint() {
		System.out.println(this);
	}
	
	Person returnThis() {
		return this;
	}
}

public class CallAnotherConst {
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.returnThis());
		
	}

}
