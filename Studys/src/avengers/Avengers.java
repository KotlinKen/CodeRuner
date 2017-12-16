package avengers;

import java.util.LinkedList;
import java.util.List;

public class Avengers implements Subject{
	private List<Observer> heros;
	private EnemyStatus estat;
	
	
	public Avengers(){
		System.out.println("����� �׷� ����");
		heros = new LinkedList<Observer>();
		
		//����� �ν��Ͻ� ������ ���� ������ ��ü�� ����� ������ ����Ʈ ���� �� 1�� ����
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
