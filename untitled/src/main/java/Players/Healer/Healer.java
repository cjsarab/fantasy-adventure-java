package Players.Healer;

import Players.Healer.Behaviours.IHeal;
import Players.Player;

public abstract class Healer extends Player {


    private IHeal healingItem;

    public Healer(String name, int hp, int defence, IHeal healingItem){
        super(name, hp, defence);
        this.healingItem = healingItem;
    }


    public void heal(Player player){

        int healingValue = this.healingItem.getHealValue();
        player.setHp(player.getHp() + healingValue);

    }

    public void changeHealingItem(IHeal newHealingItem){
        this.healingItem=newHealingItem;
    }

    public IHeal getHealingItem() {
        return this.healingItem;
    }

    public String getPlayerClass(){
        return "Healer";
    }

}
