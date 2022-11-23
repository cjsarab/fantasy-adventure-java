package Players.Magic;

import Players.Magic.Behaviours.ICast;

public class Wizard extends Magic{
    public Wizard(String name, int hp, ICast spell){
        super(name, hp, spell);
    }
}
