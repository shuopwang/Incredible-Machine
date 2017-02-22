import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class get_image_path {
	protected static BufferedImage image;
	protected static BufferedImage start;
	public get_image_path() throws IOException{
		super();
		this.image= ImageIO.read(get_image_path.class.getClassLoader().getResourceAsStream("IncrMachine.png"));
		this.start= ImageIO.read(get_image_path.class.getClassLoader().getResourceAsStream("start.png"));
	}
}
