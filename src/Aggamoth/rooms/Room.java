package Aggamoth.rooms;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import Aggamoth.items.Item;

public class Room {
	private String name;
	private List<String> roomsConnected;
	private List<Item> itemsInRoom;
	private String description1;
	private String description2;
	private String inspection;
	private String pathMusicOfTheRoom;
	
	public Room() {
		
	}

	public Room(String name, List<String> roomsConnected, List<Item> itemsInRoom, String description1,
			String inspection, String pathMusicOfTheRoom) {
		super();
		this.name = name;
		this.roomsConnected = roomsConnected;
		this.itemsInRoom = itemsInRoom;
		this.description1 = description1;
		this.inspection = inspection;
		this.pathMusicOfTheRoom = pathMusicOfTheRoom;
	}

	public Room(String name, List<String> roomsConnected, List<Item> itemsInRoom, String description1,
			String description2, String inspection, String pathMusicOfTheRoom) {
		super();
		this.name = name;
		this.roomsConnected = roomsConnected;
		this.itemsInRoom = itemsInRoom;
		this.description1 = description1;
		this.description2 = description2;
		this.inspection = inspection;
		this.pathMusicOfTheRoom = pathMusicOfTheRoom;
	}




	public String getPathMusicOfTheRoom() {
		return pathMusicOfTheRoom;
	}

	public void setPathMusicOfTheRoom(String pathMusicOfTheRoom) {
		this.pathMusicOfTheRoom = pathMusicOfTheRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoomsConnected() {
		return roomsConnected;
	}

	public void setRoomsConnected(List<String> roomsConnected) {
		this.roomsConnected = roomsConnected;
	}

	public List<Item> getItemsInRoom() {
		return itemsInRoom;
	}

	public void setItemsInRoom(List<Item> itemsInRoom) {
		this.itemsInRoom = itemsInRoom;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description) {
		this.description1 = description;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(name, other.name);
	}
	
	public static Room getRoomFromName(String roomName) {
		for (Room r:Room.getAllRooms()) {
			if (roomName.equals(r.getName())) {
				return r;
			}
		}
		return null;
	}
	
	public static List<Room> getAllRooms(){
		List<Room> lAllRooms = Arrays.asList(
				new OreeDeLaForet(),
				new ForetDeHeimAdera1(),
				new ForetDeHeimAdera2(),
				new ForetDeHeimAdera3(),
				new ForetDeHeimAdera4(),
				new ChaumiereFlarinon(), 
				new GouffreEntree(),
				new Gouffre1(),
				new Gouffre2(),
				new Gouffre3(),
				new Gouffre4(),
				new Gouffre5(),
				new GouffreSortie(),
				new GouffreChute(),
				new TourRdc(),
				new TourPointe(),
				new Tour1(),
				new Tour2(),
				new Tour3(),
				new Tour4(),
				new Tour5(),
				new Tour6(),
				new Explosion());
		return lAllRooms;
	}
	
	
}


























