package dream.tiles;

//@author Jeremy Cheng

import dream.gfx.Assets;

//"extends" is VERY implicative of OBJECT-ORIENTED PROGRAMMING!!!
public class FloorTile extends Tile{
    
    public FloorTile(int id){
        super(Assets.floor, id);
        
    }
    
}
