package Players.Fighting;

import Players.Fighting.Behaviours.IHit;
import Players.Player;

public abstract class Fighting extends Player {
    private IHit weapon;

    public Fighting(String name, int hp, IHit weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public int attack(){
        return this.weapon.getDamage();
    }
}
