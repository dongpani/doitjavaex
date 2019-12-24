package Score.singleTone;

public class ComponyTest {
	
	
	public static void main(String[] args) {
		Compony myCompony1 = Compony.getInstance();
		Compony myCompony2 = Compony.getInstance();

		System.out.println(myCompony1 == myCompony2); // �����ϴ� ���� ����.
	}
	
}
