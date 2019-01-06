import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MessingAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		JLabel label = new JLabel();
		label.setText("Hello");
		
		window.setTitle("My window");
		window.setVisible(true);
		window.setSize(500, 500);
		window.add(label);

		String name = "Lloyd";
		
		int[] values = {1, 2, 3, 2122, 31223, 2122};
		ArrayList<Integer> otherNames = new ArrayList<Integer>();
		
		for (int i=0; i<values.length; i++) {
			otherNames.add(values[i]);
		}
		
		System.out.println(otherNames);
		
		StringBuilder sentence = new StringBuilder();
		String myName = name.substring(2, 4);
		sentence.append(myName + window.getTitle() + label.getText());
		
		System.out.println(sentence.toString());
	}
	
}
