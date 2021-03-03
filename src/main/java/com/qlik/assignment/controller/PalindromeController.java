package com.qlik.assignment.controller;

import java.util.HashMap;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qlik.assignment.service.PalindromeService;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

	/** Inject bean instance */
	@Autowired
	PalindromeService palindromeService;

	/*
	 * Method to check given string is palindrom or not
	 * 
	 * @param inputValue
	 * 			Input value
	 */
	@GetMapping(
			value = "/is_palindrome", 
			produces = "application/json;"
	)
	public boolean isPalindrome(@PathParam("inputValue") String inputValue) {
		boolean isPalindrome = false;
		isPalindrome = palindromeService.isPalindrome(inputValue);
		return isPalindrome;
	}

	/*
	 * Method to get the palindrom count
	 */
	@GetMapping(
			value = "/palindrome_counts", 
			produces = "application/json;")
	public HashMap<String, Integer> getPalindromeCount() {
		// Return palindrome count
		return palindromeService.getPalindromeCount();
	}
}