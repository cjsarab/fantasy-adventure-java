package Players.Magic.Spells;

import Players.Magic.Behaviours.ICast;

public abstract class Spell implements ICast {
    private String name;
    private int damage;

    public Spell(String name, int damage){
        this.name=name;
        this.damage=damage;
    }

    public String getName(){
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

}
