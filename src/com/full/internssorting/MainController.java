package com.full.internssorting;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		Sort sort = new Sort();
		System.out.println("Enter Age or Name or DOJ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		input.close();

		switch (value) {
		case "Age":
			sort.byAge();
			break;
		case "Name":
			sort.byName();
			break;
		case "DOJ":
			sort.byDOJ();
			break;
		default:
			System.out.println("Try Again by Entering Age or Name or DOJ");
		}
	}
}
