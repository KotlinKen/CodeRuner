package avengers;

public class Ironman implements Observer, Heros{
	
	Ironman(){}
	
	Ironman(Subject team){
		System.out.println("아이언맨 합류 "+team);
		team.add(this);
		//히어로
	}

	public void teamSet(Subject team) {
		System.out.println("아이언맨"+ team+ "합류");
			team.add(this);
	}
	
 
	
	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("아이언맨 : 대기중"); break;
		case APPEAR : System.out.println("아이언맨 : 슈트착용"); break;
		case ATTACK : System.out.println("아이언맨 : 해킹 전투 불능"); break;
		case DISAPPEAR : System.out.println("아이언맨 : 슈트해제"); break;
		}
		
	}

 
	
	
}
