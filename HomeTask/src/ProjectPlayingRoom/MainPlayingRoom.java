/* 14. ������� �������. �����������  �������  �������  ���  �����  ������  ���������� �����. ������� ������ ���� ������������� ���������� � �������� ���������� ����� �����. ������ ����������� ������� ����������� 
* �����:  ���������,  �������  �  �������  ������,  �����,  ����,  ������. 
* �������� ���������� ������� � ������� �� ������ �� ����������.
*/

package ProjectPlayingRoom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainPlayingRoom {
		
	private static int i;

	public static void main(String[] args) {
	
	Set<String> ageGroup = new HashSet<String>(); {
	
		ageGroup.add("1-3 years");
		ageGroup.add("3-5 years");
		ageGroup.add("5-8 years");
	
		for (String s : ageGroup) {
			System.out.println(s);
			}
		}
	// ��������� ���� ���� �������
	int[] price = {10, 5, 8, 3, 7, 4, 9, 6};
	Arrays.sort(price);
	for (int s : price);
	System.out.println(price[i] + " ");
	}
}
