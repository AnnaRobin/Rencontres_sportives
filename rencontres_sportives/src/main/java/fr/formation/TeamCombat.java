package fr.formation;

public class TeamCombat extends Match  {
	
public int halfTimeScore = (0 + (int)(Math.random() * (3 - 0) + 1));
	
public int finalScore;

public void play1() {
	
	System.out.println(halfTimeScore);
}

public int score() {
if (halfTimeScore == 0) {
	finalScore = (halfTimeScore + (int)(Math.random() * (3 - 0) + 1));
} else if (halfTimeScore == 1) {
	finalScore = (1 + (int)(Math.random() * (2 - 0) + 1));
} else if (halfTimeScore == 2) {
	finalScore = (2 + (int)(Math.random() * (0 - 0) + 1));
} else {
	finalScore = 3;
}
return finalScore;
}

public void play2() {
	
	System.out.println(score());
}

}
