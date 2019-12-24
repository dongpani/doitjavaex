package firstExam;

public class stars02 {
	
	public static void main(String[] args) {
				
		int starCount = 1;
		int spaceCount = 1;
		
		for(int line=1; line <= 7; line++) {
			
			for (int star=0; star < starCount; star++) {
				System.out.print("*");
			}
			
			if(line < 4) {
				starCount += 2;	
			}else {
				starCount -= 2;
			}
						
			System.out.println();
						
		}
	
		
	}

}
