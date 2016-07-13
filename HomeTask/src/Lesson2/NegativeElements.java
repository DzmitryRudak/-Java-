package Lesson2;

import java.util.Arrays;

public class NegativeElements { // find negative elements of the array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =  new int[]{-8,2,7,-12,3,1,-9,4,6,-5};
		Arrays.sort(array); // sort array
		int count = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] < 0)count ++; // count negative elements
					System.out.println("Array have " + count + " negative elements");
	}
	}
}
