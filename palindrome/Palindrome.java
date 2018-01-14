package com.ravindra;

public class Palindrome {

	public static void main(String[] args) {
		String str = "12322";
		System.out.println("Is palindrome  "+ispalindrome(str));
		
	}
	public static boolean ispalindrome(String str) {
		if(str.length()==0||str.length()==1) {
			return true;
		}else {
			if(str.charAt(0)==str.charAt(str.length()-1)) {
				return ispalindrome(str.substring(1, str.length()-1));
			}
		}
		return false;
	}

}
