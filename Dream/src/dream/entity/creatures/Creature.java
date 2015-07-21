package dream.entity.creatures;

import dream.entity.Entity;

public abstract class Creature extends Entity{
    
    protected int health;
    
    public Creature(float x, float y){
        
        //super method will lead to the Entity class constructor with the arguments passed into it. 
        //extends the thing that "extends"
        super(x, y);
        health = 10;
    }
    //abstract so no tick and render methods
    
}
