package br.edu.bribeiro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
	
	/*
	 * You can double check the Leap Year list here
	 * https://kalender-365.de/leap-years.php
	 */

	@Test
	public void isLeapYear() {        
	    LeapYear ly = new LeapYear();

	    assertEquals(true, ly.isLeapYear(2016));
	    assertEquals(true, ly.isLeapYear(2012));
	    assertEquals(true, ly.isLeapYear(2008));
	    assertEquals(true, ly.isLeapYear(2004));
	}

	@Test
	public void isNotLeapYear() {        
		LeapYear ly = new LeapYear();        

	    assertEquals(false, ly.isLeapYear(2018));
	    assertEquals(false, ly.isLeapYear(2014));
	    assertEquals(false, ly.isLeapYear(2015));
	    assertEquals(false, ly.isLeapYear(2011));
	}
	
	@Test
	public void isOldLeapYear() {        
		LeapYear ly = new LeapYear();        

	    assertEquals(true, ly.isLeapYear(1804));
	    assertEquals(true, ly.isLeapYear(1896));
	    assertEquals(true, ly.isLeapYear(1940));
	    assertEquals(true, ly.isLeapYear(1976));
	}
	
	@Test
	public void isNotOldLeapYear() {        
		LeapYear ly = new LeapYear();        

	    assertEquals(false, ly.isLeapYear(1814));
	    assertEquals(false, ly.isLeapYear(1890));
	    assertEquals(false, ly.isLeapYear(1930));
	    assertEquals(false, ly.isLeapYear(1982));
	}
	
}
