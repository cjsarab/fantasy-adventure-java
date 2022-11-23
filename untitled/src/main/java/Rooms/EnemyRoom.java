package Rooms;

import Enemies.Enemy;

public class EnemyRoom extends Room{
    private Enemy enemy;

    public EnemyRoom(String name, Enemy enemy){
        super(name);
        this.enemy=enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Boolean isRoomComplete(){
        if(this.enemy.getHp() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
