package FirstSpringBoot.FirstSpringBoot.controller;

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
        if(1 == bookingRepository.delete(id)){
            return "{\"id\":\""+id+"\",\"status\":\"success\"}";
        }
        else
            return "cannot delete";
    }

}
