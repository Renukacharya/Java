package org.hello;

import java.text.NumberFormat;
import java.util.Scanner;

public class BetterProcessData {
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		double unitPrice;
		int quantity;
		boolean taxable;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.print("Unit Price:  ");
		unitPrice = keyboard.nextDouble();
		System.out.print("Quantity:  ");
		quantity = keyboard.nextInt();
		System.out.print("Taxable? (true/false)  ");
		taxable = keyboard.nextBoolean();
		
		double total = unitPrice * quantity;
		if(taxable) {
			total = total * 1.05;
		}
		
		String niceTotal = currency.format(total);
		System.out.print("Total:  ");
		System.out.println(niceTotal);
		
		keyboard.close();
	}
}
