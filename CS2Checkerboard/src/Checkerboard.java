public class Checkerboard {

	public static void main(String args[]) {
		printCheckerboard(7);
	}

	public static void printCheckerboard(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println("#o#o#o#");
			} 
			
			else {
				System.out.println("o#o#o#o");
			}
		}
	}
}
