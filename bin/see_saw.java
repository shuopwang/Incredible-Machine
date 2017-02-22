import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class see_saw {

	int x,y;
	Item object;
	boolean flag;
	
	public static int i=0;//i=0 means initied,i=1 right side is heavy then left,i=-1 is opposite
	
	ImageIcon imageicon;
	ImageIcon ssb=new ImageIcon(new Item(515,533,81,43).getsubimage());
	ImageIcon ssr=new ImageIcon(new Item(600,533,81,43).getsubimage());
	ImageIcon ssl=new ImageIcon(new Item(430,533,81,43).getsubimage());
	JLabel obj=new JLabel();
	public boolean controlthread=true;
	public see_saw(int a,int b) throws IOException {
		if(i==0)
		object=new Item(515,533,81,43);
		
		if(i==-1)
		object=new Item(430,533,81,43);
		
		if(i==1)
			object=new Item(600,533,81,43);
		
		//need to change
		this.x=a;
		this.y=b;
		imageicon=ssb;
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);
	}
	public void change() throws IOException{
		if(i==0)
		{
			imageicon=ssb;
			obj.setIcon(imageicon);
			obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
			obj.setLocation(x,y);
			}		
		if(i==-1)
		{
			imageicon=ssl;
			obj.setIcon(imageicon);
			obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
			obj.setLocation(x,y);
		}	
		if(i==1)
		{	imageicon=ssr;
			obj.setIcon(imageicon);
			obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
			obj.setLocation(x,y);
		}
			
	}
}
