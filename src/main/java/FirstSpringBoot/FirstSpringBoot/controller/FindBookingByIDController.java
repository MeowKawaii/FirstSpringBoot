package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings/")
public class FindBookingByIDController {

    @Autowired
    public BookingRepository bookingRepository;

    @GetMapping("{id}")
    @ResponseBody
    public BookingModel getByID(@PathVariable int id){
        return bookingRepository.showByID(id);
    }
}
