package Lesson2;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myArray = {1,2,3,4,5,6,7,8,9,10};
	int max = myArray[0];
	int min = myArray[0];
	for (int i = 0; i < myArray.length; i++){ // return length array and next step: + 1
		if(myArray[i] > max);{
		max = myArray[i];
				}
		if(myArray[i] < min);{
		min = myArray[i];
		}
				System.out.println(min + " " + max);
	}
		}
	}


