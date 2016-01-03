import java.util.ArrayList;

public class numSame{
	public static void main(String[] args){
	    int[] list1 = {2, 4, 6, 20};
	int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		numSame(list1,list2);
	}	
	
	public static int numSame(int[] list1, int[] list2){
		int[] small;
		int[] large;
		
		if (list1.length > list2.length){
			large = list1;
			small = list2;
		}
		else{
			large = list2;
			small = list1;
		}
		
		int count = 0;
		int index = 0;
		
		for(int i=0;i<small.length;i++){
			for (int j=index;j<large.length;j++){
				if (small[i] == large[j]){
					count++;
					index++;
					j = large.length;
				}
			}
		}
		System.out.println(count);
		return count;
	}
}