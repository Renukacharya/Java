package org.account;
//This is written by Mr. Developer 
public class ProcessBetterAccounts {
	
	public static void main(String args[]) {
		BetterAccount anAccount;
		
		for(int i=0; i<3; i++) {
			anAccount = new BetterAccount();
			anAccount.fillWithData();
			anAccount.display();
		}
	}

}
