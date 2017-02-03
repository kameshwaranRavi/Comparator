package com.full.internssorting;

import java.util.Comparator;

public class DateComparator implements Comparator<Intern> {

	public int compare(Intern internOne, Intern internTwo) {

		return internOne.doj.compareTo(internTwo.doj);

	}

}
