package com.booking.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.service.BookingServiceImpl;


@RestController
public class FlightbookingController {
	
	@Autowired
	BookingServiceImpl bookingService;

   

    @GetMapping("/booking/{bId}")
    private BookingBean getEmployee(@PathVariable("bId") int bId) {
        return bookingService.getOne(bId);
    }

    @DeleteMapping("/booking/{bId}")
    private void deleteEmployee(@PathVariable("bId") int bId) {
    	bookingService.deleteBooking(bId);
    }

    @PostMapping("/booking")
    private void createEmployee(@RequestBody BookingBean booking) {
    	bookingService.createBooking(booking);
    }
   
}
