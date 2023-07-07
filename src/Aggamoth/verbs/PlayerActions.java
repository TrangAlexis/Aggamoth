package Aggamoth.verbs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import Aggamoth.adventurer.AdventurerStatus;
import Aggamoth.items.Item;

public class PlayerActions {
	private static List<String> movements = Arrays.asList("marcher", "courir", "aller", "avancer", "trotter", "rouler", "galoper", "sortir", "reculer","sauter");
	private static List<String> investigate = Arrays.asList("regarder", "observer", "examiner");
	private static List<String> take = Arrays.asList("prendre", "récupérer", "mettre dans ma poche", "embarquer");
	private static List<String> hit = Arrays.asList("frapper", "attaquer", "assomer");
	private static List<String> consumme = Arrays.asList("manger", "dévorer", "boire", "avaler");
	
	private static List<String> directions = Arrays.asList("nord","ouest","sud","est","plateforme");
	
	
	public static HashMap<String,String> comprehension(String sentence) {
		String sentenceLower = sentence.toLowerCase();
		HashMap<String,String> MResult = new HashMap<>();
		String actionVerb = "";
		String directionMovement = "";
		String objectUsed = "";
		String objectOfAction = "";
		
		for (String verb:movements) {
			if (sentenceLower.contains(verb)) {
				actionVerb = "deplacer";
				for (String direction:directions) {
					if (sentenceLower.contains(direction)) {
						directionMovement = direction;
						break;
					}
				}
				break;
			}
		}
		
		for (String verb:investigate) {
			if (sentenceLower.contains(verb)) {
				actionVerb = "examiner";
				break;
			}
		}
		
		for (String verb:take) {
			if (sentenceLower.contains(verb)) {
				actionVerb="prendre";
				for (Item i:AdventurerStatus.getPosition().getItemsInRoom()) {
					String nameItemLowerCase=i.getName().toLowerCase();
					if (sentenceLower.contains(nameItemLowerCase)) {
						objectOfAction=nameItemLowerCase;
					}
				}
				break;
			}
		}
		MResult.put("actionVerb", actionVerb);
		MResult.put("directionMovement", directionMovement);
		MResult.put("objectUsed", objectUsed);
		MResult.put("objectOfAction", objectOfAction);
		
//		System.out.println("actionVerb: "+actionVerb+" directionMovement: "+directionMovement+" ObjectUsed: "+objectUsed+" objectOfAction: "+objectOfAction);
		return MResult;
	}
}
