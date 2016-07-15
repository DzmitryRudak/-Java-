/*1. В каждом слове текста k-ю букву заменить заданным символом c клавиатуры. 
 * Если k больше длины слова, корректировку не выполнять.
*/

package Lesson3Strings;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int k = 4; // replace every k-th symbol
		char firstChar;
		String str1 = new String();
		String str2 = " A data type is a set of values and a set of operations defined on those values";
		String resultStr = new String();
		Scanner sc = new Scanner (System.in);
		k--;
	System.out.print("Enter symbol for replace");
	str1 = sc.nextLine();
	firstChar = str1.charAt(0);
	System.out.println(str1);
	String[] str2ToArray = str2.split(" ");
	for (String value : str2ToArray){
		String clearStr = value.replaceAll("[^a-zA-Z]", "");
		int length = clearStr.length();
		if (length>k){
			value = replaceCharAt(value, k, firstChar);
		}
		resultStr = resultStr.concat(value).concat(" ");
				}
	System.out.println(str2);
	System.out.println(resultStr);
	}
	
	private static String replaceCharAt(String s, int pos, char c) {
				return s.substring(0, pos) + c + s.substring(pos + 1);
	}

	}


