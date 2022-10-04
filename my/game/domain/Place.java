package my.game.domain;

public abstract class Place {

    public void showPlaceOfOccurrence(){ // miejsce występowania
        String occure = getPlaceOfOccurrence();
        System.out.println("Enemy has occurred in " + occure);
    }

    abstract protected String getPlaceOfOccurrence();
}
