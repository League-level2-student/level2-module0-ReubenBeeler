package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] StringArray = {"Hello,", "my", "name", "is", "Reuben"};
		//2. print the third element in the array
		System.out.println(StringArray[2]);
		//3. set the third element to a different value
		StringArray[2] = "first name";
		//4. print the third element again
		System.out.println(StringArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < StringArray.length; i++) {
			System.out.print(StringArray[i] + " ");
		}
		//6. make an array of 50 integers
		int[] intArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			intArray[i] = random.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 100;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < smallest) {
				smallest = intArray[i];
			}
		}
		System.out.println("\nThe smallest number in intArray is " + smallest + ".");
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//10. print the largest number in the array.
		int biggest = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > biggest) {
				biggest = intArray[i];
			}
		}
		System.out.println("The biggest number in intArray is " + biggest + ".");
	}
}
