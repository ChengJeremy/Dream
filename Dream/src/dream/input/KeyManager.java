package dream.input;

//@author Jeremy Cheng

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
    
    private boolean[] keys;
    public boolean up, down, left, right;
    
    //SEE KEYBOARD NOTES IN THE NOTES FOLDER!!!
    public KeyManager(){
        keys = new boolean[256];
    }
    
    public void tick(){
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    }
    
    //these: whenever a person presses a key, this method is called
    //true: key is being pressed
    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()] = true;
        System.out.println("pressed");
    }
    
    //whenever the following is released, this method is called
    //false: key not being pressed
    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()] = false;
        //System.out.println("released");
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    
}
