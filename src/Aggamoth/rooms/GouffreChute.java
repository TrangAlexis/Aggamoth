package Aggamoth.rooms;

import java.util.Arrays;

public class GouffreChute extends Room {

	public GouffreChute() {
		super("Gouffre chute",
				Arrays.asList(null,null,null,null),
				Arrays.asList(),
				"Vous atterrissez sur la plateforme. Celle-ci cède sous votre poids, mais ne remonte pas cette fois-ci. "
						+ "Vous tombez das l'abyme, et les flammes et la foudre vous consumment alors que vous perdez connaissance.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
