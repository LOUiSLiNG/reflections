import java.util.Arrays;

public class Rearrange{
    public static void main(String[] args){
		int[] list1 = {23, 12, 8, 0, 4, 80, 9, 7, 30, 99, 50, 42, 13, 47, 2, 16, 87, 75};
		rearrange(list1);
		System.out.println(Arrays.toString(list1));
    }

    public static void rearrange(int[] list1){
		int cursor = 0;
		
		for(int i = 0; i < 3; i++){
			for(int j=cursor; j < list1.length; j++){
				if (list1[j] % 3 == i){
					int temp = list1[j];
					list1[j] = list1[cursor];
					list1[cursor] = temp;
					cursor++;
				}
			}
		}
    }
}
