
public class StringPractice {
	public static void main(String[] args) {
		boolean barking = true;
		int hour = (int) 0;
		System.out.println(dogTrouble(true, 6));
		System.out.println(dogTrouble(true, 7));
		System.out.println(dogTrouble(false, 6));
		
	
	}

	public static boolean dogTrouble(boolean barking, int hour) {
		return(barking && (hour <7 || hour>20));
	}
}
																																																														