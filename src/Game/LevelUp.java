package Game;

public class LevelUp {
	
	void doLevel(CharacterCreator hero){
		if(hero.lvl == 1) {
			if(hero.xp >= 5) {
				hero.lvl++;
				hero.xp = 1;
				hero.hp++;
				if(hero.nameClass == "wojownik") {
					hero.agi++;
				}
				else if(hero.nameClass == "mag") {
					hero.mag++;
				}
				System.out.print("GRATULACJE. Zdoby³eœ poziom " + hero.lvl + "\n" );
				System.out.print("Twoje staty: \n");
				System.out.print("Si³a: " + hero.str);
				System.out.print("  Zrêcznoœæ: " + hero.agi + "\n");
				System.out.print("Si³a woli: " + hero.will);
				System.out.print("  Umiejêtnoœci magiczne: " + hero.mag + "\n");
				System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
			}
		}
		else if(hero.lvl == 2){
			if(hero.xp >= 5) {
				hero.lvl++;
				hero.xp = 1;
				hero.hp++;
				if(hero.nameClass == "wojownik") {
					hero.agi++;
				}
				else if(hero.nameClass == "mag") {
					hero.mag++;
				}
				System.out.print("GRATULACJE. Zdoby³eœ poziom " + hero.lvl + "\n" );
				System.out.print("Twoje staty: \n");
				System.out.print("Si³a: " + hero.str);
				System.out.print("  Zrêcznoœæ: " + hero.agi + "\n");
				System.out.print("Si³a woli: " + hero.will);
				System.out.print("  Umiejêtnoœci magiczne: " + hero.mag + "\n");
				System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
			}
		}
		else if(hero.lvl == 3){
			if(hero.xp >= 10) {
				hero.lvl++;
				hero.xp = 1;
				hero.hp++;
				if(hero.nameClass == "wojownik") {
					hero.str++;
				}
				else if(hero.nameClass == "mag") {
					hero.will++;
				}
				System.out.print("GRATULACJE. Zdoby³eœ poziom " + hero.lvl + "\n" );
				System.out.print("Twoje staty: \n");
				System.out.print("Si³a: " + hero.str);
				System.out.print("  Zrêcznoœæ: " + hero.agi + "\n");
				System.out.print("Si³a woli: " + hero.will);
				System.out.print("  Umiejêtnoœci magiczne: " + hero.mag + "\n");
				System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
			}
		}
		else if(hero.lvl == 15){
			if(hero.xp >= 5) {
				hero.lvl++;
				hero.xp = 1;
				hero.hp++;
				if(hero.nameClass == "wojownik") {
					hero.str++;
				}
				else if(hero.nameClass == "mag") {
					hero.will++;
				}
				System.out.print("GRATULACJE. Zdoby³eœ poziom " + hero.lvl + "\n" );
				System.out.print("Twoje staty: \n");
				System.out.print("Si³a: " + hero.str);
				System.out.print("  Zrêcznoœæ: " + hero.agi + "\n");
				System.out.print("Si³a woli: " + hero.will);
				System.out.print("  Umiejêtnoœci magiczne: " + hero.mag + "\n");
				System.out.print("¯ywotnoœæ: " + hero.hp + "\n\n");
			}
		}
		
	}

}
