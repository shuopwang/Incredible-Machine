import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Item extends get_image_path{
	
	private BufferedImage subimage;
	public Item(int x,int y,int w,int h) throws IOException {
		subimage=image.getSubimage(x, y, w, h);
		
		}
	public BufferedImage getsubimage(){
		return subimage;
	}
	public  BufferedImage flipImage() {
        int w = subimage.getWidth();
        int h = subimage.getHeight();
        BufferedImage img= subimage;
        Graphics2D graphics2d;
        (graphics2d = img.createGraphics()).drawImage(subimage, 0, 0, w, h, w, 0, 0, h, null);
        graphics2d.dispose();
        return img;
    }

}
