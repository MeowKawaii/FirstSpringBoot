package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings/")
public class FindBookingByID {

    @GetMapping("{id}")
    @ResponseBody
    public BookingModel getByID(@PathVariable int id){
        return BookingRepository.get(id);
    }


}
