package com.acme.domain;

public class Bank {
	public static void main(String[] args) {

		Account myAcct = new Account();

		double proposedLoan = 250.00;

		String customerName = "Jason Shipiro";

		//discountLoan(proposedLoan);
		proposedLoan = discountLoan(proposedLoan);
		System.out.println(proposedLoan);

		debitFee(myAcct);
		System.out.println(myAcct.balance);

		salutation(customerName);
		System.out.println(customerName);
	}

	// correct way to do it
	public static double discountLoan(double x) {
		return x = x * 0.95;
	}

//	public static void discountLoan(double x) {
//		x = x * 0.95; // 237.50
//	}

	public static void debitFee(Account acct) {
		acct.balance = acct.balance - 2.50; // 97.,50
	}

	public static void salutation(String aName) {
		aName = "Dear " + aName; // Dear Jason Shapiro
	}

}
