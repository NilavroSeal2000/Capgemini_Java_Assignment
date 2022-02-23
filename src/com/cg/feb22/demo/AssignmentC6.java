package com.cg.feb22.demo;

public class AssignmentC6 {
	public static void main(String[] args) {
		int i=227,s=0,p=1,a=0;
		while(true) {
			a=i%10;
			i=i/10;
			s+=a;
			p*=a;
			if(i<=10) {
				s+=i;
				p*=i;
				break;
			}
		}
		System.out.println(s);
		System.out.println(p);
	}
}

