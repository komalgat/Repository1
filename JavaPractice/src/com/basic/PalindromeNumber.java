package com.basic;

public class PalindromeNumber {
	public static void main(String args[]) {
		int num=121;
		int temp=num;
		int rem,rev=0;
		System.out.println("givan num is:"+num);
		while(num!=0) {
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		System.out.println("rev of num is :"+rev);
		if(temp==rev) {
			System.out.println("no is palindrome");
		}else {
			System.out.println("no is not palindrome");
		}
	}

}
