package FirstSpringBoot.FirstSpringBoot.repository;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface BookingMapper {

    @Results({
            @Result(property = "id", column = "ID"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "room", column = "ROOM"),
            @Result(property = "start", column = "[START]"),
            @Result(property = "end",column = "[END]")
    })
    @Insert("INSERT INTO mercury.dbo.ROOM_RESERVE\n" +
            "VALUES(#{id},#{name},#{room},#{start},#{end});")
    int createBooking(BookingModel bookingModel);

    @Select("SELECT MAX(ID)\n" +
            "FROM mercury.dbo.ROOM_RESERVE;")
    int showMaxID();

    @Select("SELECT * " +
            "FROM mercury.dbo.ROOM_RESERVE " +
            "WHERE ID= ${id};")
    BookingModel showByID(@Param("id")int id);

    @Select("SELECT *\n" +
            "FROM mercury.dbo.ROOM_RESERVE;\n")
    Collection<BookingModel> showAll();

    @Delete("DELETE\n" +
            "FROM mercury.dbo.ROOM_RESERVE\n" +
            "WHERE id = ${id};")
    int deleteByID(@Param("id")int id);
}
