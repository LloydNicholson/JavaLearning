
public class Room {
	private TV theTV;
	private Door theDoor;
	private Chair theChair;
	
	public Room(TV theTV, Door theDoor, Chair theChair) {
		this.theTV = theTV;
		this.theDoor = theDoor;
		this.theChair = theChair;
	}
	
	public void setTVRes(int width, int height) {
		theTV.getNativeResolution().changeScreenResolution(width, height);
	}
	
	public void varnishDoor() {
		System.out.println("Room -> Must varnish door");
		theDoor.varnish();
	}
	
	public TV getTheTV() {
		return theTV;
	}

	public Door getTheDoor() {
		return theDoor;
	}

	public Chair getTheChair() {
		return theChair;
	}


}
