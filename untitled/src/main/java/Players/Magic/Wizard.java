package Players.Magic;

import Players.Magic.Behaviours.ICast;
import Players.Magic.MythicalCreatures.MythicalCreature;

public class Wizard extends Magic{
    public Wizard(String name, int hp, int defence, ICast spell, MythicalCreature mythicalCreature){
        super(name, hp, defence, spell, mythicalCreature);
    }
}
