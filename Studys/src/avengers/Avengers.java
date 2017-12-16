package avengers;

import java.util.LinkedList;
import java.util.List;

public class Avengers implements Subject{
	private List<Observer> heros;
	private EnemyStatus estat;
	
	
	public Avengers(){
		System.out.println("어벤져스 그룹 생성");
		heros = new LinkedList<Observer>();
		
		//어벤져스 인스턴스 생성시 영웅 생성시 객체를 담아줄 영웅들 리스트 생성 됨 1번 생성
	}
	
 
	public void add(Observer observer) {
		heros.add(observer);

		
	}
 
	public void remove(Observer observer) {
		if(heros.contains(observer)) {
			heros.remove(observer);
		}
	}
 
	public void notifyObserver() {
		for(Observer hero : heros) {
			hero.update(estat);
			
		}
		
	}
	
	public void setStat(EnemyStatus estat) {
		this.estat = estat;
		notifyObserver();
	}
	
	public void getMembers(){
		System.out.println(this.heros);
	}

	public void getMemberCount() {
		System.out.println(heros.size());
	}

	@Override
	public void what() {
 
		
	}
	

}
