package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Save {
	String name;
	String nameClass;
	String nameRace;
	int agi;
	int hp;
	int mag;
	int str;
	int will;
	int gotSeal;
	int lvl;
	int xp;
	
	void savegame  (CharacterCreator hero) throws FileNotFoundException{
		PrintWriter save = new PrintWriter("save.txt");
		save.print(hero.name + "\n" + hero.nameClass + "\n" + hero.nameRace+ "\n" + hero.agi+ "\n" + hero.hp+ "\n" + hero.mag+ "\n" + hero.str+ "\n" + hero.will+ "\n" + hero.gotSeal+ "\n" + hero.lvl+ "\n" + hero.xp+ "\n" );
		
		save.close();
	}
	void loadgame() throws FileNotFoundException{
		File load = new File("save.txt");
		Scanner in = new Scanner(load);
		
		name = in.nextLine();
		nameClass = in.nextLine();
		nameRace = in.nextLine() ;
		agi = in.nextInt();
		hp = in.nextInt();
		mag = in.nextInt();
		str = in.nextInt();
		will = in.nextInt();
		gotSeal = in.nextInt();
		lvl = in.nextInt();
		xp = in.nextInt();
		
	}
}
