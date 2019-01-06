
public class FlourPacker {

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(4, 18, 19));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(0, 3, 4));
		System.out.println(canPack(0, 5, 4));

	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		boolean canPack = false;
		
		int bigFlourBag = bigCount * 5;
		int smallFlourBag = smallCount * 1;
		
		if (bigFlourBag + smallFlourBag >= goal && bigFlourBag % goal == 0) {
			canPack = true;
		} 
		
		return canPack;
	}

}
