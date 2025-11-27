package practice;

public class Task_2_loops {

	public static void main(String[] args) {
		// Print 1 to 30 numbers in for,while,do_whileloops?
		//Task-1 if a number is divisible by 5 print fizz, divisible by 3 print buzz
		//Task-2 if a number is divisible by both 3 & 5 print fizz, buzz
		//Task-3 if a number is not divisible by 3 or 5 print number itself
		forloop();
		while_loop();
		Task_2_loops dw=new Task_2_loops();
		dw.do_while();

	}

	public static void forloop() {
		System.out.println("Output for For_loop");

		for(int i=0;i<=30;i++ ) {
			if(i%3==0&&i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else 
				System.out.println(i);
		}
	}

	public static void while_loop() {
		System.out.println("Output for While_Loop");
		int i=0;
		while(i<=30) {

			if(i%3==0&&i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else 
				System.out.println(i);
			i++;
		}

	}
	
	public void do_while() {
		System.out.println("Output for do_While");
		int i=0;
		do {
			if(i%3==0&&i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else 
				System.out.println(i);
			i++;
		}while(i<=30);
	}

}
