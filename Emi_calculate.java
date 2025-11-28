package practice;

import java.util.Scanner;

public class Emi_calculate {
	
	public static double CalEmi(double loanamt, double anualrate, int months) {
		
		double monthlyint=anualrate/1200;
		int totalmonths=months*12;
		//formula  EMI= P*R*(1+R)^N
	    //              ________________
		//	            (1+R)^N -1
//		P = loan amount
//		R = monthly int
//		N = number of months
		
		return (loanamt*monthlyint*Math.pow(1+monthlyint, totalmonths))/(Math.pow(1+monthlyint, totalmonths)-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Taking user inputs
		
		System.out.print("Enter Loan Amount : ");
		double loanamt=sc.nextDouble();
		System.out.print("Enter rate of intrest : ");
		double rate=sc.nextDouble();
		System.out.print("Enter Tenure(years) : ");
		int years=sc.nextInt();
		
		//EMI calculator
		
		double EMI=CalEmi(loanamt,rate,years);
		
		int totalmonths=years*12;
		
		double totalamount=EMI*totalmonths;
		double totalInt=totalamount-loanamt;
		
		System.out.println("Your EMI is RS:- "+ Math.round(EMI));
		System.out.println("Your totalmonths are :- "+ Math.round(totalmonths));
		System.out.println("Total Amount you are paying RS:- "+Math.round(totalamount));
		System.out.println("Your intrest rate is :"+Math.round(totalInt));
		sc.close();
	}

}
