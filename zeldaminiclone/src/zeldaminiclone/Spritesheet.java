package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	private static BufferedImage spritesheet;
	
	public static BufferedImage player_front;
	
	public static BufferedImage tileWall;

	static {
		try {
			 spritesheet = ImageIO.read(Spritesheet.class.getResource("/spritesheet.png"));
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		player_front = getSprite(0, 11, 16, 16);
		tileWall = Spritesheet.getSprite(199,189,16,16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		
		return spritesheet.getSubimage(x, y, width, height);
	}
}
