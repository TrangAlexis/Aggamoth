package Aggamoth.adventurer;

import java.util.Arrays;
import java.util.List;

import Aggamoth.items.Item;
import Aggamoth.rooms.Room;

public class AdventurerStatus {

	private static Room position;
	private static List<Item> Inventaire = Arrays.asList(Item.getHabits());

	public static Room getPosition() {
		return position;
	}

	public static void setPosition(Room position) {
		AdventurerStatus.position = position;
	}

	public static List<Item> getInventaire() {
		return Inventaire;
	}

	public static void setInventaire(List<Item> inventaire) {
		Inventaire = inventaire;
	}

	public static void moveToRoom(String direction) {
//		System.out.println("****");
//		System.out.println(direction);
		for (Room r : Room.getAllRooms()) {
//			System.out.println(r.getName());
			if (r.getName().equals(direction)) {
				AdventurerStatus.setPosition(r);
			}
		}
//		System.out.println("***");
	}
	

}
