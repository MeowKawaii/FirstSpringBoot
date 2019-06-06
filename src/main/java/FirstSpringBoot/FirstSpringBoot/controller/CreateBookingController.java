package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CreateBookingController {

    @Autowired
    BookingRepository bookingRepository;

    ArrayList<BookingModel> table = new ArrayList<BookingModel>();

    @PostMapping("/bookings/")
    public BookingModel addBooking(@RequestBody BookingModel booking){
        booking.setId(bookingRepository.getMaxID()+1);
        bookingRepository.create(booking);
        return booking;
    }
}

