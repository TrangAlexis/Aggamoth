package Aggamoth.rooms;

import java.util.Arrays;

public class Gouffre5 extends Room {

	public Gouffre5() {
		super("Gouffre 5",
				Arrays.asList("Gouffre sortie",null,null,null),
				Arrays.asList(),
				"Vous atterrissez sur la dernière plateforme lourdement. Vos talons claquent sur la pierre, et vous manquez de perdre votre équilibre "
				+ "à cause de l'instabilité de la plateforme volante. En face de vous, à seulemnt quelques centimètres, vous pouvez sentir le craquellement "
				+ "d'un champ de force. En dessous de vous, le gouffre s'illumine d'une lumière verte et s'emplit du son d'un orage. L'électricité qui en "
				+ "remonte menace de vous transformer en un tas de cendre.\n"
				+ "À ce mooment là, le champ de force en face de vous cède brusquement. Le passage est libre.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
