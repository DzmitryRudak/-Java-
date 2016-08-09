package RegularExpressions;

public class RegExp {

	public static void main(String[] args) {
		// text
		String text="Search expression <p id=”p1”>  exchange *  <pYu> * and yet one more time: <p id=”p1” =\"> and find <p id=”p1”>* * <p xx>*";
		Replace removeTag=new Replace(); // replace function
		System.out.println (removeTag.replaceAllTag(text));
	}
}


