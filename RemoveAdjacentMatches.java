import java.util.*;

public class RemoveAdjacentMatches{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 3, 15, 2, 2, 2, 2, 1, 19, 3, 42, 42, 42, 7, 42, 1));
		removeAdjacentMatches(list);
		System.out.println(list);
	}
	
	public static void removeAdjacentMatches(ArrayList<Integer> list){
		for(int i = list.size() - 1; i > 0; i--){
			if ( list.get(i) == list.get(i-1)){
				list.remove(i);
			}
		}
	}
}