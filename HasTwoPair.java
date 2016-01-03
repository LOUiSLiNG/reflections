public class HasTwoPair{
    public static void main(String[] args){
	int[] list1 = {2, 4, 2, 2, 4};
	int[] list2 = {3, 4, 3, 6, 6};
	int[] list3 = {4, 1, 4, 4, 2};
	int[] list4 = {5, 5, 3, 3, 4};
	int[] list5 = {6, 2, 6, 5, 3};
	int[] list6 = {1, 3, 5, 3, 1};
	int[] list7 = {3, 1, 3, 1};
	int[] list8 =  {1, 2, 3, 1, 2, 3};
	
	System.out.println(hasTwoPair(list8));

    }

    public static boolean hasTwoPair(int[] list1){
	int count = 0; // count should be 2 to return true;

	for(int i=1; i<7; i++){
	    int duplicate = 0;
	    for(int j=0; j < list1.length; j++){
		if (i == list1[j]){
		    duplicate++;
		}
	    }
	    if (duplicate == 2){
		count++;
	    }
	}

	return count == 2;
    }
}
