import java.util.*;

public class PopMexico {
	private static final double startingPop = 123.8;
	private static final double growthRate = 0.005;
	private static final int startingYear = 2014;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired population (in millions)");
		double desiredPop = sc.nextDouble();
		double currentPop = startingPop;
		int numYears = 0;
		while(desiredPop > currentPop) {
			currentPop *= (1.0+growthRate);
			numYears++;
		}
		System.out.println(startingYear+numYears);
	}
	
	
}
