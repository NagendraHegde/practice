package practice.booking.types;

public class Seat {
    private String id;

    public Seat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                '}';
    }
}
