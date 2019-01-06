
public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		boolean isLeap = isLeapYear(2000);
		System.out.println(isLeap);
		System.out.println(getDaysInMonth(2, 1700));

	}

	public static boolean isLeapYear(int year) {
		boolean isAleapYear = false;
		if (year >= 1 && year <= 9999) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				isAleapYear = true;
			}
		}
		return isAleapYear;
	}

	public static int getDaysInMonth(int month, int year) {
		int daysInMonth = 31;

		if (month < 1 || month > 12) {
			return -1;
		}

		if (year < 1 || year > 9999) {
			return -1;
		}

		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			daysInMonth = 31;
			break;
		case 2: 
			if (isLeapYear(year)) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
			break;
		case 4:case 6:case 9:case 11:
			daysInMonth = 30;
			break;
		default:
			break;
		}


		return daysInMonth;
	}

}
