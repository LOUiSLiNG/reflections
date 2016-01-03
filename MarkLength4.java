import java.util.*;

public class MarkLength4{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
		markLength4(list);
		System.out.println(list);
	}
	
	public static void markLength4(ArrayList<String> list){
		for(int i = list.size() - 1; i > -1; i--){
			if (list.get(i).length() == 4){
				list.add(i, "****");
			}
		}
	}
}