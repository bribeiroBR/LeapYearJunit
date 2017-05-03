package br.edu.bribeiro;

public class LeapYear {

	public boolean isLeapYear(int year) {
		if (((year % 4) == 0) && ((year % 100) != 0))
			return true;
		else if ((year % 400) == 0)
			return true;
		else
			return false;
	}

}
