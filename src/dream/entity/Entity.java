package dream.entity;

import java.awt.Graphics;

//there are more efficient versions out there(of entities and the general flow of the code)

//we want the player to create a specific entity such as Player or Item;  (not a random one!!!)
public abstract class Entity {
    
    //protected: basically private, but classes that extend this class also have access to them. 
    
    //float because smoother look; not perfect increments in game, so float is better than int in this case. 
    protected float x, y;
    protected int width, height;
    
    //FIRST CLASS (SEE ENTITY QUICK DIAGRAM TXT FILE (in notes))
    public Entity(float x, float y, int width, int height){
        //initialize otherwise will give error
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //getters and setters; setters take in a parameter and sets a private variable

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
}
