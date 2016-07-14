package Lesson2;

public class CalculateTheProduct { // In an array of 10 numbers to calculate the product of the elements of the array to the first zero.

	public static void main(String[] args) {
		int[] a = new int[]{3,5,9,6,1,0,7,2,4,8};
		int count = 1;
		for (int i = 0; i < a.length & a[i] != 0; i++){ // find first 0
			count *= a[i]; // product all found elements
			System.out.println(count);
	}
	}
}
