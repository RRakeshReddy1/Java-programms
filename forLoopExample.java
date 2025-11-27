package ConditionStatements;

public class forLoopExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);

			if (i == 50) {
				System.out.println("Mobile data reached 50%");
				System.out.println("Send sms to the user");
				continue;
			}

			if (i == 70) {
				System.out.println("Mobile data reached 70%");
				System.out.println("send sms to the user");
				continue;
			}if(i==100){
				System.out.println("Your are running out of your mobile data you rached maximum data 100%");
			}
		}

	}
}