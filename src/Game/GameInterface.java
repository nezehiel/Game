package Game;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameInterface {
	int[] table = new int[2];
	CharacterCreator heroes;
	Save heroes2;
	static int over = 1;
		
	
	void FirstGameInterface(CharacterCreator hero) throws FileNotFoundException{
		heroes = hero;
		System.out.print("Witaj " + hero.name +" " + hero.nameRace + "u " + hero.nameClass + "u \n");
		System.out.print("Oto twoje statystyki:\n");
		System.out.print("Si³a: " + hero.str + "\n");
		System.out.print("Zrêcznoœæ: " + hero.agi + "\n");
		System.out.print("Si³a woli: " + hero.will + "\n");
		System.out.print("Umiejêtnoœci magiczne: " + hero.mag + "\n");
		System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
		System.out.print("Aby rozpocz¹æ przygodê, naciœnij przycisk Enter \n");
		
		Scanner input = new Scanner(System.in);
		String something = input.nextLine();
		String enter = "";
		
		if(something.length() == enter.length()){
			System.out.print("Czas zacz¹æ przygodê. Stoisz na skrzy¿owaniu, pod drzewem wisielca. \n"
				+ "Twoim zadaniem jest zdobycie Pieczêci Przejœcia. Jest ona w posiadaniu Herszta Zbójów. \n"
				+ "Aby go pokonaæ, musisz zdobyæ trochê doœwiadczenia."
				+ "Pieczêæ pos³u¿y Ci do otwarcia Adamatowych Wrót, gdzie ukryty jest skarb. \nDo dzie³a ! \n");
			
			// W³aœciwa gra. Wczêsniej nie modyfikuj
			
			Movement HeroMove = new Movement();
			for(int i=0; i<10000; i++){
				table = HeroMove.move(heroes);
				if(table[0] == 9){
					break;
				}
				else {
					
					System.out.print("Twoja lokacja: \n");
					System.out.print("NorSou EastWest\n");
					System.out.print("   " + table[0] + "        " + table[1]  + "\n");
					over = HeroMove.checkLocation(table, heroes);
					
				
					//Sprawdzenie co kryje siê w lokacji
				}
				if(over == 0) {
					break;
				}
				
			}
		}
		else if(something.length() == 1){
			Save load = new Save();
			load.loadgame();
			
		}
		else{System.out.print("Z³y przcysk, kurwiu. Koniec gry za karê. ");}
	}
	
	void SecondGameInterface(Save hero) throws FileNotFoundException{
		heroes2 = hero;
		System.out.print("Witaj " + hero.name +" " + hero.nameRace + "u " + hero.nameClass + "u \n");
		System.out.print("Oto twoje statystyki:\n");
		System.out.print("Si³a: " + hero.str + "\n");
		System.out.print("Zrêcznoœæ: " + hero.agi + "\n");
		System.out.print("Si³a woli: " + hero.will + "\n");
		System.out.print("Umiejêtnoœci magiczne: " + hero.mag + "\n");
		System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
		System.out.print("Aby rozpocz¹æ przygodê, naciœnij przycisk Enter \n");
		
		Scanner input = new Scanner(System.in);
		String something = input.nextLine();
		String enter = "";
		
		if(something.length() == enter.length()){
			System.out.print("Czas zacz¹æ przygodê. Stoisz na skrzy¿owaniu, pod drzewem wisielca. \n"
				+ "Twoim zadaniem jest zdobycie Pieczêci Przejœcia. Jest ona w posiadaniu Herszta Zbójów. \n"
				+ "Aby go pokonaæ, musisz zdobyæ trochê doœwiadczenia."
				+ "Pieczêæ pos³u¿y Ci do otwarcia Adamatowych Wrót, gdzie ukryty jest skarb. \nDo dzie³a ! \n");
			
			// W³aœciwa gra. Wczêsniej nie modyfikuj
			
			Movement HeroMove = new Movement();
			for(int i=0; i<10000; i++){
				table = HeroMove.move(heroes);
				if(table[0] == 9){
					break;
				}
				else {
					
					System.out.print("Twoja lokacja: \n");
					System.out.print("NorSou EastWest\n");
					System.out.print("   " + table[0] + "        " + table[1]  + "\n");
					over = HeroMove.checkLocation(table, heroes);
					
				
					//Sprawdzenie co kryje siê w lokacji
				}
				if(over == 0) {
					break;
				}
				
			}
		}
		else if(something.length() == 1){
			Save load = new Save();
			load.loadgame();
			
		}
		else{System.out.print("Z³y przcysk, kurwiu. Koniec gry za karê. ");}
	}

}
