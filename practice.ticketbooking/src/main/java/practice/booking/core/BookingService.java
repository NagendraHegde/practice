package practice.booking.core;

import practice.booking.types.Seat;
import practice.booking.types.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookingService {

    Map<Seat, User> bookingMap = new ConcurrentHashMap<>();

    public boolean book(final User user, final Seat seat){


        synchronized (seat){

        }
        return false;
    }

}
