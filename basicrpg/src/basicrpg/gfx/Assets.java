package basicrpg.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    private static final int width = 70, height = 70;
    
    public static BufferedImage player, dirt, water, tree;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tileset.png"));
        
        player = sheet.crop(0, 0, width, height);
        tree = sheet.crop(width, 0, width, height);
        water = sheet.crop(width * 2, 0, width, height);
        dirt = sheet.crop(0, height, width, height);
    }
    
}
