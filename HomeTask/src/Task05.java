
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int height = 0;
int weight = 0;
int difference = height - weight - 100; // calculates the optimal weight
if (difference > 0){ // compare result
	System.out.println("��� ����� ����������� �� " + difference + "��");}
else {
	System.out.println("��� ����� �������� �� " + Math.abs(difference) + "��"); // + module difference
}
	}

}
