package basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[]= {1,2,3,4,5};
		 * 
		 * System.out.println("Extracting Even Numbers"); for(int value:a) {
		 * if(value%2==0) { System.out.println(value); } }
		 * 
		 * System.out.println("Extracting Odd Numbers"); for(int value:a) {
		 * if(value%2!=0) { System.out.println(value); } }
		 */

		/*
		 * int a1[]= {1,2,3,4,5}; int a2[]= {1,2,3,4,5};
		 */

		/*
		 * boolean status =true;
		 * 
		 * if(a1.length == a2.length) { for(int i=0;i<a1.length;i++) { if(a1[i] !=
		 * a2[i]) { status=false; } } } else { status=false; }
		 * 
		 * if(status == true) { System.out.println("Arrays are equal"); } else {
		 * System.out.println("Arrays are not equal"); }
		 */

		// Approach 2
		/*
		 * boolean status=Arrays.equals(a1,a2); if(status == true) {
		 * System.out.println("Arrays are equal"); } else {
		 * System.out.println("Arrays are not equal"); }
		 */

		/*
		 * int a[]= {1,2,3,5};
		 * 
		 * int sum1=0; for(int value:a) { sum1=sum1+value; }
		 * System.out.println("Sum1 value is :"+sum1);
		 * 
		 * int sum2=0; for(int i=1;i<=5;i++) { sum2=sum2+i; }
		 * System.out.println("Sum2 value is :"+sum2);
		 * System.out.println("Missing Number value is :"+(sum2-sum1));
		 */
//
//		int[] intArray = new int[] { 52, 45, 32, 60, 12, 87, 78, 92, 7 };
//
//
// int temp=0;
//
// System.out.println("Original Arrays is : "); 
// for(int i=0;i<intArray.length;i++) { 
//	 System.out.print(intArray[i]+" ");
//	 }


	/*
	 * System.out.println("Using for each loop");
	 * 
	 * for(int arr:intArray) { System.out.print(arr+" "); }
	 */


 //sort in ascending order 
// for(int i=0;i<intArray.length;i++) { 
//	 for(int j=i+1;j<intArray.length;j++) { 
//		 if(intArray[i] > intArray[j]) { 
//			 temp = intArray[i]; 
//			 intArray[i]=intArray[j]; 
//			 intArray[j]=temp; 
//			 } 
//		 }
// } 
 
//sort in descending order 
//for(int i=0;i<intArray.length;i++) { 
//	 for(int j=i+1;j<intArray.length;j++) { 
//		 if(intArray[i] < intArray[j]) { 
//			 temp = intArray[i]; 
//			 intArray[i]=intArray[j]; 
//			 intArray[j]=temp; 
//			 } 
//		 }
//} 
//
// System.out.println("\nSorted in Ascedning order Arrays is : "); 
// for(int i=0;i<intArray.length;i++) { 
//	 System.out.print(intArray[i]+" ");
//
// }

	
		//Approach 2 - Sort method
		/*
		 * System.out.printf("Original Arrays is : %s",Arrays.toString(intArray));
		 * 
		 * Arrays.sort(intArray);
		 * 
		 * System.out.printf("\nSorted Ascending order Arrays is : %s",Arrays.toString(
		 * intArray));
		 */
		
//Descending order
		//Approach 1 - Sort method
		
		/*
		 * Integer[] intArray = { 52, 45, 32, 60, 12, 87, 78, 92, 7 };
		 * 
		 * System.out.printf("Original Arrays is : %s",Arrays.toString(intArray));
		 * 
		 * Arrays.sort(intArray, Collections.reverseOrder());
		 * 
		 * System.out.printf("\nSorted Ascending order Arrays is : %s",Arrays.toString(
		 * intArray));
		 */
//		 int size,i,j;
// Scanner sc=new Scanner(System.in);
//
// 
// System.out.println("Enter the size");
// size=sc.nextInt();
// 
// int a[]=new int[size];
// 
// System.out.println("Enter the array elements: ");
// 
// for(i=0;i<size;i++) {
//	 a[i]=sc.nextInt();
// }
// 
// for(i=(size/2),j=size-1;i<j;j++){
//	 int temp1 =a[i];
//	 a[i]=a[j];
//	 a[j]=temp1;
// }
// 
// System.out.println("The output is :");
// for(i=0;i<size;i++) {
//	 	System.out.println(" "+a[i]);
// }
// 
//		int[] arr = {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10};
//	      int n = arr.length;
//	      int pos = 5;
//	      int temp;
//	      if (pos > n) {
//	         System.out.println( "Invalid...pos cannot be greater than n");
//	         return;
//	      }
//	      System.out.print( "Initial array is: ");
//	      for (int i = 0; i < n; ++i)
//	      System.out.print(arr[i] + " ");
//	      for (int i = 0; i < pos / 2; i++) {
//	         temp = arr[i];
//	         arr[i] = arr[pos - i - 1];
//	         arr[pos - i - 1] = temp;
//	      }
//	      System.out.print( "\nModified array is: ");
//	      for (int i = 0; i < n; ++i)
//	      System.out.print(arr[i] + " ");
 
//		char c = 0;
//	      String str = "siVAsaKThi";
//	      System.out.println("String is: "+str);
//	      // length of string
//	      int len = str.length();
//	      StringBuffer strBuffer = new StringBuffer(len);
//	      for (int i = 0; i < len; i++) {
//	         c = str.charAt(i);
//	         // title case converted to lower case
//	         if (Character.isTitleCase(c)) {
//	            //c = Character.toLowerCase(c);
//	         }
//	         // upper case converted to lower case
//	         if (Character.isUpperCase(c)) {
//	            c = Character.toLowerCase(c);
//	         }
//	         // lower case converted to upper case
//	         else if (Character.isLowerCase(c)) {
//	            c = Character.toUpperCase(c);
//	         }
//	         strBuffer.append(c);
//	      }
//	      System.out.println("Converting case: "+strBuffer.toString());
		
		int number=400,orig_Num,rem,result=0;
		
		orig_Num=number;
		
		while(orig_Num != 0) {
			rem=orig_Num%10;
			result=result+(rem*rem*rem);
			orig_Num=orig_Num/10;
		}
		if(result == number) {
			System.out.println("It is a Armstrong number");
		}
		else
			System.out.println("It is not a armstrong number");
		
	}

}
