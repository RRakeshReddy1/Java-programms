package ConditionStatements;

public class studentGrade {
	
	public static void main(String[] args) {
		char Grade='B';
		
		switch(Grade) {
		
		case 'A' :
			System.out.println("You got First class");
			break;
		case 'B' :
			System.out.println("You got Second class");
			break;
		case 'C' :
			System.out.println("You got Third class");
			break;
		case 'D' :
			System.out.println("You are failed in Exam");
			break;
		default :
			System.out.println("Please give valid input between A  to D ");
		}
	}

}
