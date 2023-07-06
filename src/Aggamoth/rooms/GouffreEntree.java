package Aggamoth.rooms;

import java.util.Arrays;

public class GouffreEntree extends Room {

	public GouffreEntree() {
		super("Gouffre entrée",
				Arrays.asList("Gouffre 1",null,null,null),
				Arrays.asList(),
				"Vous émergez dans une clairière. Le ciel maintenant ouvert, les ténèbres sont légèrement moins opressants. "
						+ "Vers l'Ouest, vous pouvez appercevoir la couleur violette du ciel s'effacer et donner place aux vide noir constellé d'étoiles. "
						+ "Devant vous, un gouffre béant donne sur une tour massive. Ses murs sont faits d’une pierre pâle et rugueuse.\n "
						+ "Le bâtiment est fait d'une singulière flêche cylindrique qui s’élancent vers le ciel, et pointe directement vers d’épais nuages noirs. "
						+ "Depuis la dernière fenêtre tout en haut, on peut apercevoir une faible lumière verte s'échapper. La tour est entièrement "
						+ "bâtie sur une roche massive qui flotte dans les airs au milieu du gouffre gigantesque.\n "
						+ "Le seul passage possible semble être une série de cinq plateformes rectangulaires en suspension au dessus du vide. "
						+ "Ces cinq morceaux de roches rectangulaires ont l'air anormalement lisses, chacun est épais de seulement quelques centimètres, et fait "
						+ "la taille d'une marche d'escalier. Ils ne sont retenus par aucune sorte de cordage, à la place, "
						+ "chaque plateforme semble flotter indépendamment au dessus du vide.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
