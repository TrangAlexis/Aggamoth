package Aggamoth.rooms;

import java.util.Arrays;

public class Gouffre2 extends Room {

	public Gouffre2() {
		super("Gouffre 2",
				Arrays.asList(null,null,null,null,"Gouffre 5"),
				Arrays.asList(),
				"Vous atterrissez lourdement sur la seconde plateforme. La pierre sous vos pieds s'ébranle violemment, avant que vous ne réussissiez à "
						+ "trouver votre équilibre. Vous vous trouvez de retour presque à la case départ, mais toujours vivant.\n"
						+ "La lumière verte provenant d'en dessous de vous se fait plus intense, et le son du tonnerre l'accompagne.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
