package avengers;

public class Vision implements Observer, Heros{
	
	Vision(){
		System.out.println("���� �⵿");
		
	}
	
	Vision(Subject team){
		System.out.println("���� �⵿");
		team.add(this);
	}
	

	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
		
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("���� : �����"); break;
		case APPEAR : System.out.println("����  : ������ ��������"); break;
		case ATTACK : System.out.println("����  : ȿ�� ����"); break;
		case DISAPPEAR : System.out.println("����  :  ������ ��������"); break;
		}
		
	}

	
	
}
