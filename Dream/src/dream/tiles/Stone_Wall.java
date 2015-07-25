package dream.tiles;

//@author Jeremy Cheng

import dream.gfx.Assets;

public class Stone_Wall extends Tile{
    
    public Stone_Wall(int id){
        super(Assets.stone_wall, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
