package com.kuldeep.HotelBooking.service.interfac;

import com.kuldeep.HotelBooking.dto.Response;
import com.kuldeep.HotelBooking.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
