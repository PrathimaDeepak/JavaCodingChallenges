package visitMeHere;

public class FizzBuzzChallenge {
	
	public static void main(String args[]) {
		int i;
		for(i=1; i<=100; i++ ) {
			outputFizzBuzz(i);
		}
	}
	
//	public static void outputFizzBuzz(int number) {
//		if(number % 3 == 0 && number % 5 == 0) {
//			System.out.println("Fizz-Buzz");
//		}else if(number % 3 == 0) {
//			System.out.println("Fizz");
//		}else if(number % 5 == 0) {
//			System.out.println("Buzz");
//		}else  {
//			System.out.println(number);
//		} 
//	}
	
//	public static void outputFizzBuzz(int number) {
//		if(number % 3 == 0 || number % 5 == 0) {
//			if(number % 3 == 0 && number % 5 == 0) {
//				System.out.println("Fizz-Buzz");
//			}else if(number % 3 == 0) {
//				System.out.println("Fizz");
//			}else if(number % 5 == 0) {
//				System.out.println("Buzz");
//			}
//		}else {
//			System.out.println(number);
//		}
//	}
	
	public static void outputFizzBuzz(int number) {
		if(number%15==0) {
			System.out.println("Fizz-Buzz");
		}else if(number % 3 == 0) {
			System.out.println("Fizz");
		}else if(number % 5 == 0) {
			System.out.println("Buzz");
		}else  {
			System.out.println(number);
		} 
	}

}
