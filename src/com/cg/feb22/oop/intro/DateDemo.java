package com.cg.feb22.oop.intro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateDemo {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalDateTime ldatet = LocalDateTime.now();
	System.out.println(ldatet);
	
	DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	
	LocalDate currentDate = LocalDate.now();
	
	//Almost every class in java.time package provides format() method to format the date or time
	System.out.println(currentDate.format(formatter));
}
}
