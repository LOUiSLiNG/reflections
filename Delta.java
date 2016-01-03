import java.util.Arrays;

public class Delta{
	public static void main(String[] args){
		int[] numbers1 = {3, 8, 15};
		int[] numbers2 = {3, 8, 2, 5, 1, 9};
		
		int[] result1 = delta(numbers1);
		int[] result2 = delta(numbers2);
		
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
	}
	
	public static int[] delta(int[] a1){
		int[] result = new int[2 * a1.length - 1];
		result[0] = a1[0];
		int index = 1;
		
		for(int i = 1; i < a1.length; i++){
			result[index + 1] = a1[i];
			result[index] = a1[i] - a1[i - 1];
			index += 2;
		}
		
		return result;
	}
}