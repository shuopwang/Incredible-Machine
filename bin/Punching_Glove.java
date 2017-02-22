import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Punching_Glove implements Runnable{
	int x,y;
	int f;
	ImageIcon p1;
	ImageIcon p2;
	ImageIcon p3;
	ImageIcon p4;
	ImageIcon p5;
	ImageIcon p6;
	ImageIcon p7;
	ImageIcon p8;
	ImageIcon p9;
	ImageIcon p10;
	
	int i=2;
	boolean reversal=true;
	boolean controlthread=true;
	boolean flag;
	JLabel obj=new JLabel();
	public int Gamespeed=120;
	public Punching_Glove(int a,int b) throws IOException {
		p1=new ImageIcon(new Item(5,957,55,42).getsubimage());
		p2=new ImageIcon(new Item(60,957,55,42).getsubimage());
		p3=new ImageIcon(new Item(114,963,83,40).getsubimage());
		p4=new ImageIcon(new Item(204,963,135,53).getsubimage());
		p5=new ImageIcon(new Item(342,957,69,47).getsubimage());
		p6=new ImageIcon(new Item(414,957,88,50).getsubimage());
		p7=new ImageIcon(new Item(504,957,80,48).getsubimage());
		p8=new ImageIcon(new Item(584,973,72,72).getsubimage());
		p9=new ImageIcon(new Item(658,972,81,80).getsubimage());
		p10=new ImageIcon(new Item(743,975,77,77).getsubimage());
		this.x=a;
		this.y=b;
		obj=new JLabel(p1);
		obj.setSize(p1.getIconWidth(),p1.getIconHeight());
		obj.setLocation(x,y);
	}
	public void run() {
		while(true)
		{	
			if(i<=10)
			changeImage();
			try{	
				Thread.sleep(Gamespeed);
				}
			catch(InterruptedException e){
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
			}
		}
	
	
	
	public void changeImage() {
		if(i==2)
			{	
				obj.setIcon(p2);
				obj.setSize(p2.getIconWidth(),p2.getIconHeight());
				obj.setLocation(f-55, this.y-10);
				//System.out.println("punchine i=2 ");
			}
			if(i==3)
			{
				obj.setIcon(p3);
				obj.setSize(p3.getIconWidth(),p3.getIconHeight());
				obj.setLocation(f-83,this.y-15);
				//System.out.println("punchine i=3 ");
			}
			if(i==4)
			{
				obj.setIcon(p4);
				obj.setSize(p4.getIconWidth(),p4.getIconHeight());
				obj.setLocation(f-135, this.y-20);
				//System.out.println("punching i=4 ");
			}
			if(i==5)
			{
				obj.setIcon(p5);
				obj.setSize(p5.getIconWidth(),p5.getIconHeight());
				obj.setLocation(f-69, this.y-20);
				//System.out.println("punchingi=5 ");
			}
			if(i==6)
			{
				obj.setIcon(p6);
				obj.setSize(p6.getIconWidth(),p6.getIconHeight());
				obj.setLocation(f-88, this.y-15);
				//System.out.println("punching i=6 ");
			}
			if(i==7)
			{
				obj.setIcon(p7);
				obj.setSize(p7.getIconWidth(),p7.getIconHeight());
				obj.setLocation(f-80, this.y-10);
				//System.out.println("i=4 x="+(jf.lv.pg.x+55-80));
			}
			if(i==8)
			{
				obj.setIcon(p8);
				obj.setSize(p8.getIconWidth(),p8.getIconHeight());
				obj.setLocation(f-72, this.y-5);
				//System.out.println("i=4 x="+(jf.lv.pg.x+55-72));
			}
			if(i==9)
			{
				obj.setIcon(p9);
				obj.setSize(p9.getIconWidth(),p9.getIconHeight());
				obj.setLocation(f-81, this.y-5);
				//System.out.println("i=4 x="+(jf.lv.pg.x+55-81));
			}
			if(i==10)
				{
					obj.setIcon(p10);
					obj.setSize(p10.getIconWidth(),p10.getIconHeight());
					obj.setLocation(f-77, this.y-2);
					//System.out.println("i=4 x="+(jf.lv.pg.x+55-77));
					flag=false;
				}
			i++;
		}
}


