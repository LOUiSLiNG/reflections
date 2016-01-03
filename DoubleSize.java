import java.util.Arrays;

public class DoubleSize{
	public static void main(String[] args){
	int[] list = {18, 7, 4, 24, 11};
	int[] result = doubleSize(list);
	System.out.println(Arrays.toString(result));
	}
	
	public static int[] doubleSize(int[] a1){
		int[] result = new int[a1.length * 2];
		
		for(int i = 0; i < a1.length; i++){
			result[2 * i] = (a1[i] + 1) / 2;
			result[2 * i + 1] = a1[i] / 2;
		}
		
		return result;
	}
}