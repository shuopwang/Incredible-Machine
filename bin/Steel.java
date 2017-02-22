import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Steel {
	int x,y;
	Item object;
	
	boolean right=false;//right means there is bowing put upon the right side
	
	ImageIcon imageicon;
	JLabel obj=new JLabel();
	public Steel(int a,int b,int i) throws IOException {
		if(i==0)
		object=new Item(28,578,37,16);//i=0 heng
		if(i==1)
			object=new Item(149,540,15,35);//i=1 shu
		//need to change
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}

}
