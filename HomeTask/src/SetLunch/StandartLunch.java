package SetLunch;

public class StandartLunch extends LunchBuilder {
	
	 private Lunch lunch = new Lunch();
	 
	    @Override
	    public void buildFirst() {
	    	lunch.Add("Soup");
	    }
	 
	    @Override
	    public void buildSecond() {
	    	lunch.Add("Potato and steak");
	    }
	 
	    @Override
	    public void buildDesert() {
	    	lunch.Add("Cake and tea"); 
	    }

}
