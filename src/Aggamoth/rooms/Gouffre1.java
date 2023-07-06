package Aggamoth.rooms;

import java.util.Arrays;

public class Gouffre1 extends Room {

	public Gouffre1() {
		super("Gouffre 1",
				Arrays.asList(null,null,null,null,"Gouffre 3"),
				Arrays.asList(),
				"Vous avancez sur la première plateforme. Lorsque vos deux pieds se trouvent dessus, elle cède légèrement sous votre poid, "
						+ "puis remonte au niveau du sol avant de se rapprocher des autres platteformes. L'écart entre la marche sur laquelle "
						+ "vous vous trouvez et la terre ferme est maintenant infranchissable.\n"
						+ "En dessous de vous s'étend un abyme noire. À cette hauteur, la chute serait fatale. Il vous semble percevoir un "
						+ "léger éclat de lumière verte au plus profond du gouffre.\n"
						+ "Devant vous se trouvent quatre autres plateformes semblables à celle sur laquelle vous vous trouvez. Au-delà se trouve la terre "
						+ "ferme, où plus tôt l'île flottante sur laquelle se trouve la tour du sorcier. "
						+ "Une étrange vibration semble provenir de l'air autour de la structure.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
