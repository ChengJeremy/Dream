package dream.states;

//@author Jeremy Cheng

import java.awt.Graphics;
import dream.gfx.Assets;
import dream.entity.creatures.Player;
import dream.Game;
import dream.tiles.Tile;
import dream.worlds.World;

public class GameState extends State{
    
    private Player player;
    private World world;
    
    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100); 
        world = new World(game, "res/worlds/world1.txt");
        
        //game.getGameCamera().move(0, 0);
    }
    
    @Override
    public void tick() {
        world.tick();
        player.tick();
        
        //game.getGameCamera().move(1, 1);
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
        //test: (BTW CAN ACCESS BECAUSE TILES IS (IN) PUBLIC AND STATIC!!!)
        //class_name.SOMETHING ::::: SOMETHING DENOTES ANY OBJECT IN THAT CLASS!!!
        //Tile.tiles[2].render(g, 0, 0);
    }
    
}
