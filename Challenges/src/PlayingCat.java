
public class PlayingCat {

	public static void main(String[] args) {
		
		boolean isPlaying = isCatPlaying(true, 46);
		System.out.println(isPlaying);
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean isPlaying = false;
		int minTemperature = 25;
		int maxTemperature = 35;
		
		if (summer) {
			maxTemperature = 45;
		}
		
		if (temperature >= minTemperature && temperature <= maxTemperature) {
			isPlaying = true;
		}
		
		return isPlaying;
	}
}
