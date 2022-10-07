package bluedigi;

public class Pet {
	private int happiness;
	private int health;
	private int cleanness;
	
	Pet(int happiness, int health, int cleanness) {
		this.happiness = happiness;
		this.health = health;
		this.cleanness = cleanness;
	}
	
	Pet() {
		this.happiness = 10;
		this.health = 10;
		this.cleanness = 10;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getCleanness() {
		return cleanness;
	}

	public void setCleanness(int cleanness) {
		this.cleanness = cleanness;
	}
	
	public void printName() {
		System.out.println("Hewan Peliharaan");
	}
	
}

class Anjing extends Pet{
	public void printName() {
		System.out.println("Hewan Peliharaan (Anjing)");
	}
}

class Kucing extends Pet{
	public void printName() {
		System.out.println("Hewan Peliharaan (Kucing)");
	}
}