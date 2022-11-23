import Enemies.Troll;
import Players.Fighting.Dwarf;
import Players.Fighting.Weapons.Axe;
import Rooms.EnemyRoom;
import Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;
    Troll troll;
    Dwarf dwarf;
    Axe axe;

    @Before
    public void before(){
        troll = new Troll("Bert", 1, 3, 0);
        enemyRoom = new EnemyRoom("The Vault of Terror!", troll);
        axe = new Axe("Balin's Axe", 5);
        dwarf = new Dwarf("Gimli", 5, 3, axe);

        treasureRoom = new TreasureRoom("The Shrine of Success", "Gold, rubies sapphires", 1003124);
    }

    @Test
    public void playerCanCompleteRoom(){
        dwarf.attack(enemyRoom);
        assertEquals(true, enemyRoom.isRoomComplete());
    }
}
