package my.game.enums;

public enum Weapons {

    SWORD (25),
    BOW (20),
    AXE (35);

    private final int extraHit;


    private Weapons(int extraHit) {
        this.extraHit = extraHit;
    }

    public int getExtraHit() {
        return this.extraHit;
    }
}
