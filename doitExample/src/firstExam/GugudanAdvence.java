package firstExam;

public class GugudanAdvence {
	public static void main(String[] args) {
		
		// continue
		/*
		for(int dan=1; dan <= 9; dan++) {
			if(dan%2 != 0) 
				continue;
			
			for(int num=1; num <=9; num++) {
				System.out.println(dan + " x " + num + " ��? " + dan*num);
			}
			
		}
		*/
		
		// break
		
		for(int dan=2; dan <= 9; dan++) {			
			for(int num=1; ; num++) {				
				if(num > dan)
					break;
				
				System.out.println(dan + " x " + num + " ��? " + dan*num);
			}
			
		}
		
	}
}
