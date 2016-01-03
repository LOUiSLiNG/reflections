import java.util.Arrays;

public class Collapse{
	public static void main(String[] args){
		int[] list1 = {1, 2, 3, 4, 5};
		int[] result = collapse(list1);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] collapse(int[] a1){
		int[] result = new int[(a1.length + 1) / 2];
		int j = 0;
		
		for(int i = 1; i < a1.length; i += 2){
			result[j] = a1[i] + a1[i-1];
			j++;
		}
		
		if (a1.length % 2 == 1){
			result[j] = a1[a1.length - 1];
		}
		
		return result;
	}
}