package dream.states;

//@author Jeremy Cheng

import java.awt.Graphics;
import dream.Game;

public abstract class State {
    
    protected Game game;
    
    public State(Game game){
        this.game = game;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
}
