
public class Door {
	private String type;
	private int width;
	private int height;
	
	public Door(String type, int width, int height) {
		this.type = type;
		this.width = width;
		this.height = height;
	}

	public void varnish() {
		System.out.println("Door -> Varnishing door");
	}
	
	public String getType() {
		return type;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}