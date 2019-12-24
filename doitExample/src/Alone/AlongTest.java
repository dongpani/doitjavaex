package Alone;

public class AlongTest {

	public static void main(String[] args) {
		TheMan man = new TheMan();
		
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.isMarryed);
		System.out.println(man.childCount);

		
		System.out.println("----------------------------------------");
		
		OrderList order = new OrderList();
		
		System.out.println("�ֹ���ȣ: " + order.orderNumber);
		System.out.println("�ֹ��� ���̵�: " + order.userId);
		System.out.println("�ֹ���¥: " + order.orderDate);
		System.out.println("�ֹ��� �̸�: " + order.userName);
		System.out.println("�ֹ��� ��ǰ��ȣ: " + order.productCode);
		System.out.println("����ּ�: " + order.orderAddress);
		
		
		
	}

}
