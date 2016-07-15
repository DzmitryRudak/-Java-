// »з небольшого текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами.

package Lesson3Strings;

public class Task03 {

	public static void main(String[] args) {
	String text = "Jav, a . the ; most popu\"lar [] among p' languege";
	System.out.println(text);
	text = text.replaceAll("[^a-zA-Z]", "");
	text = text.replaceAll("[\t\n\r]+", " ");
	System.out.println(text);
			

	}

}
