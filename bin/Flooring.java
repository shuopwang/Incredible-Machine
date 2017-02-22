import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Flooring {
	int x,y;
	Item object;
	
	boolean right=false;//right means there is bowing put upon the right side
	
	ImageIcon imageicon;
	JLabel obj=new JLabel();
	public Flooring(int a,int b) throws IOException {
		object=new Item(7,517,78,21);
		//need to change
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
}
