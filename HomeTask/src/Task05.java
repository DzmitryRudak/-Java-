
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int height = 0;
int weight = 0;
int difference = height - weight - 100; // calculates the optimal weight
if (difference > 0){ // compare result
	System.out.println("Вам нужно поправиться на " + difference + "кг");}
else {
	System.out.println("Вам нужно похудеть на " + Math.abs(difference) + "кг"); // + module difference
}
	}

}
