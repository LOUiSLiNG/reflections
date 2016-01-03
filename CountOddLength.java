import java.util.Scanner;
import java.io.*;

public class CountOddLength{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("CountOddLength_file.txt"));
		countOddLength(input);
	}
	
	public static void countOddLength(Scanner input){
		int totalLine = 0;
		int oddLine = 0;
		double percentage = 0.0;
		
		while (input.hasNextLine()){
			String eachLine = input.nextLine();
			
			if (eachLine.length() % 2 != 0){
				oddLine++;
			}
			totalLine++;
		}
		
		percentage = 100.0 * oddLine / totalLine;
		
		System.out.println("Total lines = " + totalLine);
		System.out.println("odd length = " + oddLine);
		System.out.println("percent = " + percentage);
		
	}
}