package Aggamoth.rooms;

import java.util.Arrays;
import java.util.Objects;

public class Tour4 extends Room {

	public Tour4() {
		super("Tour 4",
				Arrays.asList("Tour 2","Tour 5","Tour 1","Tour 3"),
				Arrays.asList(),
				"Vous arrivez dans une salle circulaire. Au milieu, un grand escalier en colimaçon vous permet de monter et descendre. "
				+ "Vous pouvez aussi voir 2 portes, l'une à l'Ouest et une à l'Est.\n"
				+ "Entre chacune de ces portes se trouvent de petites fenêtres à hauteur d'yeux. Vous vous trouvez au quatrième étage.",
				"éteintes",
				"src/Aggamoth/resources/miniOst.wav");
	}
	
	
}
