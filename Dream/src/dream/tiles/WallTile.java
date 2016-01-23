package dream.tiles;

//@author Jeremy Cheng

import dream.gfx.Assets;

public class WallTile extends Tile{
    
    public WallTile(int id){
        super(Assets.wall, id);
    }
    
    //Good programming practice dictate that 
    //you should always write @Override in your code 
    //when certain code is being overriden (such as repeating a method in a parent class that this class is extending. )
    @Override
    public boolean isSolid(){
        return true;
    }
    
}
