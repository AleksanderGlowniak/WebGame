package my.game.domain;

import my.game.enemies.Character;
import my.game.enemies.Hero;
import my.game.enemies.Orc;

public class HelmsDeep extends Place{

    private Character[] enemies;

    public HelmsDeep() {
    }

    public HelmsDeep(int enemiesAmount) {
        this.enemies = new Character[enemiesAmount];
    }



    public Character[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Character charac, int idx) {
        this.enemies[idx] = charac;
    }

    public void setEnemies(Character[] enemies) {
    }

    @Override
    protected String getPlaceOfOccurrence() {
        return "HelmsDeep";
    }

    public void fight(Hero hero){
        System.out.println(" Now you see " + enemies.length + " enemies");
        System.out.println(" They names are: ");
        for(Character enemy: enemies){
            System.out.println(enemy.getName() + " , ");
        }
        System.out.println();
        System.out.println("===================================================");
        System.out.println("Let's fight!!");

        for(Character enemy: enemies){
            if(enemy.getInitiative()<=hero.getInitiative()){
                int heroHit = hero.getHitPoints()+hero.getWeapon().getExtraHit();
                int hp = enemy.getHitPoints()-heroHit;
                enemy.setHitPoints(hp);
            }else{
                int hp = hero.getHitPoints()- enemy.getHitPoints();
                System.out.println("You was wonded, HP = " + hp);
                hero.setHitPoints(hp);
            }
            if(enemy.getHitPoints()<0){
                System.out.println("You have defited " + enemy.getName());
            }
        }
    }
}
