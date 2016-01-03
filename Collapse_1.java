import java.util.*;

public class Collapse_1{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("four", "score", "and", "seven", "years", "ago", "helmet"));
		collapse(list);
		System.out.println(list);
	}
	
	public static void collapse(ArrayList<String> list){
		
		for(int i = 1; i < list.size(); i++){
			String pair = "(" + list.get(i - 1) + ", " + list.get(i) + ")";
			list.set(i - 1,pair);
			list.remove(i);
		}
	}
}