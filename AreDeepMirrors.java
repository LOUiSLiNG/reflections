import java.util.Arrays;

public class AreDeepMirrors{
	public static void main(String[] args){
		int[] a1 = { 12, 5, 71};
		int[] a2 = {17,5,21};
		
		boolean result = areDeepMirrors(a1, a2);
		System.out.println(result);
	}	
	
	public static boolean areDeepMirrors(int[] a1, int[] a2){
		for(int i = 0; i < a1.length / 2; i++){
			int temp = a1[i];
			a1[i] = a1[a1.length - i - 1];
			a1[a1.length - i - 1] = temp;
		}
		for(int i = 0; i < a1.length; i++){
			int digit = 1;
			int temp = a1[i];
			
			while ( temp / 10 != 0){
				digit *= 10;
				temp /= 10;
			}

			temp = a1[i];
			int mirror = 0;
			while ( temp % 10 != 0){
				mirror += (temp % 10) * digit;
				digit /= 10;
				temp /= 10;
			}
			
			a1[i] = mirror;
		}
		
		
		for(int i = 0; i < a1.length; i++){
			if ( a1[i] != a2[i]){
				return false;
			}
		}
		
		return true;
		
	}
	
}