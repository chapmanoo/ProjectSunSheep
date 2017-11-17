import java.util.ArrayList;

//The adventure of the barren moor

public class GameRunner {
	
	public static void main (String[] args) {
		
		Player player = new Player();
		Treasure treasure = new Treasure();
		GameMaster gm = new GameMaster();
		ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<PointOfInterest>();
		int numOfPOI = 100;
		for (int i = 0; i < numOfPOI; i++) {
			pointsOfInterest.add(new PointOfInterest());
		}
		gm.runIntro();
		player.look();
		
		while (!treasure.isFound() && !player.isDead()) {
			gm.parseUserInput(player, gm.playerInput(), treasure);
			treasure.isPlayerOnTreasure(player);
			for (PointOfInterest temp : pointsOfInterest) {
				temp.isPlayerOnThis(player);
			}
			if (player.getHealth() < 0) {player.setDead(true);}
		}
		
		if (treasure.isFound()) {
			gm.easyVisibility();
			System.out.println("You see a box sitting on the plain.You win!  The end.");
			System.out.println("Its filled with treasure worth £" + treasure.getAmmount() + "!");
			System.out.println("You win!");
			System.out.println("Thank you for playing " + player.getName());
		}
		else if (player.isDead()) {
			gm.easyVisibility();
			System.out.println("Game over");
			
		}
		
		
		
	}
}
