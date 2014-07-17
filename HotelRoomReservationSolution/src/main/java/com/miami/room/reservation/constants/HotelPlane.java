/**
 * 
 */
package com.miami.room.reservation.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sourabh
 *
 */
public class HotelPlane {
	
	public enum HotelName{
		LAKEWOOD(3),
		BRIDGEWOOD(4),
		RIDGEWOOD(5);
		
		private int ratting;
		
		HotelName(int ratting){
			this.ratting = ratting;
		}
		
		public int getRatting(){
			return ratting;
		}
		
	}
	
	private HotelName hotelName;
	private int rating;
	private String dayType;
	private double rate;
	private String currency;
	private String customerType;
	
	private HotelPlane(){
		
	}
	
	private HotelPlane(HotelName hotelName, int rating, String dayType, double rate, String currency, String customerType){
		this.hotelName = hotelName;
		this.rating = rating;
		this.dayType = dayType;
		this.rate = rate;
		this.currency = currency;
		this.customerType = customerType;
	}
	
	public HotelName getHotelName() {
		return hotelName;
	}

	public int getRating() {
		return rating;
	}

	public String getDayType() {
		return dayType;
	}

	public double getRate() {
		return rate;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCustomerType() {
		return customerType;
	}

	
	public static final List<HotelPlane> hotelPlaneList = new ArrayList<HotelPlane>(){
		/**
		 * Serial version id
		 */
		private static final long serialVersionUID = 14635624535675991L;

	{
		add(new HotelPlane(HotelName.LAKEWOOD, HotelName.LAKEWOOD.getRatting(), "weekday", (double) 110.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.LAKEWOOD, HotelName.LAKEWOOD.getRatting(), "weekend", (double) 90.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.LAKEWOOD, HotelName.LAKEWOOD.getRatting(), "weekday", (double) 80.00, "dollar", "rewards"));
		add(new HotelPlane(HotelName.LAKEWOOD, HotelName.LAKEWOOD.getRatting(), "weekend", (double) 80.00, "dollar", "rewards"));

		add(new HotelPlane(HotelName.BRIDGEWOOD, HotelName.BRIDGEWOOD.getRatting(), "weekday", (double) 160.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.BRIDGEWOOD, HotelName.BRIDGEWOOD.getRatting(), "weekend", (double) 60.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.BRIDGEWOOD, HotelName.BRIDGEWOOD.getRatting(), "weekday", (double) 110.00, "dollar", "rewards"));
		add(new HotelPlane(HotelName.BRIDGEWOOD, HotelName.BRIDGEWOOD.getRatting(), "weekend", (double) 50.00, "dollar", "rewards"));
		
		add(new HotelPlane(HotelName.RIDGEWOOD, HotelName.RIDGEWOOD.getRatting(), "weekday", (double) 220.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.RIDGEWOOD, HotelName.RIDGEWOOD.getRatting(), "weekend", (double) 150.00, "dollar", "regular"));
		add(new HotelPlane(HotelName.RIDGEWOOD, HotelName.RIDGEWOOD.getRatting(), "weekday", (double) 100.00, "dollar", "rewards"));
		add(new HotelPlane(HotelName.RIDGEWOOD, HotelName.RIDGEWOOD.getRatting(), "weekend", (double) 40.00, "dollar", "rewards"));
	}};
	
	
}
