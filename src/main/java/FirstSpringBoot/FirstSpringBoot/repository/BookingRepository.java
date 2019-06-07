package FirstSpringBoot.FirstSpringBoot.repository;

import FirstSpringBoot.FirstSpringBoot.model.BookingModel;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class BookingRepository{

    private SqlSession session;

    @Qualifier("bookingSqlSessionTemplate")
    @Autowired
    public void setSession(SqlSession session){
        this.session = session;
    }

    private BookingMapper getMapper(){
        return session.getMapper(BookingMapper.class);
    }

    public BookingModel showByID(int id){

        return getMapper().showByID(id);
    }

    public int create(BookingModel booking){
        return getMapper().createBooking(booking);

    }

    public int getMaxID(){
        return getMapper().showMaxID();
    }

    public Collection<BookingModel> getAll(){
        return getMapper().showAll();
    }

    public int delete(int id){
        return getMapper().deleteByID(id);
    }



}