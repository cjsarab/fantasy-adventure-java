

import Players.Healer.Cleric;
import Players.Healer.HealingItems.Herb;
import Players.Healer.HealingItems.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Cleric cleric;

    Potion potion;

    Herb herb;

    @Before
    public void before(){
        potion = new Potion("small potion",4);
        cleric = new Cleric("Galadriel", 22, 0, potion);

        herb = new Herb("green herb", 2);

    }

    @Test
    public void canHealPlayer(){
        cleric.heal(cleric);
        assertEquals(26, cleric.getHp());
    }

    @Test
    public void canChangeHealingItem(){
        cleric.changeHealingItem(herb);
        assertEquals(herb, cleric.getHealingItem());
    }
}
