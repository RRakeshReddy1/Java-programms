package practice;

public class Operators {
	public static void main(String[] args) {
		int a =17,b=23;
		
		// 1. Arithmetic Operators
		
		System.out.println("Arithmetic Operators");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
//		2. Unary Operators
		System.out.println("Unary Operators");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(b--);
		System.out.println(b);
		
//		3.Relational operators[==,!=,<,>,]
		System.out.println("Relational operators");

		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);

		//4. Condition Operators[||,&&]
		int i=10,j=10;
		System.out.println("Condition Operators");
		System.out.println(i<j||i>j);
		System.out.println(i==j||i!=j);
		System.out.println(i==j&&i!=j);
		
		//5.Assignment Operators (=,+=,-=,%=,*=,/=)
		System.out.println("Assignment Operators");
		
		 i=i+5;
		 System.out.println(i);
		 i+=5;
		 System.out.println(i);
		 i-=i;
		 System.out.println(i);
		
		}

}
