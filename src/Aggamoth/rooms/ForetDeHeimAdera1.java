package Aggamoth.rooms;

import java.util.Arrays;

public class ForetDeHeimAdera1 extends Room {

	public ForetDeHeimAdera1() {
		super("Forêt de Heim Adera 1",
				Arrays.asList("Orée de la forêt","Orée de la forêt","Orée de la forêt","Forêt de Heim Adera 2"),
				Arrays.asList(),
				"Tout autour de vous se dressent des troncs desséchés. La forêt de Heim Adera est morte depuis bien longtemps, mais malgré que ses branches soient dégarnies, "
						+ "la lumière du soleil parvient quand même à vous atteindre. Il devrait être à la moitié de sa course vers l'horizon maintenant. "
						+ "Le sol est jonché de feuilles à moitié décomposées. Marcher dessus ne donne pas un “cronch” "
						+ "satisfaisant mais laisse échapper un léger son mou.\n"
						+ "\nVous ne percevez ni n’entendez de son d’animaux sauvages, cependant, à intervalle régulier, il vous \n"
						+ "semble percevoir quelques feuilles virevolter.",
				"",
				"src/Aggamoth/resources/miniOst.wav");
	}
}
