package practice;

public class Bankmethods {

	static int currentbal = 10000;
	public static void main(String[] args) {
		Bankmethods bank=new Bankmethods();

		greetCustomer();
		bank.deposit(500);
		withdraw(300);
		bank.getcurrentbalance();
		System.out.println("Current balance in your Account : "+currentbal);

	}

	public static void greetCustomer() {
		System.err.println("Hello "+"Welcome to Our Bank");
	}

	public void deposit(int amt) {

		currentbal=currentbal+amt;
		System.out.println("Ammount deposited successfully : "+amt);

	} 

	public static void withdraw(int amount) {
		currentbal=currentbal-amount;
		System.out.println("Ammount withdwal successfully : "+amount);

	}

	public int getcurrentbalance() {
		return currentbal;
	}

}
