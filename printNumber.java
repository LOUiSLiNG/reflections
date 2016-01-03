public class printNumber{
	public static void main(String[] args){
		int[] num = {3,8,4,9,2,1,4,7};
		printNumber(num);
	}
	
	public static void printNumber(int[] list){
		String number = "";
		int count = 0;
		for(int i=list.length - 1; i > -1; i--){
			if ( count == 3){
				number = "," + number;
				count = 0;
			}
			number = list[i] + number;
         count++;
		}
		System.out.println(number);
	}
	
}