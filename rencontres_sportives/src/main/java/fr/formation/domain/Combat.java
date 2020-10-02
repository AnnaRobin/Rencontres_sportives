package fr.formation.domain;

import java.util.List;

public abstract class Combat {

	public static void play(List<Participant> players) {
		for (Participant player : players) {
			// player.play();
		}
	}

	public abstract void play1();

	public abstract void play2();

}
