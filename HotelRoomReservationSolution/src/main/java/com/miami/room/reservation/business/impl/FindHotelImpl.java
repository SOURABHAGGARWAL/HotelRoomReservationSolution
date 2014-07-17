package com.miami.room.reservation.business.impl;

import java.util.List;

import com.miami.room.reservation.business.FindHotel;
import com.miami.room.reservation.constants.HotelPlane;
import com.miami.room.reservation.utils.InputFormatter;

public class FindHotelImpl implements FindHotel{
	
	public String getCheapestHotel(List<String> hotelSearchParam){
		
		double minimumPrice = 0.0;
		String minimumPriceHotel = "";
		int maxRating = 0;
		String customerType = hotelSearchParam.get(0);
		for (HotelPlane.HotelName hotel : HotelPlane.HotelName.values()) {
			double dayCost = 0.00;
			for(int i=1; i< hotelSearchParam.size(); i++){
				String dayType = InputFormatter.getDayType(hotelSearchParam.get(i));
				for (HotelPlane hotelPlane : HotelPlane.hotelPlaneList) {
					if(hotelPlane.getHotelName().toString().trim().equalsIgnoreCase(hotel.name()) 
							&& hotelPlane.getCustomerType().trim().equalsIgnoreCase(customerType) 
							&& hotelPlane.getDayType().trim().equalsIgnoreCase(dayType)){
						dayCost = dayCost + (double)hotelPlane.getRate();
					}
				}
			}
			
			if(minimumPrice > dayCost || minimumPrice == 0.0){
				minimumPriceHotel = hotel.name().toString();
				minimumPrice = dayCost;
				maxRating = hotel.getRatting();
			} else if(minimumPrice == dayCost){
				if(maxRating < hotel.getRatting()){
					maxRating = hotel.getRatting();
					minimumPriceHotel = hotel.name().toString();
					minimumPrice = dayCost;
				}
			}
		}
		return minimumPriceHotel;
	}

}
