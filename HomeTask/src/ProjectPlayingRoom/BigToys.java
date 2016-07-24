// Big related type.

package ProjectPlayingRoom;

public class BigToys extends Toys {
	
	public BigToys (String name, int price, int age) {
		
		this.name=name; // name
		this.price=price; // price
		this.age=age; // age group
		
		BigToys FIRETRUCK = new BigToys ("FIRETRUCK", 10, 7);
		BigToys TRACTOR = new BigToys ("TRACTOR", 9, 7);
		BigToys ELECTRICCAR = new BigToys ("ELECTRICCAR", 8, 7);
	}
	
}
