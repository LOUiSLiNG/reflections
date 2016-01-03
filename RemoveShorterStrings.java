import java.util.*;

public class RemoveShorterStrings{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
		removeShorterStrings(list);
		System.out.println(list);
	}
	
	public static void removeShorterStrings(ArrayList<String> list){
		for(int i = 1; i < list.size(); i++){
			if (list.get(i).length() < list.get(i - 1).length()){
				list.remove(i);
			}
			else{
				list.remove(i - 1);
			}
		}
		
	}
}