
public class Main {
	
	public static void main(String[] args) {
		
		Campaing campaing1 = new Campaing(1, "Yýlbaþý Ýndirimi", 10);
		Game gtaV = new Game(1, "GTA5", 100);
		GameManager gameManager = new GameManager();
		
		
		Player player1 = new Player(1,"yusuftekinx", "123456","yusuf@gmail.com"); // Registered Player
		player1.setBalance(120); // Satýn alýndý.Oyun fiyatý 100 ve kalan bakiye 100
		Player player2 = new Player(2, "engindemirog", "123456", "engindemirog@gmail.com"); // Not Registered Player
		
		
		SignUp signUp = new SignUp();		
		signUp.SignUp(player1);
		
		
		gameManager.buy(gtaV, player1,signUp);
		
		
		
		
		
		
	}

}
