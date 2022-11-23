package Players.Magic;

import Players.Magic.Behaviours.ICast;
import Players.Magic.MythicalCreatures.MythicalCreature;
import Players.Player;

public abstract class Magic extends Player {
    private ICast spell;
    private MythicalCreature mythicalCreature;

    public Magic(String name, int hp, int defence, ICast spell, MythicalCreature mythicalCreature){
        super(name, hp, defence);
        this.spell = spell;
        this.mythicalCreature=mythicalCreature;
        this.setDefence(this.getDefence() + this.getDefenceFromMythicalCreature());
    }

    public int castSpell(){
        return this.spell.getDamage();
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
