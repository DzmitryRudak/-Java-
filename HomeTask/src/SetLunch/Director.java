package SetLunch;

public class Director {
	
	public static Lunch collected (LunchBuilder builder) {
        builder.buildFirst();
        builder.buildSecond();
        builder.buildDesert();
        return builder.getLunch();
    }

}
