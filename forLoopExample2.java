package ConditionStatements;

public class forLoopExample2 {

	public static void main(String[] args) {

		String str1 = "RakeshReddy Ramireddygari";
		String str2 = "RakeshReddy Ramireddygari";

		String str3 = str1.replaceAll("RakeshReddy Ramireddygari", "RRR");
		System.out.println(str3);
		
		int str4=str1.length();
		System.out.println(str4);
		
		str2=str2.replace(" ", "_");
		System.out.println(str2);
		str1=str1.toLowerCase();
		System.out.println(str1);
		str1=str1.toUpperCase();
		System.out.println(str1);
		str2=str2.replaceAll("_", " ");
		str2=str2.toUpperCase();
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("Both or same");
		}else
			System.out.println("Not same -->"+ str1+"  & "+str2);

	}
}
