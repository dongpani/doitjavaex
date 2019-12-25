package innerclass;

class Outter {
	
	// 방법1
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	
	// 방법2
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
	
	
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter out = new Outter();
		
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
		
	}

}
