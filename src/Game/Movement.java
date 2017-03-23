package Game;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Movement {
	int norsoucounter;
	int eastwestcounter;
	int[] table = new int[2];
	static int end = 1;
	static int[] close_numbers = {1,1,1,1,1,1,1,1};
	int[] pre_over = {1, 1};
	
	
	 int[] move(CharacterCreator heroes) throws FileNotFoundException {
		 System.out.print(" W kt�r� strone chcesz si� uda�. \n");
		 System.out.print("1. P�noc\n2. Wsch�d\n3. Po�udnie\n4. Zach�d\n5. Zako�cz przygod�.");

		Scanner input = new Scanner(System.in);
		int obj = input.nextInt();
		
		System.out.print("\n\n\n\n\n\n");
		if(obj == 1){
			if(table[0] <= 3){
				System.out.print("Idziesz na p�noc. \n");
				norsoucounter++;
				table[0] = norsoucounter;
			}
			else {
				System.out.print("Dalej na p�nocy s� g�ry. Zawr��. \n");
			}
		}
		else if(obj == 2){
			if(table[1] <= 3){
				System.out.print("Idziesz na wsch�d. \n");
				eastwestcounter++;
				table[1] = eastwestcounter;
			}
			else{
				System.out.print("Dalej na wsch�d s� dewianci. ZAWR��. \n");
			}
		}
		else if (obj == 3){
			if(table[0] >= -3){
				System.out.print("Idziesz na po�udnie. \n");
				norsoucounter--;
				table[0] = norsoucounter;
			}
			else{
				System.out.print("Dalej na po�udnie jest wielkie morze. Zawr��.\n");
			}
		}
		else if (obj == 4){
			if(table[1] >= -3) {
				System.out.print("Idziesz na zach�d. \n");
				eastwestcounter--;
				table[1] = eastwestcounter;
			}
			else{
				System.out.print("Dalej na zachodzie s� mroczne bagna. Zawr��. \n");
			}
		}
		else if (obj == 5){
			System.out.print("�egnaj. Widzimy si� na szlaku.");
			Save save = new Save();
			save.savegame(heroes);
			table[0] = 9;
			
		}
		else {
			System.out.print("Nie ta komenda. \n");
		}
		return table;
		
	 }
	 
	 int checkLocation(int[] locationtable, CharacterCreator heroes){
		 int[] tab = locationtable;
		 CharacterCreator hero = heroes;
		 Bandit ban = new Bandit();
		 Wolf wol = new Wolf();
		 Bear bea = new Bear();
		 BanditKing king = new BanditKing();
		 
		 int over = pre_over[0];
		 
		 
		 
		 System.out.print("Lokacja wydarzenia: " + tab[0] + " " + tab[1] + "\n");
		 
		 
		 
		 if(table[0] == 0 && table[1] == 0 ) {
				System.out.print("Jeste� w punkcie wyj�cia.");
			}
		 
		 if(table[0] == 2 && table[1] == 2 && close_numbers[0] == 1) {
			 System.out.print("O kurwa, bandyci. ");
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, ban);
			 if(pre_over[1] == 1){
				 close_numbers[0] = 0;
			 }
			 else{
				 close_numbers[0] = 1;
			 }
		 }
		 if(table[0] == -1 && table[1] == -3  && close_numbers[1] == 1) {
			 System.out.print("O kurwa, bandyci. ");
			 //Battle newBattle = new Battle(hero, ban);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, ban);
			 if(pre_over[1] == 1){
				 close_numbers[1] = 0;
			 }
			 else{
				 close_numbers[1] = 1;
			 }
		 }
		 if(table[0] == 0 && table[1] == 4  && close_numbers[2] == 1) {
			 System.out.print("O kurwa, bandyci. ");
			 //Battle newBattle = new Battle(hero, ban);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, ban);
			 if(pre_over[1] == 1){
				 close_numbers[2] = 0;
			 }
			 else{
				 close_numbers[2] = 1;
			 }
		 }
		 
		 if(table[0] == 1 && table[1] == 2  && close_numbers[3] == 1) {
			 System.out.print("O rety, Wilk. ");
			 //Battle newBattle = new Battle(hero, wol);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, wol);
			 if(pre_over[1] == 1){
				 close_numbers[3] = 0;
			 }
			 else{
				 close_numbers[3] = 1;
			 }
		 }
		 if(table[0] == 4 && table[1] == -1 && close_numbers[4] == 1) {
			 System.out.print("O rety, Wilk. ");
			 //Battle newBattle = new Battle(hero, wol);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, wol);
			 if(pre_over[1] == 1){
				 close_numbers[4] = 0;
			 }
			 else{
				 close_numbers[4] = 1;
			 }
		 }
		 
		 if(table[0] == -3 && table[1] == 2 && close_numbers[5] == 1) {
			 System.out.print("�o na boga, niedzwiedz.");
			 //Battle newBattle = new Battle(hero, bea);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, bea);
			 if(pre_over[1] == 1){
				 close_numbers[5] = 0;
			 }
			 else{
				 close_numbers[5] = 1;
			 }
		 }
		 
		 if(table[0] == 3 && table[1] == -4 && close_numbers[6] == 1) {
			 System.out.print("Szuka�em ci� herszczie bandyt�w. To Tw�j koniec.");
			 //Battle newBattle = new Battle(hero, king);
			 Battle newBattle = new Battle();
			 pre_over = newBattle.battle(hero, king);
			 if(pre_over[1] == 1){
				 close_numbers[6] = 0;
			 }
			 else{
				 close_numbers[6] = 1;
			 }
		 }
		 if(table[0] == 4 && table[1] == 4 ) {
			 System.out.print("Stoisz przed Rubinowymi Wrotami. \n");
			 if(hero.gotSeal == 1) {
				System.out.print("Masz piecz�� ! Mo�esz przej��. \n");
				System.out.print("WYGRALE� ");
				 
			 }
			 else if(hero.gotSeal == 0){
				 System.out.print("Aby je otworzy� potrzebna jest Piecz�� Przej�cia. Poszukaj jej. \n");
			 }
		 }
		 
		 return over;
	 }
	 
	 int[] eventLocation(){
		Random bin = new Random();
		int a = bin.nextInt(2);
		int b = bin.nextInt(2);
		 
		 Random generator = new Random();
		 int value1 = generator.nextInt(5);
		 int value2 = generator.nextInt(5);
		 
		 int[] tab = new int[2];
		 tab[0] = value1;
		 tab[1] = value2;
		 
		if(a == 1){
			tab[0] = tab[0];
		}
		else if(a == 0){
			tab[0] = tab[0] - 2 * tab[0];
		}
		
		if(b == 1){
			tab[1] = tab[1];
		}
		else if(b == 0){
			tab[1] = tab[1] - 2 * tab[1];
		}
		 
		 return tab;
		 
	 }
	

}
