import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		ITelephone lloydsPhone;
		lloydsPhone = new DeskPhone(123456);
		lloydsPhone.powerOn();
		lloydsPhone.callPhone(123456);
		lloydsPhone.answer();
		
		lloydsPhone = new MobilePhone(202333);
		lloydsPhone.powerOn();
		lloydsPhone.callPhone(202333);
		lloydsPhone.answer();
		
	}
	

	
}
	
	
