package avengers;

public class Timeline {

	public static void main(String args[]) {
		Avengers avengers = new Avengers();
		BlackTeam blackteam = new BlackTeam();
		
		
		Ironman iron = new Ironman(blackteam); //아이언맨 객체에 어벤져스 객체 추가
		iron.teamSet(blackteam);
		CatainAmerica ca = new CatainAmerica(avengers);
		Vision vi = new Vision();
		
		
		
		avengers.setStat(EnemyStatus.NONE);
		avengers.setStat(EnemyStatus.ATTACK);
		
		
		avengers.getMemberCount();
		blackteam.getMemberCount();		
		
		
		
		
		
		
		
	}
}
