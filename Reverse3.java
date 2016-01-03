import java.util.*;

public class Reverse3{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4, 99, 2));
		reverse3(list);
		System.out.println(list);
	}
	
	public static void reverse3(ArrayList<Integer> list){
		for(int i = 2; i < list.size(); i +=3){
			int temp = list.get(i);
			list.set(i, list.get(i - 2));
			list.set(i - 2, temp);
		}
	}
}