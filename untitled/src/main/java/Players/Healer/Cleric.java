package Players.Healer;
import Players.Healer.Behaviours.IHeal;

public class Cleric extends Healer {
    public Cleric(String name, int hp, int defence, IHeal healingItem){
        super(name, hp, defence, healingItem);
    }
}
