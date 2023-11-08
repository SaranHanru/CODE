package basics;

import java.util.Scanner;
import java.util.TreeSet;

public class JAvaProj {

	public static void main(String[] args) {
	 /*String str= "WELCOME";
	 String org_String= str;
	 
	 int len = str.length();
	 String rev ="";
	 
	 for(int i=len-1;i>=0;i--) {
		 rev=rev+str.charAt(i);
	 }
	 
	 if(org_String.equals(rev)) {
		 System.out.println("Pallindrome String");
	 }
	 else
		 System.out.println("Not a Pallindorme");

	}*/
		
		/* Number of Odd and Even */
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");*/
		
		//int num=sc.nextInt();
		
		/* number of digits in a number
		 * while(num>0) { num=num/10; count++; }
		 */
		
		/*
		 * int odd_Count =0;
		 * 
		 * int even_Count=0;
		 * 
		 * while(num>0) { int rev=num%10;
		 * 
		 * if(rev%2==0) { even_Count++; } else { odd_Count++; } num=num/10; }
		 * 
		 * System.out.println(even_Count); System.out.println(odd_Count);
		 */
		
		//int num=1234;
		/*
		 * int sum=0;
		 * 
		 * while(num>0) { sum=sum+num%10; num=num/10; } System.out.println(sum);
		 */
		
		/*
		 * int a= 1; int b=2; int c=5;
		 * 
		 * int largest = a>b?a:b;
		 * 
		 * largest=c>largest?c:largest;
		 * 
		 * System.out.println(largest);
		 */
		
		//fibo
		/*
		 * int n1=0,n2=1,sum=0; System.out.print(n1+" "+n2);
		 * 
		 * for(int i=2;i<10;i++) { sum=n1+n2; System.out.print(" "+sum); n1=n2; n2=sum;
		 * }
		 */
		
		//prime
		/*
		 * int num=3; int count=0;
		 * 
		 * if(num>1) { for(int i=1;i<=num;i++) { if(num%1==0) { count++; }
		 * 
		 * if(count==2) { System.out.println("Prime NUmber"); } else {
		 * System.out.println("Not a Prime Number"); } } } else
		 * System.out.println("Not a Prime");
		 */
		
		/*Occurence of each Character
		 * String str="Saravanan"; char[] ch =str.toCharArray(); TreeSet<Character>
		 * t=new TreeSet<Character>(); for(int i=0;i<str.length();i++) { t.add(ch[i]); }
		 * 
		 * for(Object t1:t) { String t2= t1.toString(); int count=0;
		 * 
		 * for(int i=0;i<ch.length;i++) { if(t1.equals(ch[i])) { count++; } }
		 * if(count>=1) { System.out.println(t2+count); } }
		 */
		
		/*
		 * int num=5;
		 * 
		 * int fact=1;
		 */
		
		/*//5! = 1*2*3*4*5
		 * for(int i=1;i<=num;i++) { fact=fact*i; }
		 */
		
		////5! = 5*4*3*2*1
		/*
		 * for(int i=num;i>=1;i--) { fact=fact*i; }
		 * 
		 * System.out.println(fact);
		 */
		
		/*
		 * int a[]= {1,2,3,4,5};
		 * 
		 * int sum=0;
		 */
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum=sum+a[i]; }
		 */
		
		//Enhanced for loop
		
		/*
		 * for(int value:a) { sum=sum+value; } System.out.println(sum);
		 */		
		
		/*
		 * for(int value:a) { if(value%2==0) { System.out.println(value); }
		 * 
		 * for( int valu:a) { if(valu%2!=0) { System.out.println(valu+"Odd numbers"); }
		 * }
		 * 
		 * }
		 */
		
		//Replace a vowel in a string 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a String");
//		String str=sc.next();
//		String str1=str.toLowerCase();
//		char ch[]=str1.toCharArray();
//		
//		int count =0;
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
//				ch[i]='x';
//				count++;
//			}
//		}
//		
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]+" ");
//		}
//		System.out.println("\n"+count);
		
		//To Reverse The Second Half Of Array Elements...

		     int size,i,j;
		     Scanner sc=new Scanner(System.in);

		     System.out.println("Enter The Size Of The Array:");
		     size=sc.nextInt();

		     int a[]=new int[size];

		    System.out.println("Enter The Array Elements:");

		    for(i=0;i<size;i++)
		     {
		         a[i]=sc.nextInt();
		     }


		    for(i=(size/2),j=size-1;i<j;i++,j--)
		      {
		        int temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		      }

		   System.out.println("The Output Is:");
		   for(i=0;i<size;i++)
		     {
		        System.out.println(" "+a[i]);
		     }

	}
}
