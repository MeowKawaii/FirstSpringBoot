package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/bookings/")
public class ShowAllBookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    @ResponseBody
    public Collection<BookingModel> bookingList(){
        return bookingRepository.getAll();
    }


}
