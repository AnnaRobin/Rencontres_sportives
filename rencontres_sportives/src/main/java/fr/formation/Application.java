package fr.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.domain.CombatSingle;
import fr.formation.domain.Referee;
import fr.formation.domain.Team;
import fr.formation.domain.Participant;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
				
		
		
		
		
		
		
		
		////////
		Participant toto = new Participant ("Toto");
		Participant titi = new Participant ("Titi");
		Participant tutu = new Participant ("Tutu");
		Participant tata = new Participant ("Tata");
		
		Participant[] partic1 = {new Participant("Toto"),new Participant("Titi")};
		Participant[] partic2 = {new Participant("Tutu"),new Participant("Tata")};
		Participant[] partic3 = {new Participant("Toto"),new Participant("Tutu"),new Participant("Tata")};
		Participant[] partic4 = {new Participant("Tutu"),new Participant("Titi"), new Participant("Tata")};
				
		Team red = new Team ("Red", partic1) ;
		Team blue = new Team ("Blue", partic2);
		Team white = new Team ("White", partic3);
		Team black = new Team ("Black", partic4);
		
		Referee referee = new Referee("Frank");
		
		CombatSingle match1 = new CombatSingle ();
		
		match1.play1();
		match1.play2();
	}

}
