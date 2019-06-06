package FirstSpringBoot.FirstSpringBoot.model;

public class BookingModel {

    public void setId(int id) {
        this.id = id;
    }

    //    id int, name string, room string, start string ,end string
    private int id;
    private String name;
    private String room;
    private String start;
    private String end;

    public BookingModel() {
    }

    public BookingModel(int id, String name, String room, String start, String end) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}
