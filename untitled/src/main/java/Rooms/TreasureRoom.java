package Rooms;

public class TreasureRoom extends Room {
    String treasureName;
    int treasureValue;

    public TreasureRoom(String name, String treasureName, int treasureValue){
        super(name);
        this.treasureName=treasureName;
        this.treasureValue=treasureValue;
    }


    public Boolean isRoomComplete(){
        if(this.treasureValue == 0) {
            return true;
        } else {
            return false;
        }
    }
}
