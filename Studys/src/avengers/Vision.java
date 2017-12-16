package avengers;

public class Vision implements Observer, Heros{
	
	Vision(){
		System.out.println("비젼 출동");
		
	}
	
	Vision(Subject team){
		System.out.println("비젼 출동");
		team.add(this);
	}
	

	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
		
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("비전 : 대기중"); break;
		case APPEAR : System.out.println("비전  : 유니폼 방패착용"); break;
		case ATTACK : System.out.println("비전  : 효과 막음"); break;
		case DISAPPEAR : System.out.println("비전  :  유니폼 방패해제"); break;
		}
		
	}

	
	
}
