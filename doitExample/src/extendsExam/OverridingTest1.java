package extendsExam;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		
		// �ν��Ͻ��� ������ �������̵� �� �޼��带 ����.
		Customer vc = new VIPCustomer(10030, "������", 2000);
		vc.calcPrice(10000);
		
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "���Դϴ�.");
		
		
	}
}
