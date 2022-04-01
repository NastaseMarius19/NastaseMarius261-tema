package tema_facade_pattern;

import java.util.jar.JarEntry;

public class GameMaker {
    private Game football;
    private Game bascketball;
    private Game handball;

    public GameMaker() {
        football = new Football();
        bascketball = new Bascketball();
        handball = new Handball();
    }

    public void playFootball(){
        football.play();
    }

    public void playBascketball(){
        bascketball.play();
    }

    public void playHandball(){
        handball.play();
    }
}
