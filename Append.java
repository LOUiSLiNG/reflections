import java.util.Arrays;

public class Append{
	public static void main(String[] args){
		int[] list1 = {2, 4, 6};
		int[] list2 = {1, 2, 3, 4, 5};
		int[] result = append(list2, list1);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] append(int[] a1, int[] a2){
		int[] result = new int[a1.length + a2.length];
		
		for(int i = 0; i < a1.length; i++){
			result[i] = a1[i];
		}
		
		for(int i = a1.length; i < result.length; i++){
			result[i] = a2[i - a1.length];
		}
		return result;
	}
}