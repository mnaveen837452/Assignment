package com.qlik.assignment.service;

import java.util.HashMap;

/** Interface having method for palindrome operations */
public interface PalindromeService {

	/** Method to check is palindrome or not for given value */
	boolean isPalindrome(String strValue);

	/** Method to get palindrome counts */
	HashMap<String, Integer> getPalindromeCount();

}
