package avengers;

import java.util.LinkedList;
import java.util.List;

public class BlackTeam implements Subject{
	
	private List<Observer> heros;
	private EnemyStatus stat;
	
	BlackTeam(){
		heros = new LinkedList<Observer>();
	}
	
	@Override
	public void add(Observer observer) {
		heros.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		if(heros.contains(observer)) {
			heros.remove(observer);
		}
		
	}

	@Override
	public void notifyObserver() {
		for(Observer hero : heros) {
			hero.update(stat);
		}
		
	}
	
	public List<Observer> getMembers(){
		return this.heros;
		
	}
	
	public void getMemberCount() {
		System.out.println(heros.size());
	}
	@Override
	public void what() {
		// TODO Auto-generated method stub
		
	}

}
