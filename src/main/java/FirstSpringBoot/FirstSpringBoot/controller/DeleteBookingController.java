package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bookings/")
public class DeleteBookingController {

    @Autowired
    BookingRepository bookingRepository;

    @DeleteMapping("{id}")
    @ResponseBody
    public String deleteByID(@PathVariable Integer id){
        return bookingRepository.delete(id);
    }

}
