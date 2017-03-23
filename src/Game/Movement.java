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
		 System.out.print(" W któr¹ strone chcesz siê udaæ. \n");
		 System.out.print("1. Pó³noc\n2. Wschód\n3. Po³udnie\n4. Zachód\n5. Zakoñcz przygodê.");

		Scanner input = new Scanner(System.in);
		int obj = input.nextInt();
		
		System.out.print("\n\n\n\n\n\n");
		if(obj == 1){
			if(table[0] <= 3){
				System.out.print("Idziesz na pó³noc. \n");
				norsoucounter++;
				table[0] = norsoucounter;
			}
			else {
				System.out.print("Dalej na pó³nocy s¹ góry. Zawróæ. \n");
			}
		}
		else if(obj == 2){
			if(table[1] <= 3){
				System.out.print("Idziesz na wschód. \n");
				eastwestcounter++;
				table[1] = eastwestcounter;
			}
			else{
				System.out.print("Dalej na wschód s¹ dewianci. ZAWRÓÆ. \n");
			}
		}
		else if (obj == 3){
			if(table[0] >= -3){
				System.out.print("Idziesz na po³udnie. \n");
				norsoucounter--;
				table[0] = norsoucounter;
			}
			else{
				System.out.print("Dalej na po³udnie jest wielkie morze. Zawróæ.\n");
			}
		}
		else if (obj == 4){
			if(table[1] >= -3) {
				System.out.print("Idziesz na zachód. \n");
				eastwestcounter--;
				table[1] = eastwestcounter;
			}
			else{
				System.out.print("Dalej na zachodzie s¹ mroczne bagna. Zawróæ. \n");
			}
		}
		else if (obj == 5){
			System.out.print("¯egnaj. Widzimy siê na szlaku.");
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
				System.out.print("Jesteœ w punkcie wyjœcia.");
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
			 System.out.print("£o na boga, niedzwiedz.");
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
			 System.out.print("Szuka³em ciê herszczie bandytów. To Twój koniec.");
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
				System.out.print("Masz pieczêæ ! Mo¿esz przejœæ. \n");
				System.out.print("WYGRALEŒ ");
				 
			 }
			 else if(hero.gotSeal == 0){
				 System.out.print("Aby je otworzyæ potrzebna jest Pieczêæ Przejœcia. Poszukaj jej. \n");
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
