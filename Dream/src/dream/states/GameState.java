package dream.states;

import java.awt.Graphics;
import dream.gfx.Assets;
import dream.entity.creatures.Player;
import dream.Game;

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
    }
    
}
