import java.util.Random;

public class Player {
	private Random rand = new Random();

	private int health = 100;
	private int mana = 50;

	private String name = "Bob the Adventurer";

	private int level = 1;
	private int strength = 1;
	private int intelligence = 1;
	private int dexterity = 1;

	private int x = rand.nextInt(10) - 1;
	private int y = rand.nextInt(10) - 1;
	
	private boolean isDead = false;

	private void levelUp(int i) {
		this.level++;

		switch (i) {
		case 1:
			this.strength++;
			break;
		case 2:
			this.intelligence++;
			break;
		case 3:
			this.dexterity++;
			break;
		}
	}

	public void move(String direction) {

		switch (direction) {
		case "north":
			this.y++;
			System.out.println("Moved north");
			break;
		case "east":
			this.x++;
			System.out.println("Moved east");
			break;
		case "south":
			this.y--;
			System.out.println("Moved south");
			break;
		case "west":
			this.x--;
			System.out.println("Moved west");
			break;
		}
	}

	public void showPlayerPos() {
		System.out.println("Your X:" + this.x);
		System.out.println("Your Y:" + this.y);
	}

	public void look() {
		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		giveOptions();
	}

	public void showStats() {
		System.out.println("||====" + this.name + "====||");
		System.out.println("||          Health:" + this.health + "      ||");
		System.out.println("||            Mana:" + this.mana + "       ||");
		System.out.println("||                          ||");
		System.out.println("||              Lv:" + this.level + "        ||");
		System.out.println("||        Strength:" + this.strength + "        ||");
		System.out.println("||    Intelligence:" + this.intelligence + "        ||");
		System.out.println("||       Dexterity:" + this.dexterity + "        ||");

	}

	public void giveOptions() {
		System.out.println("Try 'n','s','e',or 'w' to move");
		System.out.println("you can also try");
		System.out.println("stats, help, look, pos, compass");
	}

	public void heal() {
		this.health += this.intelligence * 2;
	}
	
	public void healMagic() {
		this.health += this.intelligence * 2;
	}
	
	public void takeDamage() {
		this.health += 20 - this.strength;
	}
	
	
	// getters and setters
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

}
