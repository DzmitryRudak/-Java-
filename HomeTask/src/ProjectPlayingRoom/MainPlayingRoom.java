/* 14. ������� �������. �����������  �������  �������  ���  �����  ������  ���������� �����. 
* ������� ������ ���� ������������� ���������� � �������� ���������� ����� �����.
* ������ ����������� ������� ����������� �����:  ���������,  �������  �  �������  ������,  �����,  ����,  ������. 
* �������� ���������� ������� � ������� �� ������ �� ����������.
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
			case "x": { // ������� ��� ���������� ������ 1-3 ����
				System.out.println("\n������� ��� ����� 1-3 ����");
				contentSmallToys(SmallToys);
				System.out.println(SmallToys);
				break;
			}
			case "y": { // ������� ��� ���������� ������ 3-5 ���
				System.out.println("\n������� ��� ����� 3-5 ���");
				contentMiddleToys(MiddleToys);
				System.out.println(MiddleToys);
				break;
			}
			case "z": { // ������� ��� ���������� ������ 5-8 ��� 
				System.out.println("\n������� ��� ����� 5-8 ���");
				contentBigToys(BigToys);
				System.out.println(BigToys);
				break;
			}
			default: {
				System.out.println("������������ �����");
				continue menu;
			}
		}
		}
		}
			// ������� ����, ������������ ����� ������������
			private static String startMenu() {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("�������� ������� �������:" + "\n");
				System.out.println("q - ����� �� ����������");
				System.out.println("x - ������� ��� ����� 0-3 ����");
				System.out.println("y - ������� ��� ����� 3-5 ���");
				System.out.println("z - ������� ��� ����� 5-8 ���");
				return sc.nextLine();
			}
								
			// ������� ���������� ������
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
	


