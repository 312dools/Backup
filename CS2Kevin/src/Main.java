public class Main {

	public static void main(String args[]) {
		//GitHub test
		double unlearned = 100; //Percent
		double learned = 0; //Percent
		int months = 0;
		
		while(learned < 95) {
			learned += .1 * unlearned;
			unlearned -= .1 * unlearned;
			months++;
		}
		
		int years = 0;
		years += (months/12);
		months %= 12;
		
		System.out.println("Time to learn: " + years + " years, " + months + " months");
	}
}
