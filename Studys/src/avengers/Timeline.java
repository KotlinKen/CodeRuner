package avengers;

public class Timeline {

	public static void main(String args[]) {
		Avengers avengers = new Avengers();
		BlackTeam blackteam = new BlackTeam();
		
		
		Ironman iron = new Ironman(blackteam); //���̾�� ��ü�� ����� ��ü �߰�
		iron.teamSet(blackteam);
		CatainAmerica ca = new CatainAmerica(avengers);
		Vision vi = new Vision();
		
		
		
		avengers.setStat(EnemyStatus.NONE);
		avengers.setStat(EnemyStatus.ATTACK);
		
		
		avengers.getMemberCount();
		blackteam.getMemberCount();		
		
		
		
		
		
		
		
	}
}
