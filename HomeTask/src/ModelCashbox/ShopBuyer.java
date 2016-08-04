package ModelCashbox;

public class ShopBuyer implements Comparable<ShopBuyer> {
	
	private int number;
	private String name;
	private String products;
	
	public ShopBuyer (int i, String n, String p) {
		number = i;
		name = n;
		products = p;
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getProducts() {
		return products;
	}
	public boolean equals (ShopBuyer other) {
		return this.getNumber() == other.getNumber();
	}
			
	@Override
	public int compareTo(ShopBuyer other) {
		if(this.equals(other))
			return 0;
		else if (getNumber() > other.getNumber())
			return 1;
		else
			return -1;
	}
	
	public String toString() {
		return "Number:" + getNumber() + " Name: " + getName() + " BuyProducts: " + getProducts();
	}
}
