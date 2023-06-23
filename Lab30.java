import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Lab30 {
	public static void main(String args[]) throws Exception {

		File file = new File("D:\\Java\\test.txt");
		
		FileUtil util = new FileUtil(file);
		
		System.out.println("No. of words in the file: "+util.wordCount());
		System.out.println("No. of characters in the file: "+util.charCount());
		System.out.println("No. of vowels in the file: "+util.vowelCount());
	
	}
}

class FileUtil {

	ArrayList<String> stringArray;

	FileUtil(File path) {
		
		try {
		
			BufferedReader reader = new BufferedReader(new FileReader(path));

			String s;
			stringArray = new ArrayList<>();
		
			try {
			
				while( (s=reader.readLine()) !=null ) {
					stringArray.add(s);
				}
			} catch(Exception e) {
			
				System.out.println(e);
			
			} finally {
				reader.close();
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
			
	}
	
	public long charCount() {
	
		long count=0;
		for(String str : stringArray) {
			String[] wordArr = str.split(" ");
			for(String word : wordArr ) count+=word.length();
		}
		
		return count;
	}

	public long vowelCount() {
	
		long count=0;
		for(String str : stringArray) {
			Pattern pat = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
			Matcher match = pat.matcher(str);
			while(match.find()) count++;

		}
		
		return count;
	}


	public int wordCount() {
		
		int count = 0;
		for(String str : stringArray) {
			String[] wordArr = str.split(" ");
			count+= wordArr.length;
		}
		return count;
	
	}
	
}