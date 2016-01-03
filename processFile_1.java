import java.util.*;
import java.io.*;

public class processFile_1{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("processFile_1_file.txt"));
		processFile(input);
	}
	
	public static void processFile(Scanner input){
		while (input.hasNextLine()){
			String firstLine = input.nextLine();
			
			if (input.hasNextLine()){
				System.out.println(input.nextLine());
			}
			System.out.println(firstLine);
		}
		
	}
}