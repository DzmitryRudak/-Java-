// 5/ –еализуйте алгоритм, определ€ющий, все ли символы в строке встречаютс€ один раз.

package Lesson3Strings;

public class Task05 {

	public static void main(String[] args) {
		String str = "No mo,ney - no. honey"; // check-string
		System.out.println(str);
		char[] charsArray = str.toCharArray();
		int lengthStr, i=1,k;
		boolean b=false;
		lengthStr = str.length();
		findCopiChar:
			for (k=0; k<lengthStr;) {
				i=1;
				i=i+k;
				for (;i < lengthStr; i++) {
					if (charsArray[k]==charsArray[i]){
						System.out.println("\nCopy:" + charsArray[k]);
		b=true;
		break findCopiChar;
					}
				}
				k++;
							}
		if (!b);
		System.out.println("Copy symbols is apsent");

	}

}
