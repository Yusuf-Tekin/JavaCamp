import java.util.ArrayList;

public abstract class SignUpManager implements IS�ngUp {
	
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	@Override
	public boolean DataIsEmptyControl(Player player) {
		if(player.getUsername().equals("") || player.getPassword().equals("") || player.getEmail().equals("")) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void SignUp(Player player) {
		if(!DataIsEmptyControl(player)) {
			System.err.println("Kay�t Ba�ar�s�z... Eksik bilgileri doldurun");
		}
		else {
			System.out.println(player.getUsername() + " olarak sisteme kay�t oldunuz.");
			players.add(player);
		}
	}
	
	@Override
	public boolean isUserRegistered(Player player) {
		
		if(players.indexOf(player) != -1) {
			return true;
		}
		else {
			return false;
		}
	}

}
