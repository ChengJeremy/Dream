package dream.tiles;

//@author Jeremy Cheng

import java.awt.*;
import java.awt.image.*;

//PUBLIC CLASS TILE!!!!
public class Tile {
    
    //STATIC STUFF HERE:::
    
    //2^8 is 256; 255 is the highest a byte can represent... (starting at 0)
    //EVERY SINGLE TILE MUST HAVE IT'S UNIQUE ID!!! (different)
    public static Tile[] tiles  = new Tile[256];
    
    public static Tile floorTile = new FloorTile(0);
    public static Tile wallTile = new WallTile(1);
    public static Tile wallTorch = new WallTorch(2);
    public static Tile stone_Floor = new Stone_Floor(3);
    public static Tile stone_Path = new Stone_Path(4);
    public static Tile stone_Wall = new Stone_Wall(5);
    public static Tile water_Tile = new Water_Tile(6);
    
    //CLASS
    
    public static final int TILE_WIDTH = 42, 
                            TILE_HEIGHT = 42;
    
    protected BufferedImage texture;
    protected final int id;
    
    //THIS LINKS TO "Tile[] tiles" ARRAY!!!!!
    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        
        //every id should be unique to each tile; Need reference integers for each tile!!! 
        //so should never have to be changed!
        this.id = id;
        //sets whatever called this array as the id and uses the "this" method; EX::: FloorTile calls - #0 and sets "this"
        tiles[id] = this;
        //for ex, tiles[0] = this; <- replace int inside the brackets with an int to access that particular tile
    }
    
    public void tick(){
        
        
        
    }
    
    //taking in parameters (x and y) here (IMPORTANT FOR EFFICIENCY!!!)
    //notes: 
    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }
    
    public boolean isSolid(){
        return false;
    }
    
    //return our tile id
    public int getID(){
        return id;
    }
    
}
