package Game;

import java.util.Scanner;

class Creature{
	String nameRace;
}

class Human extends Creature{
	String nameRace = "cz³owiek";
	int str = 2;
	int agi = 2;
	int will = 2;
	int mag = 2;
	int hp = 4;
}

class Orc extends Creature{
	String nameRace = "ork";
	int str = 3;
	int agi = 2;
	int will = 1;
	int mag = 2;
	int hp = 5;
}

class CreatureClass {
	String nameClass;
}

class Warrior extends CreatureClass {
	String nameClass = "wojownik";
	int str = 3;
	int agi = 3;
	int will = 1;
	int mag = 2;
	int hp = 3;
	int xp = 1;
	int lvl = 1;
	int gotSeal = 0;
}

class Mage extends CreatureClass {
	String nameClass = "mag";
	int str = 1;
	int agi = 2;
	int will = 3;
	int mag = 3;
	int hp = 2;
	int xp = 1;
	int lvl = 1;
	int gotSeal = 0;
}

public class CharacterCreator {
	String nameRace;
	String nameClass;
	String name;
	int str;
	int agi;
	int will;
	int mag;
	int hp;
	String weapon;
	static int xp;
	static int lvl;
	static int gotSeal;
	//test blok

	//koniec test bloku
	
	CharacterCreator() {
		System.out.print("Tworzenie postaci. \n");
		System.out.print("Wybierz rasê: \n1. Cz³owiek \n2. Ork \n");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice){
		case 1: Human character = new Human();
				this.nameRace = character.nameRace;
				this.str = this.str + character.str;
				this.agi = this.agi + character.agi;
				this.will = this.will + character.will;
				this.mag = this.mag + character.mag;
				this.hp = this.hp + character.hp;
				break;
		case 2: Orc character2 = new Orc();
				this.nameRace = character2.nameRace;
				this.str = this.str + character2.str;
				this.agi = this.agi + character2.agi;
				this.will = this.will + character2.will;
				this.mag = this.mag + character2.mag;
				this.hp = this.hp + character2.hp;
				break;
		default:System.out.print("Z³a komenda. Spróbuj ponownie.");
				break;
		}
		System.out.print("Wybierz klasê: \n1. Wojownik \n2. Mag \n");
		Scanner input2 = new Scanner(System.in);
		int choice2 = input2.nextInt();
		switch(choice2){
		case 1: Warrior class1 = new Warrior();
				this.nameClass = class1.nameClass;
				this.str = this.str + class1.str;
				this.agi = this.agi + class1.agi;
				this.will = this.will + class1.will;
				this.mag = this.mag + class1.mag;
				this.hp = this.hp + class1.hp;
				this.weapon = "miecz";
				this.xp = xp;
				this.lvl = 1;
				this.gotSeal = 0;
				break;
		case 2: Mage class2 = new Mage();
				this.nameClass = class2.nameClass;
				this.str = this.str + class2.str;
				this.agi = this.agi + class2.agi;
				this.will = this.will + class2.will;
				this.mag = this.mag + class2.mag;
				this.hp = this.hp + class2.hp;
				this.weapon = "kostur";
				this.xp = xp;
				this.lvl = 1;
				this.gotSeal = 0;
				break;
		default:System.out.print("Z³a komenda. Spróbuj ponownie.");
				break;
		}
		
		System.out.print("Jak siê nazywasz: \n");
		Scanner input3 = new Scanner(System.in);
		this.name = input3.nextLine();
		
		
	}

}
