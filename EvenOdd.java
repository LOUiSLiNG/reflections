import java.util.Arrays;

public class EvenOdd{
	public static void main(String[] args){
		int[] a1 = {5, 6, 3, 3, 2, 5, 2, 6};
		evenOdd(a1);
		System.out.println(Arrays.toString(a1));
	}


	public static void evenOdd(int[] a1){
		
		int index = 1;
		
		for(int i = 0; i < a1.length; i += 2){
			if ( a1[i] % 2 != 0){
				int number = a1[i];
				
				for(int j = index; i < a1.length; j += 2){
					if (a1[j] % 2 == 0){
						a1[i] = a1[j];
						a1[j] = number;
						index = j + 2;
						break;
					}
				}
			}
		}
	}
}