package com.Havenwood.HavenwoodHotel.service.interfac;

import com.Havenwood.HavenwoodHotel.dto.Response;
import com.Havenwood.HavenwoodHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
