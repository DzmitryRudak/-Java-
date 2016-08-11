package SetLunch;

public class MainLunch {

	public static void main(String[] args) {
		
		LunchBuilder lunch = new StandartLunch();
		LunchBuilder bigLunch = new BigLunch();
		Lunch exDir = Director.collected(lunch);
		exDir.loocking();		
	}

}
