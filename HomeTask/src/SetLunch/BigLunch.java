package SetLunch;

public class BigLunch extends LunchBuilder {
	
	private Lunch lunch = new Lunch();
	 
    @Override
    public void buildFirst() {
    	lunch.Add("Bread");
    	lunch.Add("Soup");
    }
 
    @Override
    public void buildSecond() {
    	lunch.Add("Potato, steak and juice");
    	lunch.Add("Sause");
    }
 
    @Override
    public void buildDesert() {
    	lunch.Add("Cake and tea");
    	lunch.Add("Orange");
    }

}
