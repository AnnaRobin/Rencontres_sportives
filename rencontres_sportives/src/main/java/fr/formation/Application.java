package fr.formation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		Athlete toto = new Athlete ("Toto");
		Athlete titi = new Athlete ("Titi");
		Athlete tutu = new Athlete ("Tutu");
		Athlete tata = new Athlete ("Tata");
		
		
		
				
		Team red = new Team ("Red");
		Team blue = new Team ("Blue");
		Team white = new Team ("White");
		Team black = new Team ("Black");
		
		
	}

}
