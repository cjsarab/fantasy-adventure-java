package Players.Magic;

import Players.Fighting.Behaviours.IHit;
import Players.Magic.Behaviours.ICast;

public class Necromancer extends Magic{
    public Necromancer(String name, int hp, ICast spell){
        super(name, hp, spell);
    }
}
