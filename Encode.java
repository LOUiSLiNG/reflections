import java.util.*;

public class Encode{
	public static void main(String[] args){
		String result = encode("abcdefghijklmnopqrstuvwxyz", 3);
      encode("four score and seven", 4);
		System.out.println(result);
	}
	
   public static String encode(String s, int n) {
	    String result = "";
            for (int j = 0; j < n; j++) {
				for (int i = j; i < s.length(); i += n) {
                    result += s.charAt(i);
                }
	    }
	    return result;
	}
}