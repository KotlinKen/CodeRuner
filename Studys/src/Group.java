
public class Group implements Observer{
	
	
	
	public void setName(Publisher publisher) {
		publisher.add(this);
	}

	@Override
	public void notification(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String title, String news) {
		System.out.println("관리자가 변경 하래");
	}
		
 
 
}
