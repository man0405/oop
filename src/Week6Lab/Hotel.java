package Week6Lab;

import java.util.Arrays;

public class Hotel {
    private Room[] rooms;
    private String name;
    private Place place;

    public Hotel(Room[] rooms, String name, Place place) {
        this.rooms = rooms;
        this.name = name;
        this.place = place;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Hotel [rooms=" + Arrays.toString(rooms) + ", name=" + name + ", place=" + place + "]";
    }

}
