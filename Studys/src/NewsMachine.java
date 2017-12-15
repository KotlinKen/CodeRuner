import java.util.ArrayList;

public class NewsMachine implements Publisher{
	private ArrayList<Observer> observers;
	private String title;
	private String news; 
	
	
	
	NewsMachine(){
		observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}



	@Override
	public void delete(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}



	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(title, news);
		}
		
	}
	
	
	
	public void setNewsInfo(String title, String news) {
		this.title = title;
		this.news = news;
		notifyObserver();
	}
	
	public String getTitle() {
		return title;
	}
	public String getNews(){
		return news;
	}
	
	public static void main(String[] args) {
		String a ="aaa";
		String b = "aaa";
		
		
		System.out.println(a==b);
		
 
 
			
 
	}
	

}


class Outer {
	Outer(){
		
	}
	
	class Inner{
		int ivs = 100;
		
	}
	public static class sInner{
		int iv = 200;
	}
}