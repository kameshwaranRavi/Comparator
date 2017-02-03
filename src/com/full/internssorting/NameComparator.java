package com.full.internssorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Intern> {

	public int compare(Intern internOne, Intern internTwo) {

		return internOne.name.compareTo(internTwo.name);
	}

}
