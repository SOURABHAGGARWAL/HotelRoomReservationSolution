package com.miami.room.reservation.service;

import com.miami.room.reservation.business.FindHotel;
import com.miami.room.reservation.business.impl.FindHotelImpl;
import com.miami.room.reservation.utils.InputFormatter;

public class RoomReservationService {
	
	public static void main(String[] args){
		FindHotel findHotel = new FindHotelImpl();
		try{
			if(args.length<1){
				System.out.println("No Input!!!! Please provide some input.......");
			}
			
			for (String arg : args) {
				System.out.println(findHotel.getCheapestHotel(InputFormatter.getFomattedInput(arg)));
			}
		} catch(Exception e){
			System.out.println("No valid Input: Please provide valid input.");
		}

	}
	
}
