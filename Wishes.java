package com.codegnan.controlstatements;

import java.util.Scanner;

public class Wishes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter city name : ");
		String city = scanner.next();
		if (city.equalsIgnoreCase("hyderabad")) {
			System.out.println("Hello Hyderabadi.... Adaab..");
		} else {
			if (city.equalsIgnoreCase("banglore")) {
				System.out.println("Hello Kannadiga... Namaskara");
			} else {
				if (city.equalsIgnoreCase("chennai")) {
					System.out.println("Hello Madrasi... Vanakkam..");
				} else {
					System.out.println("plese enter valid city name");
				}
			}
		}

	}

}// positve or negative or zero.
// talktime less than 100 minutes basic plan talktime >100 and <300 
// standsard plan >300 and<500 premiumj plan >500 unlimited plan.
