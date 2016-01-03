public class indexOf{
    public static void main(String[] args){
		int[] list1 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
		int[] list2 = {1,3,6};
		System.out.println(indexOf(list2,list1));
    }

    public static int indexOf(int[] list2, int[] list1){
		int count = 0;
		
		for(int i=0;i<list1.length;i++){

			if (list1[i] == list2[0]){
				count++;
				for (int j=1;j<list2.length;j++){
					if (list1[i+j] != list2[j]){
					count = 0;
					break;
					// j = list2.length;
					// if break statement is not allowed in final test, then use "j = list2.length"
					}
					else{
					count++;
					}
				}
				if (count == list2.length){
					return i;
				}
			}
		}
		return -1;
    }
}
