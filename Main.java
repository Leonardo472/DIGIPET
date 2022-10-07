package bluedigi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	private ArrayList<Pet> pets = new ArrayList<>();
	
	public Main() {
		int menu = -1;
		newPet();
		do {
			status();
			menu = try_catch();
			if(menu == 1) {
				play();
			}
			else if(menu == 2) {
				eat();
			}
			else if(menu == 3) {
				bath();
			}
		} while (menu != 4);
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
	
	private void status() {
		System.out.println("Digipet");
		System.out.println("=======");for(int i = 0;i < pets.size();i++) {
			System.out.printf("%d. ", i + 1);
			pets.get(i).printName();
			System.out.println("Happiness: " + pets.get(i).getHappiness());
			System.out.println("Health: " + pets.get(i).getHealth());
			System.out.println("Cleanness: " + pets.get(i).getCleanness());
		}
		System.out.println("=======");
		System.out.println("1. Play");
		System.out.println("2. Eat");
		System.out.println("3. Bath");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
	
	private int try_catch(){
		int menu = -1;
		try {
			menu = scan.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		scan.nextLine();
		return menu;
	}
	
	private void newPet() {
		Pet Anjing = new Anjing();
		Pet Kucing = new Kucing();
		pets.add(Anjing);
		pets.add(Kucing);
	}
	
	private void play() {
		String choosePet;
		int idx = 1;
		do {
			System.out.print("Choose pet name [Anjing | Kucing] (Case Sensitive): ");
			choosePet = scan.nextLine();
		} while (!choosePet.equals("Anjing") && !choosePet.equals("Kucing"));
		if(choosePet.equals("Anjing")) {
			idx = 0;
		}
		int happiness = pets.get(idx).getHappiness();
		int health = pets.get(idx).getHealth();
		int clean = pets.get(idx).getCleanness();
		if(idx == 0) {
			happiness += 3;
			health -= 1;
			clean -= 1;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
		else {
			happiness += 3;
			health -= 1;
			clean -= 1;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
	}
	
	private void eat() {
		String choosePet;
		int idx = 1;
		do {
			System.out.print("Choose pet name [Anjing | Kucing] (Case Sensitive): ");
			choosePet = scan.nextLine();
		} while (!choosePet.equals("Anjing") && !choosePet.equals("Kucing"));
		if(choosePet.equals("Anjing")) {
			idx = 0;
		}
		int happiness = pets.get(idx).getHappiness();
		int health = pets.get(idx).getHealth();
		int clean = pets.get(idx).getCleanness();
		if(idx == 0) {
			happiness -= 1;
			health += 3;
			clean -= 1;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
		else {
			happiness -= 1;
			health += 3;
			clean -= 1;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
	}
	
	private void bath() {
		String choosePet;
		int idx = 1;
		do {
			System.out.print("Choose pet name [Anjing | Kucing] (Case Sensitive): ");
			choosePet = scan.nextLine();
		} while (!choosePet.equals("Anjing") && !choosePet.equals("Kucing"));
		if(choosePet.equals("Anjing")) {
			idx = 0;
		}
		int happiness = pets.get(idx).getHappiness();
		int health = pets.get(idx).getHealth();
		int clean = pets.get(idx).getCleanness();
		if(idx == 0) {
			happiness -= 1;
			health -= 1;
			clean += 3;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
		else {
			happiness -= 1;
			health -= 1;
			clean += 3;
			pets.get(idx).setHappiness(happiness);
			pets.get(idx).setHealth(health);
			pets.get(idx).setCleanness(clean);
		}
	}
	
}
