// Toys abstract.

package ProjectPlayingRoom;

import java.util.Set;

public abstract class Toys {
	String name; // name
	int price; // price
	Set<String> age; // age groupe
	String type; // related type
	
	public Toys () {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<String> getAge() {
		return age;
	}

	public void setAge(Set<String> age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "("+ name +" : "+ price +")";
	}
	
	public int getPrice1() {
		return price;
	}
	
	public String getName1() {
		return name;
	}
}
