
public class Resolution {
	private int height;
	private int width;
	private String screenQuality;
	
	public Resolution(int height, int width, String screenQuality) {
		this.height = height;
		this.width = width;
		this.screenQuality = screenQuality;
	}
	
	public void changeScreenResolution(int height, int width) {
		System.out.println("New res height is " + height + "px New res width is " + width + "px");
	}
	
	public void changeQuality(String screenQuality) {
		System.out.println("New screen quality is " + screenQuality);
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getScreenQuality() {
		return screenQuality;
	}
	
	
	
}
