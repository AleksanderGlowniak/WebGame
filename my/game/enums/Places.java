package my.game.enums;

import my.game.domain.HelmsDeep;
import my.game.enemies.Orc;

public enum Places {

    HELMSDEEP,
    MINASTIRITH,
    ROHAN;

    public boolean isOrcPlace(){
        return HELMSDEEP == this;
    }
}
