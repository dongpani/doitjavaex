package conditinals;

public class Score {
	
	char setPrintScore(int score) {
		char grade;
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >=80 && score <= 89) {
			grade = 'B';
		}
		else if(score >=70 && score <= 79) {
			grade = 'C';
		}
		else if(score >=60 && score <= 69) {
			grade = 'D';
		}else {
			grade = 'F';
		}			
		
		return grade;
	}

}
