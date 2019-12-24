package This;

class BirthDay {
	int day;
	int month;
	private int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void printThis() {
		System.out.println(this);
	}
	
	public int getYear() {
		return this.year;
	}
	
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay); 
		bDay.printThis();
		System.out.println(bDay.getYear());
	}
	
}
