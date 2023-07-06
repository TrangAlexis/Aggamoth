package Aggamoth.rooms;

import java.util.Arrays;
import java.util.Objects;

public class Tour6 extends Room {

	public Tour6() {
		super("Tour 6",
				Arrays.asList("Tour1","Tour 5","Tour 1","Tour 1"),
				Arrays.asList(),
				"Vous arrivez dans une salle circulaire. Au milieu, un grand escalier en colimaçon vous permet descendre. Mais l'escalier s'arrête de monter "
				+ "ici. Le plafond est plein, et ne vous permet pas de monter plus haut."
				+ "Vous pouvez aussi voir 2 portes, l'une à l'Ouest et une à l'Est.\n"
				+ "Entre chacune de ces portes se trouvent de petites fenêtres à hauteur d'yeux. Vous vous trouvez au sixième étage.",
				"éteintes",
				"src/Aggamoth/resources/miniOst.wav");
	}
	
}
