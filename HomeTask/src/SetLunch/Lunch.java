package SetLunch;

import java.util.ArrayList;

public class Lunch {
	
public static String getlunch;
private final ArrayList<String> lunch = new ArrayList<>();
    
    public void Add(String food){
        lunch.add(food);
    }
 
    public void loocking (){
        for (String lun: lunch){
            System.out.println(lun);
        }
    }
}
