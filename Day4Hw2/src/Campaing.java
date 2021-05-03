
public class Campaing{
	private int id;
	private String title;
	private int discount;
	
	
	
	
	public Campaing(int id, String title, int discount) {
		super();
		this.id = id;
		this.title = title;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
