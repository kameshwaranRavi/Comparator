package com.full.internssorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

class Sort {
	ArrayList<Intern> arrayListObj = new ArrayList<Intern>();

	public void add() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Intern kamesh = new Intern("Kamesh", 23, format.parse("07/07/2016"));
			Intern bhasker = new Intern("Bhasker", 27, format.parse("09/29/2014"));
			Intern sai = new Intern("Sai", 27, format.parse("05/21/2015"));
			Intern saipavan = new Intern("Saipavan", 21, format.parse("06/20/2013"));
			Intern shaik = new Intern("Shaik", 25, format.parse("12/12/2013"));
			Intern karthik = new Intern("Karthik", 24, format.parse("12/12/2016"));

			arrayListObj.add(kamesh);
			arrayListObj.add(bhasker);
			arrayListObj.add(sai);
			arrayListObj.add(saipavan);
			arrayListObj.add(shaik);
			arrayListObj.add(karthik);
		} catch (ParseException e) {
		}
	}

	public void byAge() {

		System.out.println("<----- Sorting by Age ------>");
		System.out.println();

		add();
		Collections.sort(arrayListObj, new AgeComparator());
		for (Intern intern : arrayListObj) {
			System.out.println("Name-- " + intern.name + " " + "Age-- " + intern.age + " " + "DOJ-- " + intern.doj);
			System.out.println();
		}
	}

	public void byName() {

		System.out.println("<----- Sorting by Name ------>");
		System.out.println();

		add();
		Collections.sort(arrayListObj, new NameComparator());
		for (Intern intern : arrayListObj) {
			System.out.println("Name-- " + intern.name + " " + "Age-- " + intern.age + " " + "DOJ-- " + intern.doj);
			System.out.println();
		}
	}

	public void byDOJ() {

		System.out.println("<----- Sorting by DOJ ------>");
		System.out.println();

		add();
		Collections.sort(arrayListObj, new DateComparator());
		for (Intern intern : arrayListObj) {
			System.out.println("Name-- " + intern.name + " " + "Age-- " + intern.age + " " + "DOJ-- " + intern.doj);
			System.out.println();
		}
	}
}