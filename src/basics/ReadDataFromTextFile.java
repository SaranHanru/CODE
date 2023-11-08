package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach 1 Using FileReader and BufferReader
		
//		FileReader fr=new FileReader("D:\\Java.txt");
//		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!=null) {
//			System.out.println(str);
//		}
//		
//		br.close();
		
		//Approach 2 Using File and Scanner
		
//		File file =new File("D:\\Java.txt");
//		
//		Scanner sc=new Scanner(file);
//		
//		//loop Statement
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		//Approach 3 File and Scanner by Using Delimiter method
		
		File file =new File("D:\\Java.txt");
		
		Scanner sc =new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		}

}
