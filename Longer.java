import java.util.Arrays;

public class Longer{
	public static void main(String[] args){
		String[] a1 = {"Splinter", "Leo", "April", "Don", "Raph"};
		String[] a2 = {"Krang", "Shredder", "Bebop"};
		
		String[] result = longer(a1, a2);
		System.out.println(Arrays.toString(result));
	}
	
	public static String[] longer(String[] a1, String[] a2){
		int min = Math.min(a1.length, a2.length);
		int max = Math.max(a1.length, a2.length);
		String[] result = new String[max];
		
		for(int i = 0; i < min; i++){
			if (a1[i].length() < a2[i].length()){
				result[i] = a2[i];
			}
			else{
				result[i] = a1[i];
			}
		}
		
		for(int i = min; i < max; i++){
			result[i] = "oops";
		}
		
		return result;
	}
}