
public class MiniProjectPrimeNumber {

	public static void main(String[] args) {
		int number = 3;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("The number is not a prime number");
			return;
		}
		
		if(number < 1) {
			System.out.println("Invalid number");
			return;
		}
		
		for (int i = 2 ; i < number; i++) {
			if(number % i == 0 ) {
				isPrime= false;
			}
		}
		
		if(isPrime) {
			System.out.println("The number is a prime number");
		}else {
			System.out.println("The number is not a prime number");
		}
	}

}
