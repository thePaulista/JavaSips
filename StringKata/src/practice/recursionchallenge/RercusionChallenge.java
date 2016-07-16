package practice.recursionchallenge;

public class RercusionChallenge {
	public static void main(String[] args) {
		
		System.out.println(allDollars("hello")); //h$e$l%l%o
		System.out.println(allDollars("piper")); //p$i$p$e$r
	
	}
	
	public static String allDollars(String str) {
		//establish base case
		if(str.length() <= 1) return str;
		// extract first letter w charAt, add $, then call itself with new string at position 1.
		return str.charAt(0) + "$" + allDollars(str.substring(1));		
		
	}

}

//h$e$l$l$o
//p$i$p$e$r