
public class Game {

	private int id;
	private String gameName;
	private double price;
	private Campaing campaing = null;
	
	public Game(int id,String gameName,double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Campaing getCampaing() {
		return campaing;
	}

	public void setCampaing(Campaing campaing) {
		this.campaing = campaing;
		if(campaing != null) {
			System.err.println("Ýndirim uygulandý");
			this.price = price - (price*campaing.getDiscount())/100;
		}
		else {
			this.price = price;
		}
	}

	
	
}
