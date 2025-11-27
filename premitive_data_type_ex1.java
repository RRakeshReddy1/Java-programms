package DataTypes_premitivie;

public class premitive_data_type_ex1 {
	static int num1=10;
	static int num2=20;
	static int num3=30;
	static int result;
	static public void addition() {
		result=num1+num2+num3;
		System.out.println("Sum of num1,num2,num3 is :: "+result);
	}
	static public void substraction() {
		result=num1-num2-num3;
		System.out.println("Substraction of num1,num2,num3 is :: "+result);
	}
	static public void multiplication() {
		result=num1*num2*num3;
		System.out.println("multiplication of num1,num2,num3 is :: "+result);
	}
	static public void division() {
		result=num3/num2;
		System.out.println("Division of num3 & num2 is :: "+result);
	}
	
	public static void main(String[] args) {
		
		addition();
		substraction();
		multiplication();
		division();
	}
}
