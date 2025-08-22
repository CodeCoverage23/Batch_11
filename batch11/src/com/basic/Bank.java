package com.basic;

import java.util.Scanner;

/**
 * Banking services
 */
public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		double balance = 0.0; // Local Variable

		while (true) {
			System.out.println("Select your choice : ");
			System.out.println("Press 1 for Balance check");
			System.out.println("Press 2 for Deposit Money");
			System.out.println("Press 3 for Withdraw Money");
			System.out.println("Press 4 for Exit");

			choice = sc.nextInt();

			// Use switch-case to perform choice base operations
			switch (choice) {
			case 1: {
				System.out.println("Your current balance is : " + balance + " Rs.");
				break;
			}
			case 2: {
				System.out.println("Enter the amount to deposit:");
				double amountToDeposit = sc.nextDouble();
				if (amountToDeposit > 0) {
					balance = balance + amountToDeposit;
					System.out.println("Amount deposited successfully.");
				} else {
					System.out.println("Invalid Amount, Provide more than 0");
				}
				break;
			}
			case 3: {
				System.out.println("Enter the amount to withdraw");
				double amountToWithdraw = sc.nextDouble();

				if (amountToWithdraw > 0 && balance >= amountToWithdraw) {
					balance = balance - amountToWithdraw;
					System.out.println("Amount withdraw successfully.");

				} else if (amountToWithdraw < 0) {
					System.out.println("Invalid Amount, Provide more than 0");
				} else {
					System.out.println("Insufficient Balance!");
				}

			}
				break;
			case 4: {
				System.out.println("Thank You for using bank service");
				return; // Exit
			}

			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Good Luck for next...................................");
		}
	}

}
