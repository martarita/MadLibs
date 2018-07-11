
import java.util.Scanner;
public class MidLibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String color = "";
		System.out.println("Please write a color name");
		color = scan.next();
		String pastTenseVerb = "";
		System.out.println("Please write a past tense verb");
		pastTenseVerb = scan.next();
		String adjective = "";
		System.out.println("Please write an adjective");
		adjective = scan.next();
		String noun = "";
		System.out.println("Please write a noun");
		noun = scan.next();
		
		System.out.print("The " + color + " dragon " + pastTenseVerb + " at the "+ adjective);
		System.out.println(" knigt, who rode on a sturdy, giant " + noun+"." );
		
		
	}

}
