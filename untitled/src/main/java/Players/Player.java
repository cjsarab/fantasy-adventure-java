package Players;

public abstract class Player {
    private String name;
    private int hp;
    private int defence;

    public Player(String name, int hp, int defence){
        this.name=name;
        this.hp=hp;
        this.defence=defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public abstract String getPlayerClass();

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
