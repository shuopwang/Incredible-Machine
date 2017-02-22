import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Baseball implements Runnable{
	int x,y;
	Item object;
	
	public boolean flag=false;//false means the bowing is in the tool,true means in the game; 
	public boolean start=false;
	public boolean controlthread=true;
	//public boolean pwx=false;
	public int right=0;//1 right side is heavy then left,-1 lighter,0,balance
	ImageIcon imageicon;
	
	int Gamespeed=50;
	
	JLabel obj=new JLabel();
	public Baseball(int a,int b) throws IOException {
		object=new Item(119,21,20,20);
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);

	}
	public void move() {
		int yy=obj.getY(),xx=obj.getX();
		if(yy<=380)
			yy=yy+10;
		if(right==1&&xx<490)
			xx=xx+10;
		if(right==-1&&xx>0)
			xx=xx-10;
		obj.setLocation(xx,yy);
		
	}
	public void run() {
		
		while(true)
		{
			move();
			try{	
				Thread.sleep(Gamespeed);
				}
			catch(InterruptedException e){
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
		}
	}
}
