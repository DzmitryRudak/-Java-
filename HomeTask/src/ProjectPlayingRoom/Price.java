package ProjectPlayingRoom;

import java.util.*;


public class Price {
	 
	    private static Map<Class<? extends Toys>, Double> price;
	    private List<Class<? extends Toys>> tClasses;

	    // создаем интерфейс для цены игрушек
	    public Price(List<Class<? extends Toys>> tClasses) {
	        price = new HashMap<Class<? extends Toys>, Double>();
	        this.settClasses(tClasses);
  }

	    public static double getPrice(Class<? extends Toys> tClass) {
	        return price.get(tClass);
  }

		public List<Class<? extends Toys>> gettClasses() {
			return tClasses;
		}

		public void settClasses(List<Class<? extends Toys>> tClasses) {
			this.tClasses = tClasses;
		}

	
}
