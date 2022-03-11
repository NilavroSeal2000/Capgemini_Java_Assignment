package com.cg.feb22.oop.ex;


//for checked
public class VoterNotEligibleExceptionChecked extends Exception {

	private static final long serialVersionUID = 1L;

	public VoterNotEligibleExceptionChecked() {

	}

	public VoterNotEligibleExceptionChecked(String message) {
		super(message);

	}
}
