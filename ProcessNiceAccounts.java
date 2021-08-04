package org.account;

import java.util.Random;
import java.util.Scanner;

public class ProcessNiceAccounts {
	public static void main (String args[]) {
		
		Random myRandom = new Random();
		NiceAccounts anAccount;
		double interestRate;
	
		for(int i=0; i<3; i++) {
			anAccount = new NiceAccounts();
		
			anAccount.lastName = "  " +
					(char)(myRandom.nextInt(26) + 'A') +
					(char)(myRandom.nextInt(26) + 'a') +
					(char)(myRandom.nextInt(26) + 'a');
		
			anAccount.id = myRandom.nextInt(1000);
			anAccount.balance = myRandom.nextInt(100000);
		
			anAccount.display();
		
			interestRate = myRandom.nextInt(5);
			anAccount.addInterest(interestRate);
		
			anAccount.display();
			System.out.println();
	    }
	
	}
}
