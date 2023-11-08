package basics;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		//String arr[]= {"Java","C","C++","Python","Java"};
		
		//Approach1 
		
//		boolean flag = false;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println("Duplicate Element in array is found: "+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag == false) {
//			System.out.println("No Duplicates Found");
//		}
		
		//Approach 2
		
//		HashSet<String> langs =new HashSet();
//		
//		boolean flag=false;
//		
//		for(String l :arr) {
//			if(langs.add(l) == false) {
//				System.out.println("Duplicate Element in array is found: "+l);
//        		flag=true;
//			}
//		}
//		if(flag == false) {
//			System.out.println("No Duplicate element in array is found: ");
//		}
		
		//remove spl characters
//		String str="a@#$*b ntan 0123ABC456";
//		
//		String s=str.replaceAll("[^A-Z]", "");
//		
//		System.out.println(s);
		
		//remove white spaces
//        String str="   Java     Automation Selenium     program";
//        
//        str=str.replaceAll("\\s","");
//        
//        System.out.println(str);
		
		//count occurence of a character in a string 
		
//		String s="Saravanan";
//		
//		int total_Count=s.length();
//		
//		int total_Count_after_Removing=s.replaceAll("a", "").length();
//		
//		int total = total_Count-total_Count_after_Removing;
//		
//		System.out.println(total);

	}

}
