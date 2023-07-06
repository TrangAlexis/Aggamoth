package Aggamoth.rooms;

import java.util.Arrays;
import java.util.List;

import Aggamoth.items.Item;

public class Explosion extends Room {

	public Explosion() {
		super("Explosion",
				Arrays.asList(null,null,null,null),
				Arrays.asList(),
				"En un instant, l'intérieur de la tour s'emplit de flames, et une déflagration vous propulse hors de la tour par la porte d'où vous veniez. "
				+ "Vous pouvez sentir que vos sens vous abandonnent alors que vous chutez dans le gouffre, mais dans vos derniers instants de conscience, vous "
				+ "pouvez voir la ruine que vous avez causé à la tour du magicien. Des blocs de pierre volent dans tout les sens, accompagnés de poutres en "
				+ "feux.\n "
				+ "Vous avez battut Aggamoth. Bien joué.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
	
	
}
