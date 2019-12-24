package conditinals;

public class Floor {
	public String floorPrint(int floor) {
		
		String floorCondition = "";
		
		switch (floor) {
			case 1 :
				floorCondition = "�౹";
				break;
			case 2 :
				floorCondition = "����";
				break;
			case 3 :
				floorCondition = "�ｺ��";
				break;
			case 4 :
				floorCondition = "�뼺�п�";
				break;
			case 5 :
				floorCondition = "���̸���";
				break;				
			default:
				break;
		}
		
		return floorCondition;
	}
}
