
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "������";
		int lenght = str.length();
		System.out.println("����� ������ = " + lenght);
		int i = lenght/2;
String str1 = str.substring(0,i);
String str2 = str.substring(i,lenght);
System.out.println(str1);
System.out.println(str2);
	}
}
