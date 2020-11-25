package com.booking.flightbooking.service;

import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

   public void createBooking(BookingBean bean){

      bookingRepository.save(bean);
    }
    public BookingBean getOne(int bId) {

        return bookingRepository.findById(bId).get();

    }

   public  void deleteBooking(int bId){

       bookingRepository.deleteById(bId);
   }

}
