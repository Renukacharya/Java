import java.util.Scanner;
import static java.lang.System.out;

public class CheckPassword {
	
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	String password = "Charya";
	String userInput;
	
	out.print("What's the password?  ");
	userInput = keyboard.next();
	
	if(password.equals(userInput) ) {
		out.println("You're Okay");
		
	} else {
		out.println("You're Menace.");
	}
	
	keyboard.close();
	}
}
