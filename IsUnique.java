public class IsUnique{
	public static void main(String[] args){
		int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
		int[] list1 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
		System.out.println(isUnique(list));
		System.out.println(isUnique(list1));
	}
	
	public static boolean isUnique(int[] a1){
		for(int i = 0; i < a1.length; i++){
			for(int j = i + 1; j < a1.length; j++){
				if (a1[i] == a1[j]){
					return false;
				}
			}
		}
		
		return true;
	}
}
