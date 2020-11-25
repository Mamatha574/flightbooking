package com.booking.flightbooking.service;

import com.booking.flightbooking.entity.BookingBean;

import java.util.List;

public interface BookingService {


    BookingBean getOne(int bId);
    void createBooking(BookingBean bean);
    void deleteBooking(int bId);
}
