import java.util.ArrayList;

public abstract class CampaingManager implements ICampaing{
	
	ArrayList<Campaing> campaings = new ArrayList<Campaing>();
	
	@Override
	public void campaingCreate(Campaing campaing) {
		campaings.add(campaing);
		System.out.println("Kampanya Olu�turuldu");

	}
	
	@Override
	public void campaingUpdate(Campaing campaing,String title,int discount) {
		campaings.remove(campaing);
		
		campaing.setTitle(title);
		campaing.setDiscount(discount);
		
		campaings.add(campaing);
		
		System.out.println("Kampanya G�ncellendi");

	}
	
	@Override
	public void campaingDelete(Campaing campaing) {
		campaings.remove(campaing);
	}

}
