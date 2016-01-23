package dream.gfx;

//@author Jeremy Cheng

import java.awt.image.BufferedImage;

public class Assets {
    
    private static final int width = 42, height = 42;
    
    public static BufferedImage player, demon;
    public static BufferedImage floor, wall, torch;
    public static BufferedImage stone_floor, stone_path, stone_wall;
    public static BufferedImage water;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tileset/tileset.png"));
        
        player = sheet.crop(0, 0, (width * 2), (height * 2));
        demon = sheet.crop(0, 354, (width * 3), (height * 3));
        
        floor= sheet.crop(294, 0, (width * 2), (height * 2));
        wall = sheet.crop(84, 0, (width * 5), height);
        torch = sheet.crop(84, 42, (width * 5), height);
        
        stone_floor = sheet.crop(126, 438, width, height);
        stone_path = sheet.crop(168, 438, width, height);
        stone_wall = sheet.crop(210, 438, width, height);
        
        water = sheet.crop(252, 438, width, height);
        
    }
    
}
