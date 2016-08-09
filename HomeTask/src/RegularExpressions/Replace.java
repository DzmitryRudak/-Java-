package RegularExpressions;

import java.util.regex.Pattern;

public class Replace {
	
	String text;	
	private String search = "<[pP].*?>";
	private String replace="<p>";
	
	public Replace() {
	}
	// create rules
	public String replaceAllTag(String str) {
		text=str;
        return Pattern.compile(search).matcher(text).replaceAll(replace);  
	} 

}
