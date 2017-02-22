import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Balloon implements Runnable{
	int x,y;
	
	ImageIcon p1;
	ImageIcon p2;
	ImageIcon p3;
	ImageIcon p4;
	ImageIcon p5;
	ImageIcon p6;
	ImageIcon p7;
	
	int Gamespeed=200;
	int i=2;
	boolean controlthread=true;
	boolean flag;
	JLabel obj=new JLabel();
	public Balloon(int a,int b) throws IOException {
		p1=new ImageIcon(new Item(9,91,42,55).getsubimage());
		p2=new ImageIcon(new Item(58,85,82,73).getsubimage());
		p3=new ImageIcon(new Item(146,83,91,76).getsubimage());
		p4=new ImageIcon(new Item(242,90,100,73).getsubimage());
		p5=new ImageIcon(new Item(352,100,94,56).getsubimage());
		p6=new ImageIcon(new Item(457,100,94,53).getsubimage());
		p7=new ImageIcon(new Item(559,95,93,62).getsubimage());
		this.x=a;
		this.y=b;
		obj=new JLabel(p1);
		obj.setSize(p1.getIconWidth(),p1.getIconHeight());
		obj.setLocation(x,y);
	}
	public void expolde() {
		if(i==2)
		{
			obj.setIcon(p2);
			obj.setSize(p2.getIconWidth(),p2.getIconHeight());
			obj.setLocation(this.x+42-82, this.y);
		}
		if(i==3)
		{
			obj.setIcon(p3);
			obj.setSize(p3.getIconWidth(),p3.getIconHeight());
			obj.setLocation(this.x+42-91,this.y);
		}
		if(i==4)
		{
			obj.setIcon(p4);
			obj.setSize(p4.getIconWidth(),p4.getIconHeight());
			obj.setLocation(this.x+42-100, this.y);
		}
		if(i==5)
		{
			obj.setIcon(p5);
			obj.setSize(p5.getIconWidth(),p5.getIconHeight());
			obj.setLocation(this.x+42-94, this.y);
		}
		if(i==6)
		{
			obj.setIcon(p6);
			obj.setSize(p6.getIconWidth(),p6.getIconHeight());
			obj.setLocation(this.x+42-94, this.y);
			//System.out.println("i=4 x="+(jf.lv.pg.x+55-88));
		}
		if(i==7)
		{
			obj.setIcon(p7);
			obj.setSize(p7.getIconWidth(),p7.getIconHeight());
			obj.setLocation(this.x+42-93, this.y);
			//System.out.println("i=4 x="+(jf.lv.pg.x+55-80));
		}
		i++;
	}
	@Override
	public void run()
	{
		while(true)
		{
			if(i<=7)
			{
				expolde();
			}
				
			try{	
				Thread.sleep(Gamespeed);
				}
			catch(InterruptedException e){
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
		}
	}
		
}


