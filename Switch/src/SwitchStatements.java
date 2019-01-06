
public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int switchValue = 6;
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2: 
			System.out.println("Value was 2");
			break;
			
		case 3: 
			System.out.println("Value was 3");
			break;
			
			// Shortcut below to add multiple checks for a value
		case 4: case 5: case 6:
			System.out.println("Was 4, 5 or 6");
			System.out.println("actually it was "+ switchValue);
			break;
		default:
			System.out.println("Value was out of range");
			break;
		}
	
		char character = 'C';
		switch (character) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
			System.out.println("C was found");
			break;
		case 'D':
			System.out.println("D was found");
			break;
		case 'E':
			System.out.println("E was found");	
			break;
		default:
			System.out.println("Not found");
			break;
		}
		
		String month = "FebruaRY";
		String lowerMonth = month.toLowerCase();
		switch (lowerMonth) {
		case "january":
			System.out.println(lowerMonth + " found");
			break;
		case "february":
			System.out.println(lowerMonth + " found");
			break;
		case "march": 
			System.out.println(lowerMonth + " found");
			break;
			
		default:
			System.out.println("No month found");
			break;
		}
		
		
		
		
		
	}

}
