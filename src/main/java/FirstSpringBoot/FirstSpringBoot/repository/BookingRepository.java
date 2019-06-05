package FirstSpringBoot.FirstSpringBoot.repository;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;

import java.util.Collection;
import java.util.HashMap;

public class BookingRepository {
    private static HashMap <Integer, BookingModel> table = new HashMap<Integer, BookingModel>();

    public static boolean create(BookingModel booking){
        table.put(booking.getId(),booking);

        return true;
    }

    public static Collection<BookingModel> getAll(){
        return table.values();
    }

    public static BookingModel get(int id){
        return table.get(id);
    }

    public static BookingModel delete(int id){
        return table.remove(id);
    }

}
