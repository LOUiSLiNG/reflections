public class RepeatedSequence{
	public static void main(String[] args){
		int[] a5 = {23};
		int[] a6 = {23, 23, 23, 23};
		boolean result = repeatedSequence(a5, a6);
		System.out.println(result);
	}


	public static boolean repeatedSequence(int[] a1, int[] a2){
		if ( a2.length % a1.length != 0){
			return false;
		}
		
		for(int i = 0; i < a2.length; i+= a1.length){
			for(int j = 0; j < a1.length; j++){
				if (a1[j] != a2[i+j]){
					return false;
				}
				
			}
		}
		
		return true;
	}
}