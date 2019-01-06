
public class Main {

	public static void main(String[] args) {
		Chair theChair = new Chair("Leather", 10);
		
		Resolution nativeResolution = new Resolution(2000, 1200, "HD");
		TV theTV = new TV("Samsung", 10, 20, nativeResolution);
		
		System.out.println(nativeResolution.getScreenQuality());
		System.out.println(theTV.getMake());

		Door theDoor = new Door("Wood", 100, 300);
		Room theRoom = new Room(theTV, theDoor, theChair);
		
		theTV.getNativeResolution().changeScreenResolution(20000, 10000);
		
		System.out.println(theChair.getUpholstery());
		
		System.out.println(theChair.getTheNumberOfChairs());
		System.out.println(theDoor.getHeight() + "cm");
		
		System.out.println();
		theRoom.varnishDoor();
		
		System.out.println();
		theTV.getNativeResolution().changeQuality("4K");
		
		System.out.println(theRoom.getTheChair().getTheNumberOfChairs());
		System.out.println(theRoom.getTheDoor().getWidth());
	}
	
	

}
