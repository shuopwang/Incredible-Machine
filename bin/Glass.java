import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Glass {
	int x,y;
	Item object;
	
	boolean meetflash=false;//right means there is bowing put upon the right side
	
	ImageIcon imageicon;
	JLabel obj=new JLabel();
	public Glass(int a,int b) throws IOException {
		object=new Item(262,29,27,40);
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
}