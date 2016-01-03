import java.util.*;

public class SwitchPairs{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
		switchPairs(list);
		System.out.println(list);
	}
	
	public static void switchPairs(ArrayList<String> list){
		for(int i = 1; i < list.size(); i += 2){
			String second = list.get(i);
			list.set(i, list.get(i-1));
			list.set(i-1, second);
		}
	}
}