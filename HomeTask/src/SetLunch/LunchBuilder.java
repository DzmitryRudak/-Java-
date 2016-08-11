package SetLunch;

public abstract class LunchBuilder {
	
	private Lunch lunch = new Lunch();
	 
    public Lunch getLunch() {
        return lunch;
    }
    
    public abstract void buildFirst();
    public abstract void buildSecond();
    public abstract void buildDesert();

}
