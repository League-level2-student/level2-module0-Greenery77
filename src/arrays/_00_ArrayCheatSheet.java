package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] colors  = {"red", "blue", "yellow", "green", "black"};
		
		//2. print the third element in the array
		
		System.out.println(colors[2]);
		
		//3. set the third element to a different value
		
		colors[2] = "turquoise";
		
		//4. print the third element again
		
		System.out.println(colors[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < colors.length; i++) {
			
			System.out.print(colors[i] + ", ");
			
		}
		
		//6. make an array of 50 integers
		
		int[] ints = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		
		Random ran = new Random(0);
		
		for (int i = 0; i < ints.length; i++) {
			
			ints[i] = ran.nextInt(50);
			
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		
		int smallest = ints[0];
		
		for (int i = 0; i < ints.length; i++) {
		
			if (ints[i] < smallest) {
				
				smallest = ints[i];
				
			}
			
		}
		
		System.out.println(smallest);
		
		//9. print the entire array to see if step 8 was correct
		
		for (int i = 0; i < ints.length; i++) {
		
		System.out.print(ints[i] + ", ");
		
		}
		
		//10. print the largest number in the array.
	
		int largest = ints[0];
		
		for (int i = 0; i < ints.length; i++) {
		
			if (ints[i] > largest) {
				
				largest = ints[i];
				
			}
			
		}
		
		System.out.println(largest);
	
	}
}
