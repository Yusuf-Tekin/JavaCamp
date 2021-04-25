package Example2;

public class Main {

	public static void main(String[] args) {
		
		
		ButtonManager btnManager = new ButtonManager();
		
		Button btn1 = new Button(1, "Bitir ve devam et");
		btnManager.SingleClick(btn1);
		
		
		Button btn2 = new Button(2,"Kamp yoklamsý al!!");
		btnManager.DoubleClick(btn2);
		
		
		
		
		
		
	}
}
