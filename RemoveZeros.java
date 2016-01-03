import java.util.Arrays;

public class RemoveZeros{
	public static void main(String[] args){
		int[] a1 = {7, 2, 3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19, 14};
		removeZeros(a1);
		System.out.println(Arrays.toString(a1));
		
	}
	
	public static void removeZeros(int[] a1){
		for(int i = 0; i < a1.length; i++){
			if (a1[i] == 0){
				for(int j = i + 1; j < a1.length; j++){
					if (a1[j] != 0){
						a1[i] = a1[j];
						a1[j] = 0;
						break;
					}
				}
			}
		}
	}
}