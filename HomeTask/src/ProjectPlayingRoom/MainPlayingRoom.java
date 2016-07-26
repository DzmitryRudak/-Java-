/* 14. ������� �������. �����������  �������  �������  ���  �����  ������  ���������� �����. ������� ������ ���� ������������� ���������� � �������� ���������� ����� �����. ������ ����������� ������� ����������� 
* �����:  ���������,  �������  �  �������  ������,  �����,  ����,  ������. 
* �������� ���������� ������� � ������� �� ������ �� ����������.
*/

package ProjectPlayingRoom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainPlayingRoom {
		
	private static String BigToys;
	private static String MiddleToys;
	private static String SmallToys;
	private static Set<String> age2;
	private static Set<String> age1;
	private static Set<String> age3;
	private static char[] contentSmallToys2;
	private static char[] contentMiddleToys2;
	private static char[] contentBigToys2;

	public static void main(String[] args) {
				
		menu: while (true) {
			String select = startMenu1();
			System.out.println(select);
			switch (select) {
			case "q": {
				System.out.println("exit");
				break menu;
			}
			case "x": { // ������� ��� ���������� ������ 1-3 ����
				System.out.println("\n������� ��� ����� 1-3 ����");
				contentSmallToys(SmallToys);
				System.out.println(contentSmallToys2);
				break;
			}
			case "y": { // ������� ��� ���������� ������ 3-5 ���
				System.out.println("\n������� ��� ����� 3-5 ���");
				contentMiddleToys(MiddleToys);
				System.out.println(contentMiddleToys2);
				break;
			}
			case "z": { // ������� ��� ���������� ������ 5-8 ��� 
				System.out.println("\n������� ��� ����� 5-8 ���");
				contentBigToys(BigToys);
				System.out.println(contentBigToys2);
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
			private static String startMenu1() {
				Scanner sc = new Scanner(System.in);
				System.out.println("������� ����");
				System.out.println("q - ����� �� ����������");
				System.out.println("x - ������� ������ 0-3 ����");
				System.out.println("y - ������� ������ 3-5 ���");
				System.out.println("z - ������� ������ 5-8 ���");
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

		private static String startMenu() {
				return null;
	}

	private static void contentSmallToys(String smallToys2) {
		SmallToys Cubes = new SmallToys ("Cubes", 5, age1);
		SmallToys Puzzle = new SmallToys ("Puzzle", 4, age1);
		SmallToys Soldiers = new SmallToys ("Soldiers", 3, age1);
		
	}
	
	private static void contentMiddleToys(String middleToys2) {
		MiddleToys Doll = new MiddleToys ("Doll", 7, age2);
		MiddleToys Ball = new MiddleToys ("Ball", 6, age2);
		MiddleToys Book = new MiddleToys ("Book", 6, age2);
		
	}
	
	private static void contentBigToys(String bigToys2) {
		BigToys Firetruck = new BigToys ("Firetruck", 10, age3);
		BigToys Tractor = new BigToys ("Tractor", 9, age3);
		BigToys Electriccar = new BigToys ("Electriccar", 8, age3);
	}
	}
	


