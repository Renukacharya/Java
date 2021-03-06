package org.account;
//Mr. Developer
import java.util.Random;
import java.text.NumberFormat;
import static java.lang.System.out;

public class BetterAccount {
	String lastName;
	int id;
	double balance;
	void fillWithData() {
		Random myRandom = new Random();
		
		lastName = "  " +
					(char)(myRandom.nextInt(26) + 'A') +
					(char)(myRandom.nextInt(26) + 'a') +
					(char)(myRandom.nextInt(26) + 'a');
		
		id = myRandom.nextInt(1000);
		balance = myRandom.nextInt(100000);
	}
	void display() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		out.print("The account with last name: ");
		out.print(lastName);
		out.print(" and ID number ");
		out.print(id);
		out.print(" has balance ");
		out.println(currency.format(balance));
	}

}
