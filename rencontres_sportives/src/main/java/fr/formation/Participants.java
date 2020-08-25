package fr.formation;

public abstract class Participants {
	
	private String name;
	
	public Participants(String name) {
		if (name == null) {
			throw new NullPointerException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	 public abstract void play1();
	 
	 
	 public abstract void play2();
	

}
