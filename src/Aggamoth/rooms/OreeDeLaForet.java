package Aggamoth.rooms;

import java.util.Arrays;

import Aggamoth.items.Item;

public class OreeDeLaForet extends Room {

	public OreeDeLaForet() {
		super("Orée de la forêt",
				Arrays.asList("Forêt de Heim Adera 1","Orée de la forêt","Orée de la forêt","Orée de la forêt"),
				Arrays.asList(Item.getAmuletteDeLAmitie(), Item.getArmureDeSacquaje(), Item.getBouclierDeSacquaje()),
				"Vous vous trouvez à l'orée de la forêt de Heim Adera. Le corps du cavalier gît à vos pieds. Sa nuque est anormalement tordue, et aucun souffle ne "
						+ "semble provenir de sous son heaume."
						+ "\nAutour de la forêt s'étend une vaste plaine sableuse. A travers la tempête de poussière rouge, vous pouvez tout de même deviner "
						+ "la forme du Soleil placé à son zénith. ",
				"Depuis le nord, des pluies de sable et de poussière proviennent du désert Draï, depuis l’Est vous pouvez \n"
				+ "sentir une faible brise métallique qui provient de la mer.\n"
				+ "A l’Ouest se dresse la chaîne de montagne nommée Amedobus, vous avez lue quelque part qu’il s’agissait d’une gigantesque mine naine.",
				
				"Vous vous retrouvez une nouvelle fois à l'orée de la forêt. Le corps du chevalier ne semble pas avoir bougé,\n"
				+ "mais son odeur vous indique qu'il n'est plus aussi frais que quand vous êtes parti...",
				"src/Aggamoth/resources/miniOst.wav");
	}

}
