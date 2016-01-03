import java.util.Arrays;

public class ReverseSublist{
	public static void main(String[] args){
		int[] a1 = {34, 9, -8, 17, 4, 32, 9};
		int[] result = reverseSublist(a1, 1, 5);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] reverseSublist(int[] a1, int start, int end){
		int[] result = new int[end - start];
		int index = 0;
		for(int i = end - 1; i > start - 1; i--){
			result[index] = a1[i];
			index++;
		}
		
		return result;
	}
	
}