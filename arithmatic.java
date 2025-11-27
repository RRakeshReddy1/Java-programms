package practice;

public class arithmatic {

public static void main(String[] args) {
	int a=10,b=11;
	
	addition(a, b);
	substraction(a,b);
	multiplication(a,b);
}

public static void addition(int a,int b) {
	int sum=a+b;
	
	System.out.println("sum of given two numbers a+b = "+sum);
}

public static void substraction(int a,int b) {
	int sub=a-b;
	
	System.out.println("substraction of given two numbers a-b = "+sub);
}

public static void multiplication(int a,int b) {
	int multi=a*b;
	
	System.out.println("multiplication of given two numbers a*b = "+multi);
}

}
