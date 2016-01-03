import java.util.*;

public class Blackjack{
	public static void main(String[] args){
		boolean type = blackjack();
		System.out.println(type);
	}
	
	public static boolean blackjack(){
		Random rand = new Random();
		int result = 0;
		
		while (result < 17){
			int randNum = rand.nextInt(10) + 1;
			System.out.print(randNum + " ");
			result += randNum;
		}
		System.out.print("= " + result + " ");
		
		if (result == 21){
			System.out.println("BLACKJACK!");
		}
		else if(result > 21){
			System.out.println("Busted!");
			return false;
		}
      System.out.println();
		return true;
		
	}
}