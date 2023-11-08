package basics;

import java.util.Scanner;

public class StringScaler {

	public static void main(String[] args) {
		
//		String str= "I Love Java";
//		System.out.println(str);
//
//		int num = str.length();
//		System.out.println(num);
//		
//		 char c = str.charAt(2);
//		 System.out.println(c);
//		 
//		 String str1="""
//		 		Harry Potter and the Philosopher's Stone
//		        Harry Potter and the Chamber of Secrets	Harry Potter
//		        Harry Potter and the Prisoner of Azkaban	
//                Harry Potter and the Goblet of Fire	
//		        Harry Potter and the Order of the Phoenix	
//		        Harry Potter and the Half-Blood Prince	
//		        Harry Potter and the Deathly Hallows – Part 1	
//                Harry Potter and the Deathly Hallows – Part 2
//		 		""";
//		 
//		 System.out.println(str1);
		
//		int i=20;
//		long l=i;
//		System.out.println(l);
		
//		long l=10000000;
//		int i=(int)l; //Typecasted long into int datatype ==> changing type of data from one type to another is called TypeCasting
//		System.out.println(i);
		
		//Scanner sc=new Scanner(System.in);
		
//		char c=sc.nextLine().charAt(0);
//		System.out.println(c);
		
//		int p = 100, r = 5, t =2,s_i;
//		
//		s_i = (p*r*t)/100;
//		
//		System.out.println(s_i);
		
//		int a =10;
//
//		int b = 20;
//
//		int c = 30;
//
//		System.out.print(a);
//
//		System.out.println(b);
//
//		System.out.print(c);
		
//		int a = 10, b = 5;  //1
//
//		double c = (a * 1.0) / b; //2
//
//		System.out. println(c);
		
//		String str = "MadaM";
//		
//		String rev = "";
//		
//		String org_Str = str;
//		
//		int len = str.length();
//		
//		for(int i = len - 1 ; i >=0 ;i --) {
//			rev = rev + str.charAt(i);
//		}
//		//System.out.println(rev);
//		if(org_Str.equals(rev)) {
//			System.out.println("It is a Pallindrome String");
//		}
//		else
//			System.out.println("Not a Pallindrome");
		
//		int num =54242;
//		
//		int rev = 0;
//		
//		int Org_num = num;
//		
//		while(num >0) {
//			
//			rev = rev *10 + num % 10;
//			num = num / 10;
//		}
//		//System.out.println(rev);
//		
//		if(Org_num == rev) {
//			System.out.println("Pallimdrome");
//		}
//		else
//			System.out.println("Not a Pallindrome");
		
		long num = 9944903368L;
		
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
    }
	
}
