import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Button_start {
	int x,y;
	Item object;
	
	boolean right=false;//right means there is bowing put upon the right side
	
	ImageIcon imageicon;
	JLabel obj=new JLabel();
	public Button_start(int a,int b) throws IOException {
		object=new Item(213,1562,56,53);
		//need to change
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
}
