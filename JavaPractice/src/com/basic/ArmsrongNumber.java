package com.basic;

public class ArmsrongNumber {
public static void main(String args[]) {
	int num=407;
	int temp=num;
	int a,count=0;
	System.out.println("givan num is:"+num);
	while(num>0) {
		a=num%10;
		num=num/10;
		count=(a*a*a)+count;
	}
	if(temp==count) {
		System.out.println("no is armstrong");
	}else {
		System.out.println("no is not armstrong");
	}
}
}
