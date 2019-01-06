
public class SecondToMinutes {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	public static void main(String[] args) {
		System.out.println(getDurationString(678, 61));
		System.out.println(getDurationString(7000));
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		} 
		
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;

		String hoursString = hours + "h";
		if (hours < 10) {
			hoursString = "0" + hoursString;
		} 
		
		String minutesString = remainingMinutes + "m";
		if (remainingMinutes < 10) {
			minutesString = "0" + minutesString;
		} 
		
		String secondsString = seconds + "s";
		if (seconds < 10) {
			secondsString = "0" + secondsString;
		} 
		
		String durationString = hoursString + minutesString + secondsString;
		
		
		return durationString;
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		String durationString = getDurationString(minutes, remainingSeconds);
		
		return durationString; 
		
	}
}
