import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 11; i++) {
			intArrayList.add(Integer.valueOf(i));
		}
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		
		Integer myIntValue = 56;
		int value = myIntValue.intValue();
		
		System.out.println(value);
		
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for (double dbl = 0.0; dbl <= 10.0; dbl+=0.5) {
			myDoubleValues.add(Double.valueOf(dbl));
		}
		
		for (int i = 0; i < myDoubleValues.size(); i++) {
			double dblValue = myDoubleValues.get(i).doubleValue();
			System.out.println(i + " --> " + dblValue);
		}
		
		double thirdIndex = myDoubleValues.get(3).doubleValue();
		System.out.println(thirdIndex);
		
		System.out.println(myDoubleValues);
		
	}
	

}
