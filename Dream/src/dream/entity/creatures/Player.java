package dream.entity.creatures;

import java.awt.Graphics;
import dream.Game;
import dream.gfx.*;

public class Player extends Creature{
    
    private Game game;
    
    public Player(Game game, float x, float y){
        super(x, y);
        this.game = game;
    }
    //not abstract class, so you need to implement the tick and render methods!
    //update here:
    @Override
    public void tick() {
        if(game.getKeyManager().up)
            y -= 3;
        if(game.getKeyManager().down)
            y += 3;
        if(game.getKeyManager().left)
            x -= 3;
        if(game.getKeyManager().right)
            x += 3;
    }
    
    //draw here:
    @Override
    public void render(Graphics g) {
        //drawImage method takes in integers, not floats; thus have to convert x and y from float to int, through a simple process called "casting"
        g.drawImage(Assets.player, (int)x, (int)y, null);
    }
    
}
