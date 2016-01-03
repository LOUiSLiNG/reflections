import java.util.*;
import java.io.*;

public class FindFirstMatch{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("FindFirstMatch_file.txt"));
		String[] k2 = {"dinosaur", "PITS", "pots"};   
		int result = findFirstMatch(input, k2);
		System.out.println(result);
	}
	
	public static int findFirstMatch(Scanner input, String[] keywords){
		int lineNumber = 1;
		
		while (input.hasNextLine()){
			String eachLine = input.nextLine().toLowerCase();
			
			for(int i = 0; i < keywords.length; i++){
				if (eachLine.contains(keywords[i].toLowerCase())){
					return lineNumber;
				}
			}
         lineNumber++;
		}
		
		return -1;
	}
}