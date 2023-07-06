package Aggamoth.rooms;

import java.util.Arrays;
import java.util.List;

import Aggamoth.items.Item;

public class EcranDeFin extends Room {

	public EcranDeFin() {
		super("Tour Rdc",
				Arrays.asList(null,null,null,null,"Ecran de fin"),
				Arrays.asList(),
				"Vous pénétrez dans la tour. La salle d'entrée est éclairée par de petites bougies qui ne dégagent aucune chaleur. L'intérieur de la salle "
				+ "est parfaitement circulaire. Il ne semble y avoir aucune fenêtre, et au centre de la salle se trouve un vieillard."
				+ "Il vous demande:\n "
				+ "'Is this the Police?'",
				"Vous pénétrez dans la tour. La salle d'entrée est éclairée par de petites bougies qui ne dégagent aucune chaleur. L'intérieur de la salle \"\r\n"
				+ "				+ \"est parfaitement circulaire. Il ne semble y avoir aucune fenêtre, et la seule autre issue se trouve en face de vous. Une porte mène vers une \"\r\n"
				+ "				+ \"autre salle qui semble en tout point identique à celle dans laquelle vous vous trouvez présentement. La seule différence étant un grand \"\r\n"
				+ "				+ \"escalier en colimaçon qui monte vers un étage supérieur, et descend vers un sous-sol. La géométrie de la tour vous semble de plus \"\r\n"
				+ "				+ \"en plus étrange.",
				"src/Aggamoth/resources/miniOst.wav");
	}
	
	
}
