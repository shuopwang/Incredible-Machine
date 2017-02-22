import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Flashlight {
	int x,y;
	Item object;
	boolean flag=false;//means the tool in the table
	public int i=0;//i=0 means off,1 means on
	
	ImageIcon imageicon;
	ImageIcon lightoff=new ImageIcon(new Item(161,34,37,27).getsubimage());
	ImageIcon lighton=new ImageIcon(new Item(200,34,63,35).getsubimage());
	JLabel obj=new JLabel();
	public Flashlight(int a,int b) throws IOException {
		this.x=a;
		this.y=b;
		imageicon=lightoff;
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
	public void on() {
		obj.setIcon(lighton);
		obj.setSize(lighton.getIconWidth(),lighton.getIconHeight());
		obj.setLocation(this.x, this.y);
		this.i=1;
	}
}
