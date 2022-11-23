package Players.Magic;

import Players.Fighting.Behaviours.IHit;
import Players.Magic.Behaviours.ICast;
import Players.Magic.MythicalCreatures.MythicalCreature;

public class Necromancer extends Magic{
    public Necromancer(String name, int hp, int defence, ICast spell, MythicalCreature mythicalCreature){
        super(name, hp, defence, spell, mythicalCreature);
    }
}
