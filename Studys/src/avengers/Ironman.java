package avengers;

public class Ironman implements Observer, Heros{
	
	Ironman(){}
	
	Ironman(Subject team){
		System.out.println("���̾�� �շ� "+team);
		team.add(this);
		//�����
	}

	public void teamSet(Subject team) {
		System.out.println("���̾��"+ team+ "�շ�");
			team.add(this);
	}
	
 
	
	@Override
	public void update(EnemyStatus estat) {
		this.behavior(estat);
	}

	@Override
	public void behavior(EnemyStatus estat) {
		switch(estat) {
		case NONE : System.out.println("���̾�� : �����"); break;
		case APPEAR : System.out.println("���̾�� : ��Ʈ����"); break;
		case ATTACK : System.out.println("���̾�� : ��ŷ ���� �Ҵ�"); break;
		case DISAPPEAR : System.out.println("���̾�� : ��Ʈ����"); break;
		}
		
	}

 
	
	
}
