package Game;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	int heroattack;
	int herohp;
	int herodmg;
	int enemyattack;
	int enemyhp;
	int enemydmg;
	
	int[] battle(CharacterCreator hero, Villan ban){
		enemyattack = ban.agi;
		enemydmg = ban.str;
		enemyhp = ban.hp;
		
		int[] over = {1,1};
		
		
		if(hero.nameClass == "wojownik"){
			heroattack = hero.agi;
			herodmg = hero.str;
			herohp = hero.hp;
		}
		else if(hero.nameClass == "mag"){
			heroattack = hero.mag;
			herodmg = hero.will;
			herohp = hero.hp;
		}
		
		System.out.print(" Czas na walkê. \n");  System.out.print(ban.name);
		System.out.print(ban.str + "\n\n\n");
		for(int i=1; i<20; i++){
			System.out.print("\nRunda " + i + "\n");
			System.out.print("Masz: " + herohp + " hp Przeciwnik ma: " + enemyhp + " hp \n" );
			System.out.print("Co robisz ? \n");
			System.out.print("1. Atakujesz\n2. Uciekasz");
			
			Scanner input = new Scanner(System.in);
			int choicer = input.nextInt();
			if(choicer == 1){
				//System.out.print("Atakujesz i zadajesz " + herodmg);
				//WorkSpace
				System.out.print("Atakajusz i... ");
				Random gen = new Random();
				int score = gen.nextInt(11);
				
				if(score <= heroattack){
					System.out.print("trafiasz zadaj¹c " + herodmg);
					enemyhp = enemyhp - herodmg;
				}
				else{
					System.out.print("pud³ujesz ");
				}
				//End
				
				//enemyhp = enemyhp - herodmg;
			}
			
			else if(choicer == 2){
				System.out.print("Uciekaj, tchórzu !! \n");
				over[1] = 0;
				break;
			}
			Scanner pointer = new Scanner(System.in);
			String poin = pointer.nextLine();
			
			//System.out.print("Przeciwnik atakuje i zadaje: " + enemydmg);
			//herohp = herohp - enemydmg;
			
			//WorkSpace
			System.out.print("Przeciwnik atakuje i... ");
			Random gen2 = new Random();
			int score = gen2.nextInt(11);
			
			if(score <= enemyattack){
				System.out.print("trafia zadaj¹c " + enemydmg);
				herohp = herohp - enemydmg;
			}
			else{
				System.out.print("pud³uje ");
			}
			//End
			
			if(herohp <= 0){
				System.out.print("\n POLEG£EŒ !!! \n");
				over[0] = 0;
				break;
			}
			if(enemyhp <= 0){
				System.out.print("\n Zwyciê¿y³eœ. \n");
				hero.xp = hero.xp + ban.xp;
				System.out.print("Twój poziom : " + hero.lvl + " Twój poziom doœwiadczenia: " + hero.xp + "\n");
				LevelUp lvlup = new LevelUp();
				lvlup.doLevel(hero);
				
				if(ban.name == "król bandytów"){
					hero.gotSeal = 1;
					System.out.print("Pokona³eœ króla bandytów. Masz Pieczêæ. Ruszaj ku Rubinowej Bramie. \n");
				}
				break;
			}
		}
		return over;
	}

}
