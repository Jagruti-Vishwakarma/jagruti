
public class Player {
	 
	//instance variables
	String name;
	int age;
	String game;
	
	//Constructor
	Player(String name, int age, String game){
		this.name = name;
		this.age = age;
		this.game = game;
	}
	
	//Method to display players details
	void display() {
		System.out.println("Player Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Game:" + game);

	}
	//Main method
	public static void main(String[] args) {
		// Creating objects using constructor
		Player p1 = new Player("M.S.Dhoni", 40, "Cricket");
		Player p2 = new Player("Ronaldo", 36, "Footbal");
		
		//Caling method
		p1.display();
		p2.display();
	}

}
