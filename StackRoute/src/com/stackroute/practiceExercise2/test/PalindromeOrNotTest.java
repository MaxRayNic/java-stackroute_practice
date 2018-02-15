package com.stackroute.practiceExercise2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.practiceExercise2.PalindromeOrNot;

public class PalindromeOrNotTest {

	PalindromeOrNot testObject;

	@Before
	public void initialize() {
		testObject = new PalindromeOrNot();
	}

	@After
	public void testObject() {
		testObject = null;
	}

	@Test
	public void test() {
		testCheckPalindrome();
		testCheckNotPalindrome();
		checkReverse();

	}

	@Test
	public void testCheckPalindrome() {
		// arrange
		String str = "1234321";
		// act
		boolean flag = PalindromeOrNot.isPalindromeCheck(str);
		// assert
		assertTrue("Should return true for  Palindromes", flag);

	}

	@Test
	public void testCheckNotPalindrome() {
		// arrange
		String str = "1234";
		// act
		boolean flag = PalindromeOrNot.isPalindromeCheck(str);
		// assert
		assertFalse("Should return false for non Palindromes", flag);
	}

	@Test
	public void checkReverse() {
		// arrange
		String str = "123";
		String expected = "321";
		// act
		String actual = PalindromeOrNot.reverse(str);
		// assert
		assertEquals("String reverse did not match Expectation Check reverse()", expected, actual);
	}

}
