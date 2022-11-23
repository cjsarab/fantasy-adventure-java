package Players.Magic.MythicalCreatures;

public enum MythicalCreature {

    DRAGON(5),
    GRIFFON(1);

    private final int defence;

    MythicalCreature(int defence) {
        this.defence=defence;
    }

    public int getDefence() {
        return defence;
    }
}
