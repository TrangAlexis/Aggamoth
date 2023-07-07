package Aggamoth.displays;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Aggamoth.adventurer.AdventurerStatus;
import Aggamoth.items.Item;
import Aggamoth.rooms.OreeDeLaForet;
import Aggamoth.rooms.Room;
import Aggamoth.rooms.TourRdc;
import Aggamoth.verbs.PlayerActions;

public class Engin extends JFrame {
	private static Boolean nextText = false;
	Boolean gameFinished = false;
	JFrame window;
	Container con;
	
	// First panel of text
	private static JPanel textPanel;
	private static JTextArea textArea;
	
	// Second panel of text
	private static JPanel secondaryTextPanel;
	private static JTextArea secondaryTextArea;

	// Fonts
	Font normaleFont = new Font("Monospaced", Font.PLAIN, 35), 
			smallFont = new Font("Monospaced", Font.PLAIN, 15), 
			verySmallFont = new Font("Monospaced", Font.PLAIN, 3);

	// Input panel
	JPanel inputPanel;
	JTextField inputBox;
	
	// Image Panel
	JPanel imagePanel;
	private static JTextArea imageTextArea;
	
	ActionsHandler actionsHandler = new ActionsHandler();
	
	// Infos of the input
	private static HashMap<String, String> resInput;

	public Engin() throws InterruptedException {
		//  -------------------INITIALISATION HERE-----------------------
		// Window
		window = new JFrame();
		window.setSize(900, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();

		// Panel text
		textPanel = new JPanel();
		textPanel.setBounds(50, 50, 700, 450);
		textPanel.setBackground(Color.black);
		con.add(textPanel);

		// Text itself
		textArea = new JTextArea();
		textArea.setBounds(50, 50, 700, 450);
		textArea.setBackground(Color.black);
		textArea.setForeground(Color.white);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textPanel.add(textArea);
		textArea.setFont(normaleFont);

		// Secondary Panel text
		secondaryTextPanel = new JPanel();
		secondaryTextPanel.setBounds(50,575,700,200);
		secondaryTextPanel.setBackground(Color.black);
		secondaryTextPanel.setVisible(false);
		con.add(secondaryTextPanel);
		
		// Secondary Text
		secondaryTextArea = new JTextArea();
		secondaryTextArea.setBounds(50,575,700,200);
		secondaryTextArea.setBackground(Color.black);
		secondaryTextArea.setForeground(Color.white);
		secondaryTextArea.setLineWrap(true);
		secondaryTextPanel.add(secondaryTextArea);
		secondaryTextArea.setFont(smallFont);
		
		// Image Panel
		imagePanel = new JPanel();
		imagePanel.setBounds(50, 150, 700, 400);
		imagePanel.setBackground(Color.black);
		con.add(imagePanel);
		
		// Image Text
		imageTextArea = new JTextArea();
		imageTextArea.setBounds(50, 150, 700, 400);
		imageTextArea.setBackground(Color.black);
		imageTextArea.setForeground(Color.white);
		imageTextArea.setLineWrap(true);
		imagePanel.add(imageTextArea);
		imageTextArea.setFont(verySmallFont);

		// Panel input
		inputPanel = new JPanel();
		inputPanel.setBounds(60, 500, 680, 50);
		inputPanel.setBackground(Color.black);
		inputPanel.setForeground(Color.white);
		con.add(inputPanel);

		// Box input
		inputBox = new JTextField();
		inputBox.setPreferredSize(new Dimension(680, 45));
		inputBox.setBounds(60, 500, 680, 50);
		inputBox.setBackground(Color.black);
		inputBox.setForeground(Color.white);
		inputBox.setVisible(true);
		inputBox.addActionListener(actionsHandler);
		inputPanel.add(inputBox);
		
		// -------------------INITIALISATION HERE-----------------------
		
		
		// INTRO STARTS HERE
		
		textArea.setText("Aggamoth");
//		imageTextArea.setText("                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                                                                                                                      \r\n"
//				+ "                                            -                                                                                         \r\n"
//				+ "                                           .*-                                                                                        \r\n"
//				+ "                                           .*-                                                                                        \r\n"
//				+ "                                           .*-                                                                                        \r\n"
//				+ "                                           .*-                                                                                        \r\n"
//				+ "                                           .*-                                                                                        \r\n"
//				+ "                                           ***-                                                                                       \r\n"
//				+ "                                          **-**-                                                                                      \r\n"
//				+ "                                         **-  **-                                                                                     \r\n"
//				+ "                                        **-    **-                                                                                    \r\n"
//				+ "                                       **-      **-                                                                                   \r\n"
//				+ "                                      **-        **-                                                                                  \r\n"
//				+ "                                     **-          **-                                                                                 \r\n"
//				+ "                                    **- .+***.     **-                                                                                \r\n"
//				+ "                                   **- -**--**+     **.                                                                               \r\n"
//				+ "                                  **-  **.   **.     **.                                                                              \r\n"
//				+ "                                 **-   +**.  **.      **.                                                                             \r\n"
//				+ "                                +*+     -*****-        **.                                                                            \r\n"
//				+ "                               **+                      **.                                                                           \r\n"
//				+ "                              +*+.                    .+.**.                                                                          \r\n"
//				+ "                             +*+.**                   +*- +.                                                                          \r\n"
//				+ "                             .- .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*-                                                                             \r\n"
//				+ "                                .**                   +*--**-                                                                         \r\n"
//				+ "                        .+.     .**                   +******    .              **                                                    \r\n"
//				+ "                        ***     .**                   +*** ** .*********+.    .***-                                                   \r\n"
//				+ "                   --  +****++++***                   +**- +****. .+----***+ .**-**                                                   \r\n"
//				+ "                  +**+-** +********                   +**  .**           ++****. **-***                                               \r\n"
//				+ "                  ******   **.  .**                   +*-  .*+             .**-  ****+*+                                              \r\n"
//				+ "                 .**+**-   -*+  .**                   +*-  -*+              **   ***. **                                              \r\n"
//				+ "                 +*. **    .*+  .**           ...  -+***+..*****+          -*+   **.  +*-                                             \r\n"
//				+ "               +***. **    -*+  .**       +*********+--*****+--+**+***.+****+    **    **                                             \r\n"
//				+ "      .+***--.*****- **.   **.  .**      **-.  -*.      +.      -**--*-*+ -**   +****++**.                                            \r\n"
//				+ "     ***--*****+.********+.**+---**     .*                   .****.        *******-.-**+****-                                         \r\n"
//				+ "   .**.     .**  +***-..-***++********+.+*                  **+..             -**-       ..+**.                                       \r\n"
//				+ "+*****.     **.   **.    .**.    **+-+****-                .**                 .**          +*-                                       \r\n"
//				+ "*+-*-**+   .**    **   +******-         +***.  ....        +*.                  **.        ***.                                       \r\n"
//				+ "      **.  .**.   ******- .-+***+-    +*************-***.-.***. ..             +**          +*-                                       \r\n"
//				+ "      -*+-+******-***--       +*+***-**+     -+   ***+-**************. **-.   +***+   -++-.**+                                        \r\n"
//				+ "      +*****--.+****.             -***+          ***-       +*.+***+************ +******+***.                                         \r\n"
//				+ "     +*+       .***                 +**+        ***             .**  ---   ..                                                         \r\n"
//				+ "     **     ***  +*-   -             ****+---*****-    .       .***                                                                   \r\n"
//				+ "     +*-  -****. +**++**+  -+-   -.  +*++*****+  ********    ..-***                                                                   \r\n"
//				+ "      ***+** +*****+++-************-+**            ....+*********-                                                                    \r\n"
//				+ "       -+**. -*-.             ....***-                                                                                                \r\n"
//				+ "");
		

		TimeUnit.SECONDS.sleep(2);
		textArea.setBounds(50, 50, 700, 450);
		textArea.setFont(smallFont);
		imagePanel.setVisible(false);

		displayText(
				"Depuis maintenant un siècle, la menace du Dieu Sorcier pèse sur les terres de Carandis. Les plus grands royaumes se sont écroulés sous son joug, les forêts brûlent, "
						+ "les mers se brisent, et les déserts s'affaissent dans son sillage.");
		dotdotdot();
		displayText("Là où la magie noire du Sorcier se pose, le rire des enfants, et le tumulte des rivières se taisent "
						+ "à jamais.");
		dotdotdot();
		displayText(
				"Nombreux sont les vaillants chevaliers à avoir tenté de prendre la tour du magicien d’assaut. Mais rares sont ceux qui réussirent "
				+ "à franchir la forêt de l'oublie. Et encore plus rare sont ceux qui parvinrent à franchire le gouffre béant qui gardde la tour du Sorcier.");
		dotdotdot();
		displayText(
				"Par hasard ou par chance, il en reste un qui peut encore se dresser contre la tyrannie du Dieu Sorcier. La silhouette d’un cavalier solitaire se détache du ciel ambre. "
						+ "Il semble seul sur la surface calcinée de la terre.");
		dotdotdot();
		displayText(
				"Son armure a perdu son brillant il y a bien longtemps, mais face au sable et à la poussière qui tournent "
						+ "perpétuellement dans l’air, elle tinte d'un clair son de carillon.");
		dotdotdot();
		displayText("Alors que le cavalier s’approche de la forêt qui borde le domaine du sorcier, un léger "
						+ "scintillement rose éblouit vos yeux. Le soleil éclaire sa silouhette comme un augure d'espoir.");
		dotdotdot();
		displayText(
				"Le cavalier continue à s’approcher de vous. Le son des sabots de son destrier fait vibrer doucement votre cœur. Son galop sonne comme un tambour lors d’une parade. "
						+ "Lorsqu’il vous aperçoit à l’orée de la forêt, il perd sa concentration.");
		dotdotdot();
		displayText("Alors qu’il s’apprête à entrer dans la forêt à toute vitesse, il tourne la tête vers vous: "
						+ "'Mais c’est qui ce gars…' Une épaisse branche cingle son visage, il tombe en arrière de son cheval. Un lourd craquement se fait "
						+ "entendre au niveau de sa nuque.\n"
						+ "Son cheval disparait dans les ténèbres de la forêt.");
		dotdotdot();
		displayText("Vous n'avez aucune idée de l'endroit où vous vous trouvez. Ni de quelle heure il est. Ni même de qui vous êtes maintenant que vous y pensez. "
				+ "Un homme vient de mourir devant vous, et derrière vous se dresse une sombre forêt. Quand vous plongez votre regard dans son feuillage,"
				+ "vous sentez un étrange sentiment de frayeur.");
		dotdotdot();
		
		// INTRO ENDS HERE
		
		AdventurerStatus.setPosition(new OreeDeLaForet());
		displayMusicAndRoom(AdventurerStatus.getPosition(), textArea);

	}

	public static void dotdotdot() throws InterruptedException {
		int countMilliSec=0;
		String textToDisplay = Engin.textArea.getText() + "\n";
		String textWithDots = textToDisplay;
		for (int i = 0; i < 5000; i++) {
//		for (int i = 0; i < 0; i++) {
			if (Engin.nextText==true) {
				break;
			}
			TimeUnit.MILLISECONDS.sleep(1);
			countMilliSec+=1;
			if (countMilliSec>1000) {
				textWithDots += '.';
				countMilliSec=0;
			}
			Engin.textArea.setText(textWithDots);
		}
	}

	public static void displayMusicAndRoom(Room room, JTextArea textArea) {
		try {
			AudioPlayer.AudioPlayerChoseTrack(room.getPathMusicOfTheRoom());
			AudioPlayer.play();
			displayText(room.getDescription1());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void displayText(String text) throws InterruptedException {
		int n = 0;
		String textToDisplay = "";
//		JTextArea textAreaToWriteIn=null;
		
//		if (textPanel.isVisible()==true) {
//			textAreaToWriteIn=secondaryTextArea;
//			textPanel.setVisible(false);
//			secondaryTextPanel.setVisible(true);
//		} else {
//			textAreaToWriteIn=textArea;
//			textPanel.setVisible(true);
//			secondaryTextPanel.setVisible(false);
//		}
//		
		for (char ch : text.toCharArray()) {
			textToDisplay += ch;
			n++;
			if (n >= 60 && ch == ' ') {
				textToDisplay += "\n";
				n = 0;
			}
			if (ch == '\n') {
				n = 0;
			}
			
		}
		textArea.setText(textToDisplay);

	}
	
	
	// FUNCTIONS FOR MOVEMENT
	public void moveCharacterNESO(Integer indexDirection) {
		Room previousRoom = AdventurerStatus.getPosition();
		String nameNewRoom = AdventurerStatus.getPosition().getRoomsConnected().get(indexDirection);
//		System.out.println(nameNewRoom);
		AdventurerStatus.moveToRoom(nameNewRoom);
		if (previousRoom.getPathMusicOfTheRoom().equals(AdventurerStatus.getPosition().getPathMusicOfTheRoom())) {
			try {
				displayText(AdventurerStatus.getPosition().getDescription1());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
		try {
			AudioPlayer.stop();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
		displayMusicAndRoom(AdventurerStatus.getPosition(), textArea);}
	}
	
	public void moveCharacter(String room) throws InterruptedException {
		Room previousRoom = AdventurerStatus.getPosition();
		if (Room.getAllRooms().contains(Room.getRoomFromName(room))) {
			AdventurerStatus.moveToRoom(room);
			if (previousRoom.getPathMusicOfTheRoom().equals(AdventurerStatus.getPosition().getPathMusicOfTheRoom())) {
				try {
					displayText(AdventurerStatus.getPosition().getDescription1());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
			try {
				AudioPlayer.stop();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			displayMusicAndRoom(AdventurerStatus.getPosition(), textArea);}
		}else {
			secondaryTextArea.setText("La salle "+resInput.get("directionMovement")+" n'existe pas");
			secondaryTextPanel.setVisible(true);
		}
		
	}
	
	// MOVE TOWER
	public void moveCharacterInTowerNESO(Integer indexDirection) {
		String stateLumieres = "";
		Room previousRoom = AdventurerStatus.getPosition();
		String nameNewRoom = AdventurerStatus.getPosition().getRoomsConnected().get(indexDirection);
//		System.out.println(nameNewRoom);
		AdventurerStatus.moveToRoom(nameNewRoom);
		Room currentRoom = AdventurerStatus.getPosition();
		if (previousRoom.getPathMusicOfTheRoom().equals(AdventurerStatus.getPosition().getPathMusicOfTheRoom())) {
			if (currentRoom.getDescription2().equals("éteintes")) {
				if (Integer.parseInt(currentRoom.getName().split(" ")[1])>Integer.parseInt(previousRoom.getName().split(" ")[1])||
						previousRoom.getName().equals("Tour Rdc")) {
					stateLumieres = "Les torches incrustées dans les murs s'allument et émettent une lumière tamisée.";
				}
				else if (Integer.parseInt(currentRoom.getName().split(" ")[1])<Integer.parseInt(previousRoom.getName().split(" ")[1])){
					stateLumieres = "Les torches incrustées dans les murs restent éteintes.";
				}
			}else
				if (currentRoom.getDescription2().equals("allumées")) {
					if (Integer.parseInt(currentRoom.getName().split(" ")[1])>Integer.parseInt(previousRoom.getName().split(" ")[1])||
							previousRoom.getName().equals("Tour Rdc")) {
						stateLumieres = "Les torches incrustées dans les murs sont allumés et diffusent une lumière sans chaleur.";
					}
					else if (Integer.parseInt(currentRoom.getName().split(" ")[1])<Integer.parseInt(previousRoom.getName().split(" ")[1])){
						stateLumieres = "Les torches s'éteignent quand vous pénétrez dans la salle.";
					}
				}
			try {
				displayText(AdventurerStatus.getPosition().getDescription1()+"\n"+stateLumieres);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
		try {
			AudioPlayer.stop();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
		displayMusicAndRoom(AdventurerStatus.getPosition(), textArea);}
	}
	
	public void moveCharacterInTower(String etage) throws InterruptedException {
		String stateLumieres = "";
		Room previousRoom = AdventurerStatus.getPosition();
		if (Room.getAllRooms().contains(Room.getRoomFromName(etage))) {
			AdventurerStatus.moveToRoom(etage);
			Room currentRoom = AdventurerStatus.getPosition();
			if (previousRoom.getPathMusicOfTheRoom().equals(currentRoom.getPathMusicOfTheRoom())) {
				if (currentRoom.getDescription2().equals("éteintes")) {
					if (Integer.parseInt(currentRoom.getName().split(" ")[1])>Integer.parseInt(previousRoom.getName().split(" ")[1])||
							previousRoom.getName().equals("Tour Rdc")) {
						stateLumieres = "Les torches incrustées dans les murs s'allument et émettent une lumière tamisée.";
					}
					else if (Integer.parseInt(currentRoom.getName().split(" ")[1])<Integer.parseInt(previousRoom.getName().split(" ")[1])){
						stateLumieres = "Les torches incrustées dans les murs restent éteintes.";
					}
				}else
					if (currentRoom.getDescription2().equals("allumées")) {
						if (Integer.parseInt(currentRoom.getName().split(" ")[1])>Integer.parseInt(previousRoom.getName().split(" ")[1])||
								previousRoom.getName().equals("Tour Rdc")) {
							stateLumieres = "Les torches incrustées dans les murs sont allumés et diffusent une lumière sans chaleur.";
						}
						else if (Integer.parseInt(currentRoom.getName().split(" ")[1])<Integer.parseInt(previousRoom.getName().split(" ")[1])){
							stateLumieres = "Les torches s'éteignent quand vous pénétrez dans la salle.";
						}
					}
				try {
					displayText(AdventurerStatus.getPosition().getDescription1()+"\n"+stateLumieres);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
			try {
				AudioPlayer.stop();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			displayMusicAndRoom(AdventurerStatus.getPosition(), textArea);}
		}else {
			secondaryTextArea.setText("La salle "+resInput.get("directionMovement")+" n'existe pas");
			secondaryTextPanel.setVisible(true);
		}
		
	}
	
	
	
	
	
	// ACTION HANDLER
	

	public class ActionsHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			
//			System.out.println("###############################");
			String inputRead = inputBox.getText();
			inputBox.setText("");
			
			secondaryTextPanel.setVisible(false);
			
			
			// IF PRESS ENTER WITH NOTHING IN THE INPUT BOX SKIPS THE TEXT
			if (inputRead.equals("")) {
//				System.err.println("vide");
				if ( AdventurerStatus.getPosition().getName().equals("Gouffre chute")) {
					try {
						moveCharacter("Orée de la forêt");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

			}
			
			
			
			// READ ACTION OF PLAYER AND COMPREHEND WHAT HE WANTS TO DO
			else {
				resInput=PlayerActions.comprehension(inputRead);
			
			// MOVE THE PLAYER
			if (resInput.get("actionVerb")=="deplacer") {
				// NORTH
				if (resInput.get("directionMovement")=="nord"||
						resInput.get("directionMovement")==AdventurerStatus.getPosition().getRoomsConnected().get(0)) {
					moveCharacterNESO(0);
				}
				// EAST
				if (resInput.get("directionMovement")=="est"||
						resInput.get("directionMovement")==AdventurerStatus.getPosition().getRoomsConnected().get(1)) {
					moveCharacterNESO(1);
				}
				// SOUTH
				if (resInput.get("directionMovement")=="sud"||
							resInput.get("directionMovement")==AdventurerStatus.getPosition().getRoomsConnected().get(2)) {
				moveCharacterNESO(2);
				}
				//WEST
				if (resInput.get("directionMovement")=="ouest"||
						resInput.get("directionMovement")==AdventurerStatus.getPosition().getRoomsConnected().get(3)) {
				moveCharacterNESO(3);
				}
				
				
				// GOUFFRE
				if (AdventurerStatus.getPosition().getName().split(" ")[0].equals("Gouffre")) {
//					System.err.println("Adventurer in Gouffre: "+AdventurerStatus.getPosition().getName().split(" ")[1]);
					if (resInput.get("actionVerb")=="deplacer" && AdventurerStatus.getPosition().getName().split(" ")[1].equals("entrée")) {
						if (resInput.get("directionMovement")==AdventurerStatus.getPosition().getRoomsConnected().get(0)||
								resInput.get("directionMovement")=="plateforme"||
								resInput.get("directionMovement")=="gouffre"){
//							System.err.println("AVENTURIER SUR PREMIERE PLATEFORME");
							moveCharacterNESO(0);
							}
					}
					// PREMIERE PLATEFORME
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("1")) {
						if (resInput.get("actionVerb")=="deplacer") {
							if (resInput.get("directionMovement").contains("plateforme")&&
									(inputRead.contains("troisième")||inputRead.contains("trois")||inputRead.contains("3"))){
//								System.err.println("AVENTURIER SUR TROISIEME PLATEFORME");
								moveCharacterNESO(4);
							}
							else {
								try {
									tomberDansLeGouffre();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}

					}
					
					// TROISIEME PLATEFORME
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("3")) {
						if (resInput.get("actionVerb")=="deplacer") {
							if (resInput.get("directionMovement").contains("plateforme")&&
									(inputRead.contains("quatrième")||inputRead.contains("quatre")||inputRead.contains("4"))){
//								System.err.println("AVENTURIER SUR QUATRIEME PLATEFORME");
								moveCharacterNESO(4);
							}
							else {
								try {
									tomberDansLeGouffre();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
					
					// QUATRIEME PLATEFORME
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("4")) {
						if (resInput.get("actionVerb")=="deplacer") {
							if (resInput.get("directionMovement").contains("plateforme")&&
									(inputRead.contains("2")||inputRead.contains("deux")||inputRead.contains("seconde")||inputRead.contains("deuxième"))){
//								System.err.println("AVENTURIER SUR SECONDE PLATEFORME");
								moveCharacterNESO(4);
							}
							else {
								try {
									tomberDansLeGouffre();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
					
					// SECONDE PLATEFORME
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("2")) {
						if (resInput.get("actionVerb")=="deplacer") {
							if (resInput.get("directionMovement").contains("plateforme")&&
									(inputRead.contains("cinquième")||inputRead.contains("5")||inputRead.contains("cinq"))){
//								System.err.println("AVENTURIER SUR CINQUIEME PLATEFORME");
								moveCharacterNESO(4);
							}
							else {
								try {
									tomberDansLeGouffre();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
					// CINQUIEME PLATEFORME
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("5")) {
						if (resInput.get("actionVerb")=="deplacer") {
							moveCharacterNESO(0);
						}
					}
					else if (AdventurerStatus.getPosition().getName().split(" ")[1].equals("sortie")) {
						if (resInput.get("actionVerb")=="deplacer" || inputRead.toLowerCase().contains("entrer") ) {
							moveCharacterNESO(0);
						}
					}
				}
			
			

				
			}
			// TOUR
			else if (AdventurerStatus.getPosition().getName().equals("Tour Rdc")) {
//				System.err.println("TOUR");
				if (inputRead.toLowerCase().contains("fuck you")) {
					moveCharacterNESO(4);
				}
			}
				
				

			// INVESTIGATE OBJECTS AND ROOM
			else if (resInput.get("actionVerb")=="examiner") {
			
		}
			
			// TAKE OBJECTS IN ROOM
			else if (resInput.get("actionVerb")=="prendre") {
				for (Item i:AdventurerStatus.getPosition().getItemsInRoom()) {
					if (i.getName()==resInput.get("objectOfAction")) {
						AdventurerStatus.getInventaire().add(i);
					}
				}
			}
			
			
			

			else {
				System.err.println("Je n'ai pas compris la commande");
				System.err.println("** "+inputRead+" **");
				secondaryTextArea.setText("Je n'ai pas compris la commande");
				secondaryTextPanel.setVisible(true);
			}
//			System.out.println("--Position-- "+AdventurerStatus.getPosition().getName());
//			System.out.println(AdventurerStatus.getPosition().getRoomsConnected());
//			System.out.println("--Inventaire--");
//			for (Item i:AdventurerStatus.getInventaire()) {
//				System.out.println(i.getName());
//			}
			
			
			}
			
			
		}
		

	}
	
	public void tomberDansLeGouffre() throws InterruptedException {
		moveCharacter("Gouffre chute");
		secondaryTextArea.setText("Appuyez sur entrer");
		secondaryTextPanel.setVisible(true);
	}



}
