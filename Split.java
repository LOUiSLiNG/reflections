import java.util.*;

public class Split{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(18, 7, 4, 24, 11));
		split(list);
		System.out.println(list);
		
	}
	
	public static void split(ArrayList<Integer> list){
		for(int i = list.size() - 1; i > -1; i--){
			int num = list.get(i);
			list.set(i, num / 2);
			list.add(i, (num + 1) / 2 );
		}
	}
}