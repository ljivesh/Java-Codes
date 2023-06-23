

import java.io.*;

public class Lab29 {
	public static void main(String[] args) throws Exception
	{
		// pass the path to the file as a parameter
		File file = new File("D:\\Java\\test.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String s;
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java\\test2.txt"));
		while((s = reader.readLine()) !=null) {
	
			System.out.println(s);
			writer.write(s);
			writer.newLine();
		}
		
		reader.close();
		writer.close();
	}
}
