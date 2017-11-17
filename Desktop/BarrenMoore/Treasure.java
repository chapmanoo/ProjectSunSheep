import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Treasure {
	private Random rand = new Random();
	private int x = rand.nextInt(50)-11;
	private int y = rand.nextInt(50)-11;
	private int ammount = rand.nextInt(5000) - 100; //how much the treasure is worth
	private boolean found = false;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAmmount() {
		return ammount;
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}
	
	public void isPlayerOnTreasure(Player p) {
		if (p.getX() - this.x == 0 && p.getY() - this.y == 0 ) {found = true;}
	}
	
}
