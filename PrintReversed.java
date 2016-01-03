public class PrintReversed{
    public static void main(String[] args){
		printReversed("four score and seven years ago");
    }

    public static void printReversed(String s1){
		String result = "";
		String temp = "";
      
		for(int i = s1.length() - 1; i > -1; i--){
			if (s1.charAt(i) == ' '){
				result = s1.charAt(i) + temp + result;
				temp = "";
			}
			else{
				temp += s1.charAt(i);
				if (i == 0){
					result = temp + result;
				}
			}
		}
      System.out.println(result);
	}
}
