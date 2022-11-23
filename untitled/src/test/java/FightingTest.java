import Players.Fighting.Barbarian;
import Players.Fighting.Dwarf;
import Players.Fighting.Knight;
import Players.Fighting.Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FightingTest {

    Dwarf dwarf;
    Barbarian barbarian;
    Knight knight;
    Axe axe;

    @Before
    public void before(){
        axe = new Axe("Balin's Axe",6);
        dwarf = new Dwarf("Gimli", 22, axe);
    }

    @Test
    public void canDealDamage(){
        assertEquals(6, dwarf.attack());
    }
}
