package avengers;

public class CatainAmerica implements Observer, Heros{
	
	CatainAmerica(){
	}
	
	CatainAmerica(Avengers team){
		System.out.println("ĸƾ�Ƹ޶�Ű  �շ�");
		team.add(this);
	}
	

	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
		
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("�Ƹ޸�ī : �����"); break;
		case APPEAR : System.out.println("�Ƹ޸�ī  : ������ ��������"); break;
		case ATTACK : System.out.println("�Ƹ޸�ī  : ȿ�� ����"); break;
		case DISAPPEAR : System.out.println("�Ƹ޸�ī  :  ������ ��������"); break;
		}
		
	}

	
	
}
