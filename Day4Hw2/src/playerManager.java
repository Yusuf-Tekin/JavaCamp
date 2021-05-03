
public abstract class playerManager implements IPlayer{
	
	@Override
	public void addBalance(Player player,double amount) {
		
		player.setBalance(amount);
		System.out.println(player.getUsername() + " adlý oyuncunun hesabýna " + amount + " bakiye eklendi");
		
	}
	
	@Override
	public void updateUsername(Player player,String newUsername) {
		
		player.setUsername(newUsername);
		System.out.println("Kullanýcý adýnýz güncellendi");
		
	}
	
	@Override
	public void updatePassword(Player player,String newPassword) {
		player.setPassword(newPassword);
		System.out.println("Hesap parolanýz güncellendi");
	}

}
