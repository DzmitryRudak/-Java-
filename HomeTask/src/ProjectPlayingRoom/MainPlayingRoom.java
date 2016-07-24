/* 14. Игровая комната. Подготовить  игровую  комнату  для  детей  разных  возрастных групп. Игрушек должно быть фиксированное количество в пределах выделенной суммы денег. Должны встречаться игрушки родственных 
* групп:  маленькие,  средние  и  большие  машины,  куклы,  мячи,  кубики. 
* Провести сортировку игрушек в комнате по одному из параметров.
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
	// сортируем цены всех игрушек
	int[] price = {10, 5, 8, 3, 7, 4, 9, 6};
	Arrays.sort(price);
	for (int s : price);
	System.out.println(price[i] + " ");
	}
}
