package practice.forloop;

public class ForLoopPractice {
	
	public static void main(String[] args) {
		
		String name = "cslewis";
		
		for (int i = 0; i < name.length(); i++) {
		System.out.println("letter: " + name.charAt(i));
	}
			
		// reverse 
		for (int j = name.length() - 1; j <= 0; j--) {
			System.out.println("name reversed : " + name.charAt(j));
		}
		
		int counter = 0;
		
		for (int k = 0; k <= 100; k += 2) {
			System.out.println("this is even: " + k);
		}
		
		for (int idx = 0; idx < 100; idx++) {
		
			for (int j = 0 ; j < 10; j++) {
				System.out.println("the value of idx was " + idx + "----" + j);
				
				counter++;
			}
		
		}
		
		System.out.println("Counter: " + counter);
		
	}

}


//Recursive from SO

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