package Lesson2;

import java.util.Arrays;

public class Task04 { // Find largest element & its index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] =  new int[]{1,2,7,12,3,14,8,9,4,15,6,5,10,11,13};
Arrays.sort(array); // sort array
int max = array[array.length - 1];
int index = Arrays.asList(1,2,7,12,3,14,8,9,4,15,6,5,10,11,13).indexOf(max); // Returns a fixed-size list backed by the specified array.
		System.out.println("наибольший элемент: " + max + " индекс: " + index);
	}
				}
	
	
	
	