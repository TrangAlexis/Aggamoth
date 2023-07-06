package Aggamoth.rooms;

import java.util.Arrays;
import java.util.Objects;

public class Tour3 extends Room {

	public Tour3() {
		super("Tour 3",
				Arrays.asList("Tour 1","Tour 2","Tour 6","Tour 2"),
				Arrays.asList(),
				"Vous arrivez dans une salle circulaire. Au milieu, un grand escalier en colimaçon vous permet de monter et descendre. "
				+ "Vous pouvez aussi voir 2 portes, l'une à l'Ouest et une à l'Est.\n"
				+ "Entre chacune de ces portes se trouvent de petites fenêtres à hauteur d'yeux. Vous vous trouvez au troisième étage.",
				"éteintes",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
