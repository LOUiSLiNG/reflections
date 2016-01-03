public class AllPlural{
	public static void main(String[] args){
		String[] a1 = {"snails", "DOGS", "Cats"};
		String[] a2 = {"builds", "Is", "S", "THRILLs", "CS"};
		String[] a3 = {};
		String[] a4 = {"She", "sells", "sea", "SHELLS"};
		String[] a5 = {"HANDS", "feet", "toes", "OxEn"};
		String[] a6 = {"shoes", "", "socks"};
		
		System.out.println(allPlural(a6));
	}
	public static boolean allPlural(String[] a1){
		for(String each : a1){
			if (each.length() == 0){
				return false;
			}
			else if( each.toLowerCase().charAt(each.length() - 1) != 's'){
				return false;
			}
		}
		return true;
	}
}