import Enemies.Troll;
import Players.Fighting.Barbarian;
import Players.Fighting.Dwarf;
import Players.Fighting.Knight;
import Players.Fighting.Weapons.Axe;
import Players.Fighting.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FightingTest {

    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;
    Axe axe;

    Sword sword;

    Troll troll;

    @Before
    public void before(){
        axe = new Axe("Balin's Axe",6);
        dwarf = new Dwarf("Gimli", 22, 0, axe);

        sword = new Sword("Sting", 4);

        troll = new Troll("Bert", 30, 4, 1);

    }

    @Test
    public void canDealDamage(){
        dwarf.attack(troll);
        assertEquals(25, troll.getHp());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(sword);
        assertEquals(sword, dwarf.getWeapon());
    }
}
