package ClassAndObject02;

public class TakeTrans {
	public static void main(String[] args) {
		// ���� ��ü�� �����ڸ� ȣ�������� �� ���� �ٸ� ��ü��.
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 15000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		System.out.println();
		
		Subway subwayGrenn = new Subway("2ȣ��");
		studentTomas.takeSubway(subwayGrenn);
		studentTomas.showInfo();
		subwayGrenn.showInfo();
		
		System.out.println();
		
		Taxi kakao = new Taxi("īī��");
		studentEdward.takeTaxi(kakao);
		studentEdward.showInfo();
		kakao.showInfo();
		
		
	}
}
