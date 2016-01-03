public class PriceIsRight{
	public static void main(String[] args){
		int[] a1 = {234, 528, 235, 253, 400};
		int[] a2 = {98, 70, 72};
		int[] a3 = {900, 885, 989, 1};
		int[] a4 = {200};
		int[] a5 = {500, 300, 241, 99, 501};
		
		System.out.println(priceRight(a4,300));
	}
	
	public static int priceRight(int[] bids, int price){
		int difference = price;
		int result = -1;
		
		for(int i = 0; i < bids.length; i++){
			if (bids[i] <= price && price - bids[i] < difference ){
				difference = price - bids[i];
				result = bids[i];
			}
		}
		
		return result;
	}
}