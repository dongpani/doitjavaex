package Along.inher.overriding;

public class Dog {
	// ���� Ŭ�������� ���� �����ϵ��� ���������ڸ� protected �� ����.
	protected String name;
	protected int age;
	protected int weight;
	
	//public Dog() {}
	
	public Dog(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
		
	public void shogDogInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age + ", ������: " + weight);
	}
	
	
}
