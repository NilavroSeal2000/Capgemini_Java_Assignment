package com.cg.feb22.demo;

public class AssignmentC10 {
	public static void main(String[] args) {
		int ans=0,a=101;
		while(a<200) {
			if(a%7==0) {
				while(a<200) {
					ans+=a;
					a+=7;
				}
				break;
			}else {
				a++;
				continue;
			}
		}
		System.out.println(ans);
	}
}