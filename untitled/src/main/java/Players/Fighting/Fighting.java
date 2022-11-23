package Players.Fighting;

import Enemies.Enemy;
import Enemies.Troll;
import Players.Fighting.Behaviours.IHit;
import Players.Player;
import Rooms.EnemyRoom;

public abstract class Fighting extends Player {
    private IHit weapon;

    public Fighting(String name, int hp, int defence, IHit weapon){
        super(name, hp, defence);
        this.weapon = weapon;
    }

    public void attack(EnemyRoom enemyRoom){
        Enemy enemy = enemyRoom.getEnemy();
        int damageDealt = this.weapon.getDamage() - enemy.getDefence();
        if(damageDealt>0){
            enemy.setHp(enemy.getHp()- damageDealt );
            if(enemy.getHp()<0){
                enemy.setHp(0);
            }
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
