package Players.Magic;

import Players.Fighting.Behaviours.IHit;
import Players.Magic.Behaviours.ICast;
import Players.Player;

public abstract class Magic extends Player {
    private ICast spell;

    public Magic(String name, int hp, ICast spell){
        super(name, hp);
        this.spell = spell;
    }

    public int castSpell(){
        return this.spell.getDamage();
    }

    public void changeSpell(ICast newSpell){
        this.spell=newSpell;
    }

    public ICast getSpell() {
        return this.spell;
    }

}
