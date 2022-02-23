package com.cg.feb22.demo;

public class AssignmentC8{
	public static void main(String[] args) {
		int i=123,ans=0;
		while(i>0) {
			int a=i%10;
			ans=(ans*10)+a;
			i=i/10;
		}
		System.out.println(ans);
	}
}