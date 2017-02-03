package com.full.internssorting;

import java.util.Comparator;

class AgeComparator implements Comparator<Intern> {

	public int compare(Intern internOne, Intern internTwo) {
		if (internOne.age == internTwo.age)
			return 0;
		else if (internOne.age < internTwo.age)
			return 1;
		else
			return -1;
	}
}
