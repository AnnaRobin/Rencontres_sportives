package fr.formation;

public class Referee {

	private String name;
	
	public Referee(String name) {
		if (name == null) {
			throw new NullPointerException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	};
	
	public static String whistle() {
		return ("pfuuu");
	}
	
}
