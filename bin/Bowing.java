import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Bowing implements Runnable{
	
	int x,y;
	Item object;
	int i=1;
	public boolean flag=false;//false means the bowing is in the tool,true means in the game; 
	public boolean controlthread=true;//test if the bowing touch the flooring
	public boolean start=false;
	//public boolean pwx=false;
	public int right=0;//1 right side is heavy then left,-1 lighter,0,balance
	ImageIcon imageicon;
	
	int Gamespeed=30;
	JLabel obj=new JLabel();
	public Bowing(int a,int b) throws IOException {
		object=new Item(6,13,39,37);
		this.x=a;
		this.y=b;
		imageicon=new ImageIcon(object.getsubimage());
		obj=new JLabel(imageicon);
		obj.setSize(imageicon.getIconWidth(),imageicon.getIconHeight());
		obj.setLocation(x,y);

	}
	public void move() {
		int yy=obj.getY(),xx=obj.getX();
		if(yy<370)
			yy=yy+i;
		if(right==1&&xx<490)
			xx=xx+5;
		if(right==-1&&xx>0)
			xx=xx-5;
		obj.setLocation(xx,yy);
		System.out.println("bowing x= "+xx+" y ="+yy);
		i++;
		
	}
	public void fastmove(){
		int yy=obj.getY(),xx=obj.getX();
		if(yy<370)
			yy=yy+5*i;
		if(right==1&&xx<490)
			xx=xx+10;
		if(right==-1&&xx>520)
			xx=xx-10;
		obj.setLocation(xx,yy);
	}
	@Override
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

