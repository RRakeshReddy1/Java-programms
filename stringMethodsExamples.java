package ConditionStatements;

public class stringMethodsExamples {
	public static void main(String[] args) {
		String s="RakeshReddy";
		int index=s.indexOf('d');
		System.out.println(index);
		
		String res=s.substring(6, 11);
		System.out.println(res);
		
		// remove unwanted spaces
		
		String name="   Ramireddygari RakeshReddy ";
		System.out.println(name);
		String res1= name.trim();
		System.out.println(res1);
		
		//split by using spaces
		String str="Iam a software  Test  Engineer";
		String str1=str.replace('a', '_');
		System.out.println(str1);
		String Res[]=str1.split(" ");
		for(int i=0;i<Res.length;i++) {
			System.out.println(Res[i]);
		}
	}

}
