package Players.Fighting;

import Players.Fighting.Behaviours.IHit;

public class Dwarf extends Fighting {
    public Dwarf(String name, int hp, int defence, IHit weapon){
        super(name, hp, defence, weapon);
    }
}
