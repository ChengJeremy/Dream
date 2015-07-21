package dream.entity;

import java.awt.Graphics;

//there are more efficient versions out there(of entities and the general flow of the code)

//we want the player to create a specific entity such as Player or Item;  (not a random one!!!)
public abstract class Entity {
    
    //protected: basically private, but classes that extend this class also have access to them. 
    
    //float because smoother look; not perfect increments in game, so float is better than int in this case. 
    protected float x, y;
    //FIRST CLASS (SEE ENTITY QUICK DIAGRAM TXT FILE (in notes))
    public Entity(float x, float y){
        //initialize otherwise will give error
        this.x = x;
        this.y = y;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
}
