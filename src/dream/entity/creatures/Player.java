package dream.entity.creatures;

import java.awt.Graphics;
import dream.Game;
import dream.gfx.*;

public class Player extends Creature{
    
    private Game game;
    
    public Player(Game game, float x, float y){
        super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
        this.game = game;
    }
    //not abstract class, so you need to implement the tick and render methods!
    //update here:
    @Override
    public void tick() {
        //first set methods in getInput()
        getInput();
        //then execute getInput() -> move() is located in Creature, which Player class extends! 
        move();
    }
    
    private void getInput(){
        xMove = 0;
        yMove = 0;
        
        //against the y-axis for computer graphics/ pixes is negative, while with the axis is positive
        //this code moves the character!
        if(game.getKeyManager().up)
            yMove = -speed;
        if(game.getKeyManager().down)
            yMove = speed;
        if(game.getKeyManager().left)
            xMove = -speed;
        if(game.getKeyManager().right)
            xMove = speed;
    }
    
    //draw here:
    @Override
    public void render(Graphics g) {
        //drawImage method takes in integers, not floats; thus have to convert x and y from float to int, through a simple process called "casting"
        g.drawImage(Assets.player, (int)x, (int)y, width, height, null);
    }
    
}
