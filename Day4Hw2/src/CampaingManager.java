import java.util.ArrayList;

public abstract class CampaingManager implements ICampaing{
	
	ArrayList<Campaing> campaings = new ArrayList<Campaing>();
	
	@Override
	public void campaingCreate(Campaing campaing) {
		campaings.add(campaing);
		System.out.println("Kampanya Oluþturuldu");

	}
	
	@Override
	public void campaingUpdate(Campaing campaing,String title,int discount) {
		campaings.remove(campaing);
		
		campaing.setTitle(title);
		campaing.setDiscount(discount);
		
		campaings.add(campaing);
		
		System.out.println("Kampanya Güncellendi");

	}
	
	@Override
	public void campaingDelete(Campaing campaing) {
		campaings.remove(campaing);
	}

}
