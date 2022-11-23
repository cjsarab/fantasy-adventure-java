package Rooms;

public abstract class Room {
    String name;
    Boolean isPartyPresent;

    public Room(String name){
        this.name=name;
        this.isPartyPresent=false;
    }

    public void setIsPartyPresent(Boolean isPartyPresent){
        this.isPartyPresent= isPartyPresent;
    }

}
