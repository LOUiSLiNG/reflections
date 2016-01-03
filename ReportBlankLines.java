import java.util.Scanner;
import java.io.*;

public class ReportBlankLines{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("ReportBlankLines_file.txt"));
		reportBlankLines(input);
	}
	
	public static void reportBlankLines(Scanner input){
		
		int lineNumber = 1;
		int totalBlank = 0;
		
		while (input.hasNextLine()){
			String eachLine = input.nextLine();
			
			if (eachLine.length() == 0){
				System.out.println("line " + lineNumber + " is blank");
				totalBlank++;
			}
			lineNumber++;
		}
		
		System.out.println("total blank lines = " + totalBlank);
	}
}