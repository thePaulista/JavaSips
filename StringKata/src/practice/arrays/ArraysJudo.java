package practice.arrays;

public class ArraysJudo {
	
	public static void main(String[] args) {
		
		int[] values = new int[100];
		
		values[3] = 8;
		
		for (int i = 0; i < values.length; i++) {
				System.out.println(values[i]);	
   
		}
		
		int counter = 0; 
		
		int[] valoos = new int[] {2, 3, 5, 7, 11};
		
		for ( int i = 0; i <  valoos.length; i++) {
			System.out.println(valoos[i]);
			counter++;
		}
		
		System.out.println("Counter: " + counter);
			
		// java's enhanced loop - shortcut
		for(int i : valoos) {
			System.out.println("i = " + i);
		}
	
	}

}
