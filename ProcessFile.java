import java.util.Scanner;
import java.io.*;

public class ProcessFile{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("ProcessFile_file.txt"));
		processFile(input);
	}
	
	public static void processFile(Scanner input){
		while (input.hasNextLine()){
			String eachLine = input.nextLine();
			
			if (eachLine.length() > 0 && eachLine.charAt(0) == '.'){
				eachLine = eachLine.substring(1);
				int count = eachLine.length();
				System.out.println(eachLine);
				
            for(int i = 0; i < count; i++){
					System.out.print("-");
				}
				System.out.println();
			}
			else{
				System.out.println(eachLine);
			}
			
		}
	}
}