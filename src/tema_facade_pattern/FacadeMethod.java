package tema_facade_pattern;

public class FacadeMethod {
    public static void main(String args[]){
        GameMaker gameMaker = new GameMaker();

        gameMaker.playFootball();
        gameMaker.playBascketball();
        gameMaker.playHandball();
    }
}
