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
		System.out.print("Si�a: " + hero.str + "\n");
		System.out.print("Zr�czno��: " + hero.agi + "\n");
		System.out.print("Si�a woli: " + hero.will + "\n");
		System.out.print("Umiej�tno�ci magiczne: " + hero.mag + "\n");
		System.out.print("�ywotno��: " + hero.hp + "\n\n");
		System.out.print("Aby rozpocz�� przygod�, naci�nij przycisk Enter \n");
		
		Scanner input = new Scanner(System.in);
		String something = input.nextLine();
		String enter = "";
		
		if(something.length() == enter.length()){
			System.out.print("Czas zacz�� przygod�. Stoisz na skrzy�owaniu, pod drzewem wisielca. \n"
				+ "Twoim zadaniem jest zdobycie Piecz�ci Przej�cia. Jest ona w posiadaniu Herszta Zb�j�w. \n"
				+ "Aby go pokona�, musisz zdoby� troch� do�wiadczenia."
				+ "Piecz�� pos�u�y Ci do otwarcia Adamatowych Wr�t, gdzie ukryty jest skarb. \nDo dzie�a ! \n");
			
			// W�a�ciwa gra. Wcz�sniej nie modyfikuj
			
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
					
				
					//Sprawdzenie co kryje si� w lokacji
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
		else{System.out.print("Z�y przcysk, kurwiu. Koniec gry za kar�. ");}
	}
	
	void SecondGameInterface(Save hero) throws FileNotFoundException{
		heroes2 = hero;
		System.out.print("Witaj " + hero.name +" " + hero.nameRace + "u " + hero.nameClass + "u \n");
		System.out.print("Oto twoje statystyki:\n");
		System.out.print("Si�a: " + hero.str + "\n");
		System.out.print("Zr�czno��: " + hero.agi + "\n");
		System.out.print("Si�a woli: " + hero.will + "\n");
		System.out.print("Umiej�tno�ci magiczne: " + hero.mag + "\n");
		System.out.print("�ywotno��: " + hero.hp + "\n\n");
		System.out.print("Aby rozpocz�� przygod�, naci�nij przycisk Enter \n");
		
		Scanner input = new Scanner(System.in);
		String something = input.nextLine();
		String enter = "";
		
		if(something.length() == enter.length()){
			System.out.print("Czas zacz�� przygod�. Stoisz na skrzy�owaniu, pod drzewem wisielca. \n"
				+ "Twoim zadaniem jest zdobycie Piecz�ci Przej�cia. Jest ona w posiadaniu Herszta Zb�j�w. \n"
				+ "Aby go pokona�, musisz zdoby� troch� do�wiadczenia."
				+ "Piecz�� pos�u�y Ci do otwarcia Adamatowych Wr�t, gdzie ukryty jest skarb. \nDo dzie�a ! \n");
			
			// W�a�ciwa gra. Wcz�sniej nie modyfikuj
			
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
					
				
					//Sprawdzenie co kryje si� w lokacji
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
		else{System.out.print("Z�y przcysk, kurwiu. Koniec gry za kar�. ");}
	}

}
