package dream.states;

//@author Jeremy Cheng

import java.awt.Graphics;
import dream.gfx.Assets;
import dream.entity.creatures.Player;
import dream.Game;
import dream.tiles.Tile;

public class GameState extends State{
    
    private Player player;
    
    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
    }
    
    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        player.render(g);
        //test: (BTW CAN ACCESS BECAUSE TILES IS (IN) PUBLIC AND STATIC!!!)
        //class_name.SOMETHING ::::: SOMETHING DENOTES ANY OBJECT IN THAT CLASS!!!
        Tile.tiles[2].render(g, 0, 0);
    }
    
}
