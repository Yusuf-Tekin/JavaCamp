
public class GameManager implements IGame{

	@Override
	public void buy(Game game, Player player,SignUpManager signUpManager) {
		
		if(signUpManager.isUserRegistered(player)) {
			if(player.getBalance() < game.getPrice()) {
				System.out.println("Yeterisiz bakiye");
			}
			else {
				player.setBalance(player.getBalance() - game.getPrice());
				System.out.println(player.getUsername() + " taraf�ndan oyun sat�n al�nd�. Kalan Bakiye: " + player.getBalance());
			}
		}
		else {
			System.err.println("Oyuncu kayd� bulunamad�");
			
		}
		
	}

}
