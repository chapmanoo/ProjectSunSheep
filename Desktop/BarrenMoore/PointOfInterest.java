import java.util.Random;

public class PointOfInterest {
	private Random rand = new Random();
	private int x = rand.nextInt(30) - 1;
	private int y = rand.nextInt(30) - 1;

	private int type = rand.nextInt(3);

	// 0 = Healer
	// 1 = Goblin
	// 2 = View

	public void interacting (Player p) {
		
		switch (type) {
		case 0:
		isAHealer();
		p.heal();
		break;
		case 1:
		isAGoblin();
		p.takeDamage();
		break;
		case 2:
		isAView();
		break;
		}
		
	}
	
	public void isPlayerOnThis (Player p) {
		if (p.getX() - this.x == 0 && p.getY() - this.y == 0){
			interacting(p);
		}
	}

	private void isAHealer() {
		System.out.println("You see a wizzened old woman sat arround a bubbleing cauldron");
		System.out.println("She offeres you a seat and a bowl of soup");
		System.out.println("After drinking the soup, you feel revitalised and fresh");
		System.out.println("She wishes you on your way");
	}

	private void isAGoblin() {
		System.out.println("A small, boney looking creature catches your eye");
		System.out.println("It studies you for a while");
		System.out.println("The beast lunges at you with its sharp claws");
	}

	private void isAView() {
		int temp = rand.nextInt(3);
		if (temp == 0)
		{
			System.out.println("You come accross a small rock that sticks out from the ground");
			System.out.println("You try to pick it up, but it is stuck fast in the ground");
			System.out.println("After some deliberation, you decide to leave ");
		}
		else if (temp == 1) {
			System.out.println("You see a lone sproutling tree reaching up from the barren floor");
			System.out.println("It looks like it has been here for a few years");
			System.out.println("You can't do much with it, so decide to leave");
		}
		else if (temp == 2) {
			System.out.println("You look out into the vastness of the moor");
			System.out.println("It looks like it goes on forever");
			System.out.println("No point in stopping. You move on");
		}
		
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
