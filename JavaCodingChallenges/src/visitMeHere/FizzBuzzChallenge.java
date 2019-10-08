package visitMeHere;

/*
 * This is a Challenge from DZone
 * https://dzone.com/articles/code-challenge-series
 * 
 * I have not implemented in the shortest code but this is the most effective way I could think of.
 */

public class FizzBuzzChallenge {
	
	public static void main(String args[]) {
		int i;
		for(i=1; i<=100; i++ ) {
			if(i%15==0) {
				System.out.println("Fizz-Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else  {
				System.out.println(i);
			} 
		}
	}

}
