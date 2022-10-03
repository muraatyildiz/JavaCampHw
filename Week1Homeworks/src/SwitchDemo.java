
public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Great! You passed.");
			break;
		case 'B':
			System.out.println("Grand! You passed.");
			break;
		case 'C':
			System.out.println("Good! You passed.");
			break;
		case 'D':
			System.out.println("Okay! You passed.");
			break;
		case 'F':
			System.out.println("Sorry! You failed.");
			break;
		default:
			System.out.println("Undefined");
		}

	}

}
