package my.game.exceptions;

public class ToShortHeroNameException extends RuntimeException{

    private static final String ERROR_MESSAGE = "Name is too short";

    public ToShortHeroNameException(){
        super(ERROR_MESSAGE);
    }
}
