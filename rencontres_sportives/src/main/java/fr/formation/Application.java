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
		
		Athlete[] ath = {new Athlete("Toto"),new Athlete("Titi")};
		Athlete[] ath2 = {new Athlete("Tutu"),new Athlete("Tata")};
		Athlete[] ath3 = {new Athlete("Toto"),new Athlete("Tutu"),new Athlete("Tata")};
		Athlete[] ath4 = {new Athlete("Tutu"),new Athlete("Titi"), new Athlete("Tata")};
				
		Team red = new Team ("Red", ath) ;
		Team blue = new Team ("Blue", ath2);
		Team white = new Team ("White", ath3);
		Team black = new Team ("Black", ath4);
		
		Referee referee = new Referee("Frank");
		
		FaceToFace match1 = new FaceToFace ();
		
		match1.play1();
		match1.play2();
	}

}
