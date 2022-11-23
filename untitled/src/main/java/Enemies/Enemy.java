package Enemies;

import Players.Fighting.Dwarf;
import Players.Magic.Magic;
import Players.Player;

public abstract class Enemy {

    private String name;
    private int hp;
    private int strength;
    private int defence;

    public Enemy(String name, int hp, int strength, int defence){
        this.name=name;
        this.hp=hp;
        this.strength=strength;
        this.defence=defence;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public void attack(Player player) {
        int attackDamage = this.strength - player.getDefence();
        if (attackDamage>0){
            player.setHp(player.getHp()-attackDamage);
        }

    }
}
