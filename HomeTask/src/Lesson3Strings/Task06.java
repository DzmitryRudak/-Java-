package Lesson3Strings;

public class Task06 { // determining whether one line other permutation.

	public static void main(String[] args) {
	String str1 = new String(); // create new variables
	String str2 = new String();
	str1 = "woodholly";
	str2 = "hollywood";
	System.out.print(isSubstring(str1,str2));
	}
public static boolean isSubstring(String str1, String str2) { // create logik method
	int l = str1.length();
	if (l == str2.length()) { // check condition
		String str = str1 + str1;
		str = str.replace(str2,  "");
		if (str.equals(str1)) {  // check condition
			return true;
		}
	}
	return false;
	}
}
