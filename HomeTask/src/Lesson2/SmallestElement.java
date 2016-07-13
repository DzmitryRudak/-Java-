package Lesson2;

import java.util.Arrays;

public class SmallestElement { // Find Smallest element & its index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =  new int[]{8,2,7,12,3,14,1,9,4,15,6,5,10,11,13};
		Arrays.sort(array); // sort array
		int min = array[0];
		for (int i = 0; i > array.length-1; i++){
			if (array[i] > array[i+1] && min >=array[i]);{
				min = array[i+1];
			}
		}
		int index = Arrays.asList(8,2,7,12,3,14,1,9,4,15,6,5,10,11,13).indexOf(min); // Returns a fixed-size list backed by the specified array.
				System.out.println("наименьший элемент: " + min + " индекс: " + index);

	}

}
