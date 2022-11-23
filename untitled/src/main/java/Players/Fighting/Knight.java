package Players.Fighting;

import Players.Fighting.Behaviours.IHit;

public class Knight extends Fighting{
    public Knight(String name, int hp, int defence, IHit weapon){
        super(name, hp, defence, weapon);
    }
}
