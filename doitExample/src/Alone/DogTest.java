package Alone;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog();
		dogs[0].setName("������");
		dogs[0].setType("���������");
		dogs[1] = new Dog();
		dogs[1].setName("�۹���");
		dogs[1].setType("��ũ���׸���");
		dogs[2] = new Dog();
		dogs[2].setName("�����");
		dogs[2].setType("��𿹵�");
		dogs[3] = new Dog();
		dogs[3].setName("��ġ");
		dogs[3].setType("��Ƽ��");
		dogs[4] = new Dog();
		dogs[4].setName("ȣ��");
		dogs[4].setType("ġ�Ϳ�");
				
		// �׳� ����
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		
		System.out.println("=========================================");
		
		
		// ���� ����.
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
		
		
	}

}
