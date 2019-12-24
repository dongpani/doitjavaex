package ClassAndObject02;

public class Bus {
	int busNumber;
	int passengetCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengetCount++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°���" + passengetCount + "���̰�, ������" + money + " �Դϴ�.");
	}
	
	
}
