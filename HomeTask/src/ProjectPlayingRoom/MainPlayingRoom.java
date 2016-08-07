/* 14. Игровая комната. Подготовить  игровую  комнату  для  детей  разных  возрастных групп. 
* Игрушек должно быть фиксированное количество в пределах выделенной суммы денег.
* Должны встречаться игрушки родственных групп:  маленькие,  средние  и  большие  машины,  куклы,  мячи,  кубики. 
* Провести сортировку игрушек в комнате по одному из параметров.
*/

package ProjectPlayingRoom;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class MainPlayingRoom {
		
	private static String BigToys;
	private static String MiddleToys;
	private static String SmallToys;
	private static Set<String> age2;
	private static Set<String> age1;
	private static Set<String> age3;
	
	

	public static void main(String[] args) {
		
		Locale loc = new Locale ("ru","RU");
		
		Date now = new Date ();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,loc);
		System.out.println(df.format(now));
		
				
		menu: while (true) {
			String select = startMenu();
			System.out.println(select);
			switch (select) {
			case "q": {
				System.out.println("exit");
				break menu;
			}
			case "x": { // игрушки для возрастной группы 1-3 года
				System.out.println("\nИгрушки для детей 1-3 года");
				contentSmallToys(SmallToys);
				System.out.println(SmallToys);
				break;
			}
			case "y": { // игрушки для возрастной группы 3-5 лет
				System.out.println("\nИгрушки для детей 3-5 лет");
				contentMiddleToys(MiddleToys);
				System.out.println(MiddleToys);
				break;
			}
			case "z": { // игрушки для возрастной группы 5-8 лет 
				System.out.println("\nИгрушки для детей 5-8 лет");
				contentBigToys(BigToys);
				System.out.println(BigToys);
				break;
			}
			default: {
				System.out.println("Некорректный выбор");
				continue menu;
			}
		}
		}
		}
			// выводим меню, возвращающее выбор пользователю
			private static String startMenu() {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Выберите игровую комнату:" + "\n");
				System.out.println("q - Выход из программмы");
				System.out.println("x - Комната для детей 0-3 года");
				System.out.println("y - Комната для детей 3-5 лет");
				System.out.println("z - Комната для детей 5-8 лет");
				return sc.nextLine();
			}
								
			// создаем возрастные группы
	Set<String> age = new HashSet<String>(); {
	
		age1.add("1-3 years");
		age2.add("3-5 years");
		age3.add("5-8 years");
	
		for (String s : age) {
			System.out.println(s);
			}
	}
		
	private static void contentSmallToys(String smallToys) {
		SmallToys Cubes = new SmallToys ("Cubes", 5, age1);
		SmallToys Puzzle = new SmallToys ("Puzzle", 4, age1);
		SmallToys Soldiers = new SmallToys ("Soldiers", 3, age1);
		
	}
	
	private static void contentMiddleToys(String middleToys) {
		MiddleToys Doll = new MiddleToys ("Doll", 7, age2);
		MiddleToys Ball = new MiddleToys ("Ball", 6, age2);
		MiddleToys Book = new MiddleToys ("Book", 6, age2);
		
	}
	
	private static void contentBigToys(String bigToys) {
		BigToys Firetruck = new BigToys ("Firetruck", 10, age3);
		BigToys Tractor = new BigToys ("Tractor", 9, age3);
		BigToys Electriccar = new BigToys ("Electriccar", 8, age3);
	}
	}
	


