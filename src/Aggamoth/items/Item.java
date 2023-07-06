package Aggamoth.items;

public class Item {
	private String name;
	private String descriptionInOriginalRoom;
	private String descriptionInInventory;
	private Boolean inInventory;
	
	public Item() {
		
	}



	public Item(String name, String descriptionInOriginalRoom, String descriptionInInventory, Boolean inInventory) {
		super();
		this.name = name;
		this.descriptionInOriginalRoom = descriptionInOriginalRoom;
		this.descriptionInInventory = descriptionInInventory;
		this.inInventory = inInventory;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptionInOriginalRoom() {
		return descriptionInOriginalRoom;
	}

	public void setDescriptionInOriginalRoom(String descriptionInOriginalRoom) {
		this.descriptionInOriginalRoom = descriptionInOriginalRoom;
	}

	public String getDescriptionInInventory() {
		return descriptionInInventory;
	}

	public void setDescriptionInInventory(String descriptionInInventory) {
		this.descriptionInInventory = descriptionInInventory;
	}
	
	public static Item getHabits() {
		Item habits = new Item(
				"habits",
				"",
				"Des habits ce qu'il y a de plus normaux. Ils ont l'air d'avoir subit quelques dommages. Comme si vous sortiez d'une lutte acharnée."
				+ "Mais vous ne vous souvenez pas de vous être battus...",
				false);
		return habits;
	}
	
	public static Item getCarte() {
		Item carte = new Item(
				"carte",
				"",
				"Une carte qui semble donner d'étranges directions:"
				+ "N      N  N    "
				+ "↑  →Z  →  ↑  ↑Z",
				false);
		return carte;
	}
	
	public static Item getAmuletteDeLAmitie() {
		Item amuletteDeLAmitie = new Item(
				"amulette de l'amitié",
				"Fermement attaché à la ceinture en cuir du cavalier, vous apercevez une gemme rouge de la taille d’un poing fermé. La pierre est taillée "
				+ "en forme de prisme, et semble avoir une grande valeur. Elle est sertie dans un magnifique cadre argenté qui comporte d’étranges inscriptions, "
				+ "et est attaché au bout d’une chaîne."
				+ "\nLa gemme est étonnamment brillante pour un age de ténèbre comme le nôtre. Elle semble presque émettre sa propre lumière.",
				"Une grosse gemme rouge dans un cadre en argent qui pend au bout d'un chaine. Elle semble contenir une magie qui pourrait purifier les cœurs les plus sombres.",
				false);
		return amuletteDeLAmitie;
	}
	
	public static Item getArmureDeSacquaje() {
		Item armureDeSacquaje = new Item(
				"armure",
				"L’armure du cavalier est encore en très bon état malgré la grosse cabosse sur son heaume. En l’observant de près, on dirait presque qu’elle à été "
				+ "forgée spécifiquement pour son détenteur. C’est indubitablement l’une des meilleures armures que vous n'ayez jamais vue. Elle semble tout de même "
				+ "avoir vécu bon nombre de batailles."
				+ "\nElle aurait probablement été très utile, mais malheureusement vous n'avez pas les épaules pour la porter..."
				+ "\nA l’intérieur du heaume, et au niveau de la nuque sur l’armure, vous pouvez lire sur une bande de cuir: Chevalier Sacquaje.",
				"L’armure du chevalier Sacquaje, il était en route pour sauver le monde, mais maintenant c’est votre boulot.",
				false);
		return armureDeSacquaje;
	}
	
	public static Item getBouclierDeSacquaje() {
		Item armureDeSacquaje = new Item(
				"bouclier",
				"C'est le bouclier que portait le chevalier avant de tomber. Sa face est endomagée par de nombreux cratères peu profonds, mais on peut encore "
				+ "voir le blason avec lequel il fût bénit: un fond bleu au dessus duquel est déssiné le buste d'un dragon de platine."
				+ "\nL'arrière du bouclier est tapissé de fourrure douillette."
				+ "\nIl y a aussi deux sangles de cuire ajustables qui sortent de ce côté du bouclier.",
				"Le bouclier du cehvalier Sacquaje. Il vous protègera des coups de vos ennemis, et sa fourrure est si chaude et douillette...",
				false);
		return armureDeSacquaje;
	}
	
}
