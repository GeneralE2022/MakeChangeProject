package com.stilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		double itemPrice;
		double cashPaid;
		double totalChange;
		double twenties = 0;
		double tens = 0;
		double fives = 0;
		double ones = 0;
		double quarters = 0;
		double dimes = 0;
		double nickels = 0;
		double pennies = 0;

		/*
		 * User Story #1 The user is prompted asking for the price of the item.
		 * 
		 * User Story #2 The user is then prompted asking how much money was tendered by
		 * the customer.
		 * 
		 * User Story #3 Display an appropriate message if the customer provided too
		 * little money or the exact amount.
		 * 
		 * User Story #4 If the amount tendered is more than the cost of the item,
		 * display the number of bills and coins that should be given to the customer.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the item price.");
		itemPrice = scanner.nextDouble();
		System.out.println("Enter the price paid by the customer.");
		cashPaid = scanner.nextDouble();

		totalChange = (cashPaid - itemPrice);

		if (totalChange < 0) {
			System.out.println("Not enough.");
		} else if (cashPaid == itemPrice) {
			System.out.println("Exactly enough. No change needed.");
		} else {

			System.out.println("Your exact change of " + totalChange + " will be tendered as follows: ");

			while (totalChange > 20) {
				totalChange = totalChange - 20;
				twenties++;
			}

			while (totalChange > 10) {
				totalChange = totalChange - 10;
				tens++;
			}

			while (totalChange > 5) {
				totalChange = totalChange - 5;
				fives++;
			}

			while (totalChange > 1) {
				totalChange = totalChange - 1;
				ones++;
			}

			while (totalChange > 0.25) {
				totalChange = totalChange - 0.25;
				quarters++;
			}

			while (totalChange > 0.1) {
				totalChange = totalChange - 0.1;
				dimes++;
			}

			while (totalChange > 0.05) {
				totalChange = totalChange - 0.05;
				nickels++;
			}

			while (totalChange >= 0) {
				totalChange = totalChange - 0.01;
				pennies++;
			}
		}

		if (twenties != 0) {
			System.out.println(twenties + " twenties");
		}
		if (tens != 0) {
			System.out.println(tens + " tens");
		}
		if (fives != 0) {
			System.out.println(fives + " fives");
		}
		if (ones != 0) {
			System.out.println(ones + " ones");
		}
		if (quarters != 0) {
			System.out.println(quarters + " quarters");
		}
		if (dimes != 0) {
			System.out.println(dimes + " dimes");
		}
		if (nickels != 0) {
			System.out.println(nickels + " nickels");
		}
		if (pennies != 0) {
			System.out.println(pennies + " pennies");
		}

	}
}
