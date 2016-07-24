// Middle related type.

package ProjectPlayingRoom;

public class MiddleToys extends Toys {
	
public MiddleToys (String name, int price, int age) {
		
		this.name=name; // name
		this.price=price; // price
		this.age=age; // age group
		
		MiddleToys DOLL = new MiddleToys ("DOLL", 7, 4);
		MiddleToys BALL = new MiddleToys ("BALL", 6, 4);
		MiddleToys BOOK = new MiddleToys ("BOOK", 6, 4);
	}

}
