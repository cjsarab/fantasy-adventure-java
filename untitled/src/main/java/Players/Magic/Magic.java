package Players.Magic;

import Enemies.Enemy;
import Players.Magic.Behaviours.ICast;
import Players.Magic.MythicalCreatures.MythicalCreature;
import Players.Player;
import Rooms.EnemyRoom;

public abstract class Magic extends Player {
    private ICast spell;
    private MythicalCreature mythicalCreature;

    public Magic(String name, int hp, int defence, ICast spell, MythicalCreature mythicalCreature){
        super(name, hp, defence);
        this.spell = spell;
        this.mythicalCreature=mythicalCreature;
        this.setDefence(this.getDefence() + this.getDefenceFromMythicalCreature());
    }

    public void castSpell(EnemyRoom enemyRoom){

        Enemy enemy = enemyRoom.getEnemy();
        int damageDealt = this.spell.getDamage() - enemy.getDefence();
        if(damageDealt>0){
            enemy.setHp(enemy.getHp()- damageDealt );
            if(enemy.getHp()<0){
                enemy.setHp(0);
            }
        }
    }

    public void changeSpell(ICast newSpell){
        this.spell=newSpell;
    }

    public ICast getSpell() {
        return this.spell;
    }

    public int getDefenceFromMythicalCreature(){
        return this.mythicalCreature.getDefence();
    }

    public String getPlayerClass(){
        return "Magic";
    }




}
