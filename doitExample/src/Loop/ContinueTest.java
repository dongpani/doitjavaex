package Loop;

public class ContinueTest {
	public static void main(String[] args) {
		
		// 1 ���� 100���� 3�� ����ΰ͸� ����϶�.
		int num;
		
		for(num=1; num <= 100; num++) {
			
			if(num%3 != 0)
				continue;
			
			System.out.println(num);
			
		}		
	}
}
