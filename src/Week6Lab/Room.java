package Week6Lab;

public class Room {
    private int Room;
    private boolean tivi;
    private boolean telephone;

    public Room(int room, boolean tivi, boolean telephone) {
        Room = room;
        this.tivi = tivi;
        this.telephone = telephone;
    }

    public int getRoom() {
        return Room;
    }

    public void setRoom(int room) {
        Room = room;
    }

    public boolean isTivi() {
        return tivi;
    }

    public void setTivi(boolean tivi) {
        this.tivi = tivi;
    }

    public boolean isTelephone() {
        return telephone;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }

}
