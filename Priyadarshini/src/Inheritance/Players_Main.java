package Inheritance;

public class Players_Main {
	public static void main(String[] args) {
		
		Football obj = new Football();
		System.out.println("Player name is:" + obj.getName("xyz"));
		System.out.println("Age is:" + obj.getAge(30));
		System.out.println("Best score is:" + obj.getBest_score(20));
		System.out.println("Goal is:" + obj.getGoal(100));
	}
	
}
