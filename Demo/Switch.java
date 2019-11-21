package Demo;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner word = new Scanner(System.in);
		System.out.println("Enter");
		String text = word.nextLine();
		switch (text) {
		case "a":
		case "A":
			System.out.println("You order BayChha");
			break;
		case "b":
		case "B":
			System.out.println("You order Ice Tea");
			break;
		case "c":
		case "C":
			System.out.println("You order Soup");
			break;
			default:
				System.out.println("Out of order");
				break;
		}
		
	}

}
