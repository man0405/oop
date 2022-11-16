package Week6;

import java.util.Arrays;

public class HotelExercise {
    public static void main(String[] args) {
        Room array[] = new Room[5];
        array[0]= new Room(1,false,true);
        array[1]= new Room(2,true,true);
        array[2]= new Room(3,false,false);
        array[3]= new Room(4,true,true);
        array[4]= new Room(5,true,false);
        Hotel hotel = new Hotel(array,"Danang");
        System.out.println(hotel);
    }
}

class Room {
    private int beds;
    private boolean tv, telephone;

    Room(int numberOfRooms, boolean tvExists, boolean telephoneExists) { 
        beds = numberOfRooms;
        tv = tvExists;
        telephone = telephoneExists;
    }

    @Override
    public String toString() {
        return "beds=" + beds + ", tv=" + tv + ", telephone=" + telephone + "\n";
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isTelephone() {
        return telephone;
    }

    public void setTelephone(boolean telephone) {
        this.telephone = telephone;
    }
}

class Hotel{
    private Room rooms[];
    private String palace;

    Hotel(Room vec[]){
        rooms = vec;
    }

    Hotel(Room vec[], String palace){
        rooms = vec;
        this.palace = palace;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] vec) {
        this.rooms = vec;
    }

    public String getPalace() {
        return palace;
    }

    public void setPalace(String palace) {
        this.palace = palace;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("palace:");
        sb.append(palace);
        sb.append("\n");
        for(int i = 0; i < rooms.length;i++){
            sb.append("rooms");
            sb.append(i+1);
            sb.append(":");
            sb.append(rooms[i]);
        }
        return sb.toString();

    }

    

}
