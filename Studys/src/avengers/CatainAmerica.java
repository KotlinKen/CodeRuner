package avengers;

public class CatainAmerica implements Observer, Heros{
	
	CatainAmerica(){
	}
	
	CatainAmerica(Avengers team){
		System.out.println("캡틴아메라키  합류");
		team.add(this);
	}
	

	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
		
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("아메리카 : 대기중"); break;
		case APPEAR : System.out.println("아메리카  : 유니폼 방패착용"); break;
		case ATTACK : System.out.println("아메리카  : 효과 막음"); break;
		case DISAPPEAR : System.out.println("아메리카  :  유니폼 방패해제"); break;
		}
		
	}

	
	
}
