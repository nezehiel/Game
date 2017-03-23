package Game;

class Villan {
	String name;
	
	int str;
	int agi;
	int will;
	int mag;
	int hp;
	int xp;
}

class Wolf extends Villan {
	Wolf() {
		name = "wilk";
		
		str = 3;
		agi = 3;
		will = 2;
		mag = 1;
		hp = 4;
		xp = 2;
	}
}

class Bandit extends Villan {
	//int str = 3;
	//int agi = 4;
	//int will = 3;
	//int mag = 2;
	//int hp = 5;
	
	Bandit(){
		name = "bandyta";
		
		str = 3;
		agi = 4;
		will = 3;
		mag = 2;
		hp = 3;
		xp = 3;
	}
}

class BanditKing extends Villan {
	BanditKing() {
		name = "król bandytów";
		
		str = 5;
		agi = 5;
		will = 4;
		mag= 3;
		hp = 10;
		xp = 5;
	}
}

class Bear extends Villan {
	Bear() {
		name = "niedzwiedz";
		
		str = 6;
		agi = 4;
		will = 3;
		mag = 2;
		hp = 9;
		xp = 4;
	}
}

public class Enemy {
}
