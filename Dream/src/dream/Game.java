package dream;

//@author Jeremy Cheng

import dream.display.Display;
import dream.gfx.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import dream.states.*;
import dream.input.KeyManager;

public class Game implements Runnable{
    
    private Display display;
    private int width, height;
    public String title;
    
    private boolean running = false;
    private Thread thread;
    
    private BufferStrategy bs;
    private Graphics g;
    
    
    //States
    private State gameState;
    private State mmState;
    private State settings;
    
    //Input
    private KeyManager keyManager;
    
    //Camera
    private GameCamera gameCamera;
    
    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
    }
    
    private void init(){
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();
        
        gameCamera = new GameCamera(this, 0, 0);
        
        gameState = new GameState(this);
        mmState = new MMState(this);
        settings = new Settings(this);
        
        GameStateManager.setState(gameState);
    }
    
    private void tick(){
        keyManager.tick();
        
        if(GameStateManager.getState() != null)
            GameStateManager.getState().tick();
    }
    
    private void render(){
        //buffers are to prevent any flickering or screen malfunctions during gameplay... like a hidden screen behind your screen that you can't see. 
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Clear Screen
        g.clearRect(0, 0, width, height);
        //Draw Here:
        
        if(GameStateManager.getState() != null)
            GameStateManager.getState().render(g);
        
        //End Drawing:
        bs.show();
        g.dispose();
    }
    
    public void run(){
        
        init();
        
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;
        
        while(running){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;
            
            if(delta >= 1){
                tick();
                render();
                ticks++;
                delta--;
            }
            
            //checks how many ticks have passed in the timer
            if(timer >= 1000000000){
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        
        stop();
        
    }
    
    public KeyManager getKeyManager(){
        return keyManager;
    }
    
    public GameCamera getGameCamera(){
        return gameCamera;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    //use synchronized method whenever working with threads directly; when starting or stopping a thread directly, use so as to not mess anything up in the process. 
    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
