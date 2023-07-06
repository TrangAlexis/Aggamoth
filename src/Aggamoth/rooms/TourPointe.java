package Aggamoth.rooms;

import java.util.Arrays;

public class TourPointe extends Room {

	public TourPointe() {
		super("Tour 2",
				Arrays.asList(null,"Tour 5","Tour 1","Tour 1"),
				Arrays.asList(),
				"Vous arrivez dans une salle circulaire. Au milieu, un grand escalier en colimaçon vous permet de monter et descendre. "
				+ "Vous pouvez aussi voir 4 portes. Chaque sortie se trouve aux quatres points cardinaux de la salle.\n"
				+ "Entre chacune de ces portes se trouvent de petites fenêtres à hauteur d'yeux. Vous vous trouvez au second étage.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
