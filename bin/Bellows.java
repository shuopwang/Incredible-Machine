import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bellows {
	int x,y;
	Item object;
	boolean flag=false;//means the tool in the table
	public int state=1;//i=0 means staut=,1 means stat=
	
	ImageIcon imageicon;
	ImageIcon b1=new ImageIcon(new Item(15,357,67,50).getsubimage());
	ImageIcon b2=new ImageIcon(new Item(88,360,75,45).getsubimage());
	ImageIcon b3=new ImageIcon(new Item(164,371,80,27).getsubimage());
	JLabel obj=new JLabel();
	public Bellows(int a,int b) throws IOException {
		this.x=a;
		this.y=b;
		imageicon=b1;
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
		state++;
	}
	public void offbellow() {
		if(this.state==2)
		{
			obj.setIcon(b2);
			obj.setSize(b2.getIconWidth(),b2.getIconHeight());
			obj.setLocation(this.x-20, this.y-20);
		}
		if(this.state==3)
		{
			obj.setIcon(b3);
			obj.setSize(b3.getIconWidth(),b3.getIconHeight());
			obj.setLocation(this.x-20, this.y-20);
		}
		state++;
	}
}
