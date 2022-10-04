package my.game;

import my.game.domain.HelmsDeep;
import my.game.enemies.Character;
import my.game.enemies.Hero;
import my.game.enums.Places;
import my.game.enums.Weapons;
import my.game.exceptions.ToShortHeroNameException;
import my.game.service.HelmsDeepService;

import java.lang.reflect.Method;

import static my.game.enums.Places.HELMSDEEP;
import static my.game.enums.Weapons.BOW;

public class StartApp {

    public static void main(String[] args) {

/*        Character orc = new Character();
        Character easterling = new Character();
        Character haradrim = new Character();

        orc.setInitiative(20);
        System.out.println(orc.getInitiative());

        HelmsDeepService helmsDeepService = new HelmsDeepService();
        HelmsDeep helmsDeepWithEnemies = helmsDeepService.createHelmsDeep();
        Character[] allEnemies = helmsDeepWithEnemies.getEnemies();

        allEnemies[1].showPlaceOfOccurrence();

        Character enemy = allEnemies[1];
        Class enio = enemy.getClass();
        for (Method method: enio.getMethods()){
        System.out.println(method.getName());}*/
        Hero elf = new Hero();
/*        try{
            elf.setName("El");
        } catch (ToShortHeroNameException e){
            System.out.println("Your Hero has too short name");
        }*/

        try {
            elf.setName("Legolas");
            elf.setVisitedPlace(HELMSDEEP);
            elf.setWeapon(BOW);
            elf.setHitPoints(50);
            elf.setInitiative(25);
        } catch (Exception e){
            System.out.println("Your Hero has too short name");
        }
        HelmsDeepService helmsDeepService = new HelmsDeepService();
        HelmsDeep helmsDeepWithEnemies = helmsDeepService.createHelmsDeep();
        helmsDeepWithEnemies.fight(elf);

    }
}
