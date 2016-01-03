import java.util.Arrays;

public class Insert{
	public static void main(String[] args){
		int[] bigList = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int[] shortList = {2, 4, 6, 8};
		insert(shortList, bigList, 2);
		System.out.println(Arrays.toString(bigList));
	}
	
	public static void insert(int[] shortList, int[] bigList, int index){
		for(int i = index + shortList.length; i < bigList.length; i++){
			bigList[i] = bigList[i - shortList.length];
		}
		
		for(int i = index; i < index + shortList.length; i++){
			bigList[i] = shortList[i - index];
		}
	
	}
}