package com.qlik.assignment.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.qlik.assignment.service.PalindromeService;

/** Class having the implementations of palindrom interface */
@Service
public class PalindromeServiceImpl implements PalindromeService {

	HashMap<String, Integer> palindromeStringMap = new HashMap<>();

	/*
	 * Method to check given value is palindrom or not
	 */
	@Override
	public boolean isPalindrome(String strValue) {
		// Pointers pointing to the beginning and the end of the string
		int i = 0, j = strValue.length() - 1;
		// While there are characters to compare
		while (i < j) {
			// If there is a mismatch
			if (strValue.charAt(i) != strValue.charAt(j))
				return false;
			// Increment first pointer and decrement the other
			i++;
			j--;
		}
		if (palindromeStringMap.containsKey(strValue)) {
			palindromeStringMap.put(strValue, palindromeStringMap.get(strValue) + 1);
		} else {
			palindromeStringMap.put(strValue, 1);

		}
		// Given string is a palindrome
		return true;
	}

	@Override
	public HashMap<String, Integer> getPalindromeCount() {
		return this.palindromeStringMap;
	}
}