
import Players.Magic.MythicalCreatures.MythicalCreature;
import Players.Magic.Necromancer;
import Players.Magic.Spells.Fireball;
import Players.Magic.Spells.LightningStrike;
import Players.Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicTest {

    Wizard wizard;
    Necromancer necromancer;

    Fireball fireball;

    LightningStrike lightningStrike;


    @Before
    public void before(){

        fireball = new Fireball("Immolate",8);
        wizard = new Wizard("Gandalf", 28, 0, fireball, MythicalCreature.DRAGON);
        lightningStrike = new LightningStrike("Jolt", 3);
    }

    @Test
    public void canDealDamage(){
        assertEquals(8, wizard.castSpell());
    }

    @Test
    public void canChangeWeapon(){
        wizard.changeSpell(lightningStrike);
        assertEquals(lightningStrike, wizard.getSpell());
    }
}
