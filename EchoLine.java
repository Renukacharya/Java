import java.util.Scanner;

public class EchoLine {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String lineIn;
		
		lineIn = keyboard.nextLine();
		System.out.print(lineIn);
		
		keyboard.close();
				
	}

}
