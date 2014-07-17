package com.miami.room.reservation.utils;

import java.util.ArrayList;
import java.util.List;

public class InputFormatter {
	
	enum Days{
		mon("weekday"),
		tues("weekday"),
		wed("weekday"),
		thur("weekday"),
		fri("weekday"),
		sat("weekend"),
		sun("weekend");
		
		private String days;
		
		Days(String days){
			this.days = days;
		}
		
		public String getType(){
			return days;
		}
		
	}
	
	public static List<String> getFomattedInput(String input){
		List<String> fomattedOutput = new ArrayList<String>();
		try{
			String customertType = input.trim().substring(0,input.trim().indexOf(":"));
				fomattedOutput.add(customertType.trim());
				String[] dates = input.trim().substring(input.trim().indexOf(":")+1, input.length()).trim().split(",");
				for (String date : dates) {
					fomattedOutput.add(date.trim());
				}
			return fomattedOutput;
		} catch(Exception e){
			System.out.println(e.getMessage() + " Input Error : Not a valid input string");
			return fomattedOutput;
		}
	}

	public static String getDayType(String date){
		try{
			return Days.valueOf(date.substring(date.indexOf("(")+1, date.indexOf(")")).trim()).getType();
		} catch(Exception e){
			System.out.println("No valid input type date......");
			return "";
		}
	}
	
}
