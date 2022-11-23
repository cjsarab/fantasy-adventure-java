package Players.Fighting;

import Players.Fighting.Behaviours.IHit;

public class Barbarian extends Fighting{
    public Barbarian(String name, int hp, IHit weapon){
        super(name, hp, weapon);
    }
}
