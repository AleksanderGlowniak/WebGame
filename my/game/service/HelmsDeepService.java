package my.game.service;

import my.game.domain.HelmsDeep;
import my.game.enemies.Character;
import my.game.enemies.Easterling;
import my.game.enemies.Haradrim;
import my.game.enemies.Orc;

public class HelmsDeepService {

    public HelmsDeep createHelmsDeep(){

        HelmsDeep helmsDeep = new HelmsDeep(3);

        Orc urukHai = new Orc();
        urukHai.setDamageBySun(20);
        urukHai.setHitPoints(25);
        urukHai.setInitiative(5);
        urukHai.setName("UrukHai");

        Easterling easterling = new Easterling();
        easterling.setDamageBySun(5);
        easterling.setHitPoints(35);
        easterling.setInitiative(15);
        easterling.setName("Easterling");

        Haradrim haradrim = new Haradrim();
        haradrim.setDamageBySun(8);
        haradrim.setHitPoints(30);
        haradrim.setInitiative(20);
        haradrim.setName("Haradrim");


        Character [] enemies = {urukHai, easterling, haradrim};
        helmsDeep.setEnemies(enemies);

        helmsDeep.setEnemies(urukHai,0);
        helmsDeep.setEnemies(easterling, 1);
        helmsDeep.setEnemies(haradrim,2);

        return helmsDeep;
    }
}
