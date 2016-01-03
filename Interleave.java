import java.util.Arrays;

public class Interleave{
	public static void main(String[] args){
		int[] list1 = {1,8,3,9};
		int[] list2 = {82, 7, 4, 2, 1, 6, 5, 0, 18};
		int[] result = interleave(list2, list1);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] interleave(int[] a1, int[] a2){
		int[] result = new int[a1.length + a2.length];
		int min = 2 * Math.min(a1.length, a2.length);
		
		for(int i = 0; i < min; i += 2){
			result[i] = a1[i / 2];
			result[i + 1] = a2[i / 2];

		}
		
		if (a1.length > a2.length){
			for(int i = min; i < result.length; i++){
				result[i] = a1[i - min / 2];
			}
      }
		else{
			for(int i = min; i < result.length; i++){
				result[i] = a2[i - min / 2];
			}
		}
		
		return result;
	}
}