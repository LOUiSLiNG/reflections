public class Count{
	public static void main(String[] args){
		int count = count("iss", "MISSISSIPPI");
		System.out.println(count);
	}
	
	public static int count(String pattern, String target){
		target = target.toLowerCase();
		pattern = pattern.toLowerCase();
		int count = 0;
		
		while (target.indexOf(pattern) != -1){
			target = target.substring(target.indexOf(pattern) + 1);
			count++;
		}
		
		return count;
	}
}