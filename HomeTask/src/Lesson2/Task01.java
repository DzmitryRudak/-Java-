package Lesson2;

public class Task01 {

	private static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float[] x = new float [10];
for (int y = 0; y < x.length; y++) { // Determining the size of the array
	x[y] = (float) (Math.random()*100); // bringing values
	System.out.printf(x[y] + "|");
		
	}

float sum = 0;
for (int a = 0; a < x.length; a++);{
	sum += x[a];}
float average = sum/x.length;
System.out.println("Среднее арифметическое массива:" + average);
	}
}
	


