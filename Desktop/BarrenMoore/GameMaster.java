import java.util.Scanner;

public class GameMaster {
	
	public void runIntro() {
		System.out.println("Welcome player to the The adventure of the barren moor!");
		easyVisibility();
	}
	
	public String playerInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public void easyVisibility() {
	 System.out.println("============================================================");
	 System.out.println("\n");
	 System.out.println("\n");
	}
	
	public void calculateDistance(Player p, Treasure t) {		
		double xDist = p.getX() - t.getX();
		double yDist = p.getY() - t.getY();
		double sqrX = xDist*xDist;
		double sqrY = yDist*yDist;
		
		double sqrRt = sqrX + sqrY;
		System.out.println("The treasure is " + (int)Math.sqrt(sqrRt) + " meters away");
	}
	
	public void parseUserInput(Player p, String input,Treasure t) {
		switch (input) {
		case "stats":
			p.showStats();
			easyVisibility();
			break;
		case "help":
			p.giveOptions();
			easyVisibility();
			break;
		case "look":
			p.look();
			easyVisibility();
			break;
		case "pos":
			p.showPlayerPos();
			easyVisibility();
			break;
		case "compass":
			calculateDistance(p, t);
			easyVisibility();
			break;
		case "n":
			p.move("north");
			break;
		case "e":
			p.move("east");
			break;
		case "s":
			p.move("south");
			break;
		case "w":
			p.move("west");
			break;
		case"kill":
			System.out.println("You kill yourself");
			System.out.println("What a tit");
			p.setDead(true);
			break;
			
		case "debug":
			System.out.println("treasure: x" + t.getX());
			System.out.println("treasure: y" + t.getY());
		}
	}
}
