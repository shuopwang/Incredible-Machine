import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Button_fast {
	int x,y;
	Item object;
	
	boolean right=false;//right means there is bowing put upon the right side
	
	ImageIcon imageicon;
	JLabel obj=new JLabel();
	public Button_fast(int a,int b) throws IOException {
		object=new Item(240,1621,29,25);
		//need to change
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
}
