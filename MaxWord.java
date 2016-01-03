import java.util.Scanner;
import java.io.*;

public class MaxWord{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("MaxWord_file.txt"));
		System.out.println(maxWord(input));
		
	}
	
	public static String maxWord(Scanner input){
		String maxName = "";
		int max = 0;
		
		if (input.hasNextLine()){
			Scanner eachLine = new Scanner(input.nextLine());
			maxName = eachLine.next();
			
			while (eachLine.hasNextInt()){
				max += eachLine.nextInt();
			}
		}
		
		while (input.hasNextLine()){
			Scanner eachLine = new Scanner(input.nextLine());
			String eachName = eachLine.next();
			int eachMax = 0;
			
			while (eachLine.hasNextInt()){
				eachMax += eachLine.nextInt();
			}
			
			if (eachMax > max){
				max = eachMax;
				maxName = eachName;
			}
		}
		
		return maxName; 
	}
}