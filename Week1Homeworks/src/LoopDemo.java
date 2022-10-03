
public class LoopDemo {

	public static void main(String[] args) {
		//For
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("The for loop is finished");
		
		//While
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("The while loop is finished");
		
		// Do while 
		int j = 2;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("The do-while loop is finished");
	}

}
