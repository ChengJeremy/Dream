package dream.tiles;

//@author Jeremy Cheng

import dream.gfx.Assets;

public class WallTorch extends Tile{
    public WallTorch(int id){
        super(Assets.torch, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
    
}
