
import Enemies.Troll;
import Players.Magic.MythicalCreatures.MythicalCreature;
import Players.Magic.Necromancer;
import Players.Magic.Spells.Fireball;
import Players.Magic.Spells.LightningStrike;
import Players.Magic.Wizard;
import Rooms.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicTest {

    Wizard wizard;
    Necromancer necromancer;

    Fireball fireball;

    LightningStrike lightningStrike;

    EnemyRoom enemyRoom;
    Troll troll;

    @Before
    public void before(){

        troll = new Troll("Bert", 1, 3, 0);
        enemyRoom = new EnemyRoom("The Vault of Terror!", troll);

        fireball = new Fireball("Immolate",8);
        wizard = new Wizard("Gandalf", 28, 0, fireball, MythicalCreature.DRAGON);
        lightningStrike = new LightningStrike("Jolt", 3);
    }

    @Test
    public void canDealDamage(){
        wizard.castSpell(enemyRoom);
        assertEquals(0, enemyRoom.getEnemy().getHp() );
    }

    @Test
    public void canChangeWeapon(){
        wizard.changeSpell(lightningStrike);
        assertEquals(lightningStrike, wizard.getSpell());
    }
}
