
public class FindNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int number= 5;
		boolean isThere = false ;
		
		for (int num : numbers) {
			if(num == number) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("There is the number");
		}else {
			System.out.println("There is not the number");
		}

	}

}
