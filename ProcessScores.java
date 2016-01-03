import java.util.Scanner;
import java.io.*;

public class ProcessScores{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("processScores_file.txt"));
		
		processScores(input);
	}
	
	public static void processScores(Scanner input){
		while (input.hasNextLine()){
			String name = input.nextLine();
			String scores = input.nextLine();
			
			int plusCount = 0;
			for(int i = 0; i < scores.length(); i++){
				if (scores.charAt(i) == '+'){
					plusCount++;
				}
			}
			
			double percentage = 100.0 * plusCount / scores.length();
			
			System.out.println(name + ": " + percentage + "% plus" );
			
		}
	}
}