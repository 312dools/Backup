import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cents = sc.nextInt();
		int numPos = 0;
		sc.close();

		for (int q = 0; q * 25 < cents; q++) {
			for (int d = 0; d * 10 < cents - q * 25; d++) {
				for (int n = 0; n * 5 < cents - (d * 10 + q * 25); n++) {
					// int p = cents-(d*10+q*25+n*5);
					// System.out.println("Quarters: " + q + " Dimes: " + d + "
					// Nickels: " + n + " Pennies: " + p);
					numPos++;
				}
			}
		}
		System.out.println("Number of Possible Combinations: " + numPos);

	}
}
