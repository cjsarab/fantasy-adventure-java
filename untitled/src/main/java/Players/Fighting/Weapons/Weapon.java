package Players.Fighting.Weapons;

import Players.Fighting.Behaviours.IHit;

public abstract class Weapon implements IHit {
    private String name;
    private int damage;
    public Weapon(String name, int damage){
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
