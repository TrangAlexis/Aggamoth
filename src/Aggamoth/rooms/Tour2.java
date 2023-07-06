package Aggamoth.rooms;

import java.util.Arrays;
import java.util.Objects;

public class Tour2 extends Room {
	private boolean lumieresAllumees = false;

	public Tour2() {
		super("Tour 2",
				Arrays.asList("Tour 1","Tour 1","Tour 3","Tour 4"),
				Arrays.asList(),
				"Vous arrivez dans une salle circulaire. Au milieu, un grand escalier en colimaçon vous permet de monter et descendre. "
				+ "Vous pouvez aussi voir 2 portes, l'une à l'Ouest et une à l'Est.\n"
				+ "Entre chacune de ces portes se trouvent de petites fenêtres à hauteur d'yeux. Vous vous trouvez au second étage.",
				"éteintes",
				"src/Aggamoth/resources/miniOst.wav");
	}


	
}
