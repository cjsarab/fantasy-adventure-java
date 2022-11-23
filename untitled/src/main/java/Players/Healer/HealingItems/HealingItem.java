package Players.Healer.HealingItems;

import Players.Healer.Behaviours.IHeal;

public abstract class HealingItem implements IHeal {


    private String name;
    private int healValue;
    public HealingItem(String name, int healValue){
        this.name=name;
        this.healValue=healValue;
    }

    public String getName(){
        return this.name;
    }

    public int getHealValue(){
        return this.healValue;
    }
}
