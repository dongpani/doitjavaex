package ClassAndObject02;

public class Taxi {
	String taxiNumber;
	int passengetCount;
	int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengetCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiNumber + "�� �°���" + passengetCount + "���̰�, ������" + money + " �Դϴ�.");
	}
	
}
