package Game;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.print("Je¿eli masz ju¿ postaæ wciœnij jakiœ klawisz i enter. \nJe¿eli nie, wciœnij enter.\n");
		Scanner choice = new Scanner(System.in);
		String input = choice.nextLine();
		if(input.length() == 1){
			Save person1 = new Save();
			person1.loadgame();
			GameInterface inter = new GameInterface();
			inter.SecondGameInterface(person1);
		}
		else{
			CharacterCreator person1 = new CharacterCreator();
			GameInterface inter = new GameInterface();
			inter.FirstGameInterface(person1);
		}
		

	}

}
