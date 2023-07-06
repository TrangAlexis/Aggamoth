package Aggamoth.rooms;

import java.util.Arrays;

public class GouffreSortie extends Room {

	public GouffreSortie() {
		super("Gouffre sortie",
				Arrays.asList("Tour Rdc",null,null,null),
				Arrays.asList(),
				"Vous arrivez de l'autre côté du gouffre. Une colonne de flammes vertes et d'énergie érupte derrière vous, mais vous êtes en sécurité.\n "
				+ "La porte de la tour se dresse devant vous, faite d'un bois sombre, couverte de bas relièfs dorés, et légèrement entreouverte.\n "
				+ "Dans son embrasure vous pouvez entrevoir un intérieur fait de pierres taillées, et de l'autre côté de la salle d'entrée, "
				+ "vous appercevez une porte qui semble mener vers une autre salle. De l'extérieur vous avez pourtant la conviction qu'il n'y a pas la place"
				+ " pour une seconde salle au rez-de-chaussée.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
