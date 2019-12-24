package Alone;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("������", "���������"));
		dogs.add(new Dog("��ġ", "ġ�Ϳ�"));
		dogs.add(new Dog("�Ķ�", "��Ƽ��"));
		dogs.add(new Dog("��ǳ��", "������"));
		dogs.add(new Dog("�鱸", "������"));
		
		for (int i = 0; i < dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
		
		System.out.println("--------------------------------------------");
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}		
		
	}
}
