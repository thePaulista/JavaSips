package practice.forloop;

public class ForLoopPractice {
	
	public static void main(String[] args) {
		
		String name = "cslewis";
		String name2 = "birdandthebaby";
		
		for (int i = 0; i < name.length(); i++) {
		System.out.println("letter: " + name.charAt(i));
	}
			
		// reverse 
		for (int j = name.length() - 1; j <= 0; j--) {
			System.out.println("name reversed : " + name.charAt(j));
		}
		
		for (int k = 0; k <= 100; k += 2) {
			System.out.println("this is even: " + k);
		}
	}

}


//Recursive

//public void reverseString() {
//    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    String reverseAlphabet = reverse(alphabet, alphabet.length()-1);
//}
//
//String reverse(String stringToReverse, int index){
//    if(index == 0){
//        return stringToReverse.charAt(0) + "";
//    }
//
//    char letter = stringToReverse.charAt(index);
//    return letter + reverse(stringToReverse, index-1);
//}