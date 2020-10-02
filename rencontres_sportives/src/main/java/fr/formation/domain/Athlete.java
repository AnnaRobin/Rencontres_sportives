package fr.formation.domain;

public abstract class Athlete {

	private String name;

	public Athlete(String name) {
		if (name == null) {
			throw new NullPointerException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
