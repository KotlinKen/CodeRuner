
public class MainBoard {
	
	public static void main(String[] args) {
			
 
			NewsMachine nm = new NewsMachine();
			
			
			Group gp = new Group();
			
			gp.setName(nm);
			
			nm.SetBook("tt", "ss");
			nm.notifyObserver();
			
			
			
			
	}

}
