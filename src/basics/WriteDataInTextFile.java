package basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTextFile {

	public static void main(String[] args) throws IOException {
		
		//Using Filewriter and Buffered Write class
		
		FileWriter fw=new FileWriter("D:\\Write.txt");
		
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("Hi Batman");
		
		bw.write("Sigma");
		
		bw.write("Im Vengeanance");
		
		System.out.println("Finished writing");
		
		bw.close();
		
//		Harry Potter and the Philosopher's Stone
//		Harry Potter and the Chamber of Secrets	Harry Potter
//		Harry Potter and the Prisoner of Azkaban	
//        Harry Potter and the Goblet of Fire	
//		Harry Potter and the Order of the Phoenix	
//		Harry Potter and the Half-Blood Prince	
//		Harry Potter and the Deathly Hallows – Part 1	
//        Harry Potter and the Deathly Hallows – Part 2

	}

}
