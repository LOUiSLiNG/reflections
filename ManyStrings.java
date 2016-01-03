import java.util.*;

public class ManyStrings{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "a", "b", "c"));
		manyStrings(list, 3);
		System.out.println(list);
	}
	
	public static void manyStrings(ArrayList<String> list, int n){
		for(int i = list.size() - 1; i > -1; i--){
			for(int j = 0; j < n - 1; j++){
				list.add(i, list.get(i));
			}
		}
	}
}