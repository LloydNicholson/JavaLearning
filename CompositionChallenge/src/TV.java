
public class TV {

	private String make;
	private int soundQuality;
	private int weight;
	
	private Resolution nativeResolution;

	public TV(String make, int soundQuality, int weight, Resolution nativeResolution) {
		this.make = make;
		this.soundQuality = soundQuality;
		this.weight = weight;
		this.nativeResolution = nativeResolution;
	}

	public String getMake() {
		return make;
	}

	public int getSoundQuality() {
		return soundQuality;
	}

	public int getWeight() {
		return weight;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	
}
