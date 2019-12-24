package Score.singleTone;

public class Compony {
	private static Compony instance = new Compony();
	private Compony() {}
	
	public static Compony getInstance() {
		if(instance == null) {
			instance = new Compony();
		}
		
		return instance;
	}
}
