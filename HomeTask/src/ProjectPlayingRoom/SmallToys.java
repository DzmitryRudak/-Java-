// Small related type.

package ProjectPlayingRoom;

public class SmallToys extends Toys {
	
public SmallToys (String name, int price, int age) {
		
		this.name=name; // name
		this.price=price; // price
		this.age=age; // age group
		
		SmallToys CUBES = new SmallToys ("CUBES", 5, 2);
		SmallToys PUZZLE = new SmallToys ("PUZZLE", 4, 2);
		SmallToys SOLDIERS = new SmallToys ("SOLDIERS", 3, 2);
	}
}
