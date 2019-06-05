package FirstSpringBoot.FirstSpringBoot.controller;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import FirstSpringBoot.FirstSpringBoot.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings/")
public class DeleteBooking {

    @DeleteMapping("{id}")
    @ResponseBody
    public String deleteByID(@PathVariable Integer id){
        BookingModel deleteBooking= BookingRepository.delete(id);
        return deleteBooking.getId()+" success";
    }

}
