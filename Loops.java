package practice;

public class Loops {
	public static void main(String[] args) {

		forloop();
		whileloop();
		dowhile();
	}

	public static void forloop() {
		System.out.println("for loop begins");
		for(int i=1;i<=100;i++) {

			System.out.println(+i);

		}
	}

	public static void whileloop() {
		int i=1;
		System.out.println("While loop begins");
		while(i<=100) {
			System.out.println(+i);
			i++;
		}
	}
	
	public static void dowhile() {
		int i=10;
		System.out.println("do while loop begins");
		do {
				System.out.println(+i);
			i++;
		}while(i<=100);
	}

}
