package ConditionStatements;

public class ifSExample2 {
	
	public void weeks() {
		int day=9;
		if(day==1) {
			System.out.println("Today is Monday");
		}else if(day==2)
			System.out.println("Today is Tuesday");
		else if(day==3)
			System.out.println("Today is wednesday");
		else if(day==4)
			System.out.println("Today is Thursday");
		else if(day==5)
			System.out.println("Today is friday");
		else if(day==6)
			System.out.println("Today is saturday");
		else if(day==7)
			System.out.println("Today is sunday");
		else
			System.out.println("Invalid input please enter valid input b/w 1 to 7");
	}
	public static void main(String[] args) {
		
		ifSExample2 m1=new ifSExample2();
		m1.weeks();
		
	}

}
