package Along.inher.overriding;

public class Bichon extends Dog {
	private String color;
		
	public Bichon(String name, int age, int weight, String color) {
		// ����� ����Ŭ���� ������ ȣ��.
		super(name, age, weight);		
		this.color = color;
	}
	
	@Override
	public void shogDogInfo() {
		System.out.println("�̸�: " + name + ", ����: " + age + ", ������: " + weight + ", ����: " + color);
	}	
	
}
