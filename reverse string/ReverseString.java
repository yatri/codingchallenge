package com.ravindra;

public class ReverseString {
	 public static void main(String[] args){
		 String str = "Ravindra";
		 char[] charstr = str.toCharArray();
		 StringBuilder sb = new StringBuilder();
		 for(int i=0;i<charstr.length;i++) {
			 sb.append(charstr[charstr.length-i-1]);
		 }
		 System.out.println(sb.toString());
	 }
}
