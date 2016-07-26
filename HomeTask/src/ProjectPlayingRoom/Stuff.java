package ProjectPlayingRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stuff {

	private int maxToys;
    private double maxCash;
    private double Cash;
    private List<Toys> gameRoom;
    private List<Toys> toys;
    private List<Class<? extends Toys>> tClasses =
            new ArrayList<Class<? extends Toys>>
                    (Arrays.asList(BigToys.class, MiddleToys.class, SmallToys.class));

 // заполняем возрастные группы игрушками в пределах суммы
    private boolean addToyToGameRoom(Toys toy) {  
        if (gameRoom.size() < maxToys && Cash
                + toy.getPrice() <= maxCash) {
            gameRoom.add(toy);
            return true;
        } else return false;
    }
   
    private String getOutput(List<Toys> toys) {
        String result = "\nOutput:\n";
        for (Toys toy : toys) {
            result += toy.toString() + "\n";
        }
        result += getResult(toys);
        return result;
    }

    private String getResult(List<Toys> toys) {
        return "\nUsed moneys: " + getTotalCost(toys) +
                " of total: " + maxCash +
                "\nUsed toys: " + toys.size() +
                " of total: " + maxToys;
    }

    private double getTotalCost(List<Toys> toys) {
        double result = 0;
        for (Toys toy : toys) {
            result += toy.getPrice();
        }
        return result;
    }

    public Stuff (int maxToys, double maxCash) {
        Price price = new Price(tClasses);
        this.maxToys = maxToys;
        this.maxCash = maxCash;
        this.gameRoom = new ArrayList<Toys>();
        this.toys = new ArrayList<Toys>();        
    }

    public void fillGameRoom () {
        while(true) {
            Toys toy = getToy();
            if (!addToyToGameRoom(toy)) break;
            Cash += toy.getPrice();
        }
    }

    private Toys getToy() {		
		return getToy();
	}

	public String getOutput() {
        return getOutput(gameRoom);
    }

    public String getResult() {
        return getResult(gameRoom);
    }
       
    public String findByCost(double startCost, double endCost) {
        toys.clear();
        for (Toys toy : gameRoom) {
            if (toy.getPrice() >= startCost && toy.getPrice() <= endCost) {
                toys.add(toy);
            }
        }
        return getOutput(toys);
    }
	
}
