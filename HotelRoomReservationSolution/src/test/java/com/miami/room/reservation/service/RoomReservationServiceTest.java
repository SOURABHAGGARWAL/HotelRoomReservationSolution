package com.miami.room.reservation.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miami.room.reservation.business.FindHotel;
import com.miami.room.reservation.business.impl.FindHotelImpl;
import com.miami.room.reservation.utils.InputFormatter;

public class RoomReservationServiceTest {

	@Test
	public void roomReservation() {
		FindHotel findHotel = new FindHotelImpl();
		assertEquals("LAKEWOOD", findHotel.getCheapestHotel(InputFormatter.getFomattedInput("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)")));
		assertEquals("BRIDGEWOOD", findHotel.getCheapestHotel(InputFormatter.getFomattedInput("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)")));
		assertEquals("RIDGEWOOD", findHotel.getCheapestHotel(InputFormatter.getFomattedInput("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)")));
	}

}
