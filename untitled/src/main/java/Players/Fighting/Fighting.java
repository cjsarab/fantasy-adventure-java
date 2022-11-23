package Players.Fighting;

import Enemies.Enemy;
import Enemies.Troll;
import Players.Fighting.Behaviours.IHit;
import Players.Player;

public abstract class Fighting extends Player {
    private IHit weapon;

    public Fighting(String name, int hp, int defence, IHit weapon){
        super(name, hp, defence);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        int damageDealt = this.weapon.getDamage() - enemy.getDefence();
        if(damageDealt>0){
            enemy.setHp(enemy.getHp()- damageDealt );
        }
    }

    public void changeWeapon(IHit newWeapon){
        this.weapon=newWeapon;
    }

    public IHit getWeapon() {
        return this.weapon;
    }

    public String getPlayerClass(){
        return "Fighting";
    }
}
