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
		System.out.println("버스는 " + busNumber + "이것입니다." + passengetCount + "모르겠어요" + money + " 입니다.");
	}
	
	
}
