import Enemies.Enemy;
import Enemies.Troll;
import Players.Fighting.Dwarf;
import Players.Fighting.Weapons.Axe;
import Players.Magic.Behaviours.ICast;
import Players.Magic.MythicalCreatures.MythicalCreature;
import Players.Magic.Spells.Fireball;
import Players.Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Troll troll;
    Axe axe;
    Dwarf dwarf;
    Wizard wizard;
    Fireball fireball;

    @Before
    public void before(){
        axe = new Axe("Balin's Axe",6);
        dwarf = new Dwarf("Gimli", 22, 0, axe);
        troll = new Troll("Bert", 30, 4, 1);


        fireball = new Fireball("Immolate",8);
        wizard = new Wizard("Gandalf", 28, 0, fireball, MythicalCreature.GRIFFON);
    }

    @Test
    public void canDoDamageToNonMagic(){
        troll.attack(dwarf);
        assertEquals(18, dwarf.getHp());
    }

    @Test
    public void canDoDamageToMagic(){
        troll.attack(wizard);
        assertEquals(25, wizard.getHp());
    }

}
