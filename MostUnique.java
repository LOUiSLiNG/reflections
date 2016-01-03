import java.util.*;
import java.io.*;

public class MostUnique{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("MostUnique_file.txt"));
		mostUnique(input);
	}
	
	public static int mostUnique(Scanner input){
		int mostUnique = 0; 
		int period = 1;
		while (input.hasNextLine()){
            // each line to array
			String eachLine = input.nextLine();
			Scanner eachLineInput = new Scanner(eachLine);
			int count = 0;
			while(eachLineInput.hasNextInt()){
				eachLineInput.nextInt();
				count++;
			}
			eachLineInput = new Scanner(eachLine);
			int[] scoreArray = new int[count];
			
			for(int i = 0; i < count; i++){
				scoreArray[i] = eachLineInput.nextInt();
			}
			//
            
            // sorting array in order
			for(int i = 0; i < scoreArray.length; i++){
				int score = scoreArray[i];
				int index = i;
				for(int j = i; j < scoreArray.length; j++){
					if (score > scoreArray[j]){
						score = scoreArray[j];
						index = j;
					}
				}
				scoreArray[index] = scoreArray[i];
				scoreArray[i] = score;
			}
			//
            
            
			// counting unique number
			count = 1;
			for(int i = 0; i < scoreArray.length - 1; i++){
				if (scoreArray[i] != scoreArray[i + 1]){
					count++;
				}
			}
			//
            
			if (mostUnique < count){
				mostUnique = count;
			}
			System.out.println("Period " + period + ": " + count +  " unique scores");
			period++;
		
		}		
		return mostUnique;
	}
}