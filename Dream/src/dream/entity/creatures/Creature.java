package dream.entity.creatures;

//@author Jeremy Cheng

import dream.Game;
import dream.entity.Entity;

//extends, so NEED ALL PARAMETERS TO MATCH!!!
public abstract class Creature extends Entity{
    
    //final so that no one can change the initial value for creatures! 
    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 84,
                            DEFAULT_CREATURE_HEIGHT = 84;
    
    protected int health;
    //float because we are working with a position! (dealing with movement, so not exactly exact)
    protected float speed;
    protected float xMove, yMove;
    
    public Creature(Game game, float x, float y, int width, int height){
        
        //super method will lead to the Entity class constructor with the arguments passed into it. 
        //extends the thing that "extends"
        super(game, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }
    //abstract so no tick and render methods

    public void move(){
        x += xMove;
        y += yMove;
    }
    
    //THESE BELOW ARE GETTERS/SETTERS!!!
    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    //next feew
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
}
