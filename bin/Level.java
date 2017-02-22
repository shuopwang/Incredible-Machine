import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Level {
	JFinterface jf;
	Bowing bowing;
	Bowing b1;
	Bowing b2;
	Bellows bellow;
	see_saw ss;
	Punching_Glove pg;
	Balloon balloon;
	Balloon balloon2;
	List<Bowing> bowings=new ArrayList<Bowing>();
	Flashlight flashlight;
	Glass glass;
	Steel steel;
	Baseball baseball;
	JLabel jl1=new JLabel();
	int i;
	public Level(JFinterface jfinterface) throws IOException {
		this.jf=jfinterface;
		if(jf.level==1)
		{	for(i=1;i<10;i++)
			{
				bowing=new Bowing(520,100);
				bowings.add(bowing);
			}
			jl1=new JLabel(" "+bowings.size());
			jl1.setLocation(520, 200);
			
			//the tool
			ss=new see_saw(250,200);
			b1=new Bowing(220,200);
			b2=new Bowing(320,200);
			
			//bowing.flag=true;
			jf.jpcentre.add(jl1);
			jf.jpcentre.add(ss.obj);
			jf.jpcentre.add(b1.obj);
			jf.jpcentre.add(b2.obj);
			for(i=0;i<bowings.size();i++)
			{
				jf.jpcentre.add(bowings.get(i).obj);
				bowings.get(i).obj.addMouseListener(jf.ma);
				bowings.get(i).obj.addMouseMotionListener(jf.ma);
			}
		}
		
	}
	//this time i try to every time after we finish the truc,we are going to remove the JLabel;
	public void create() throws IOException
	{
		if(jf.level==2)
		{	
			pg=new Punching_Glove(520,100);
			ss=new see_saw(250,200);
			b1=new Bowing(220,200);
			
			b1.x=220;b1.y=250;
			jf.jpcentre.add(ss.obj);
			jf.jpcentre.add(b1.obj);
			jf.jpcentre.add(pg.obj);
			pg.obj.addMouseListener(jf.ma);
			pg.obj.addMouseMotionListener(jf.ma);
		}
		if(jf.level==3)
		{
			bowing=new Bowing(520,50);
			ss=new see_saw(520,150);
			flashlight=new Flashlight(520,250);
			glass=new Glass(520,300);
			
			balloon=new Balloon(200,200);
			jf.jpcentre.add(bowing.obj);
			jf.jpcentre.add(ss.obj);
			jf.jpcentre.add(flashlight.obj);
			jf.jpcentre.add(glass.obj);
			
			jf.jpcentre.add(balloon.obj);
			
			bowing.obj.addMouseListener(jf.ma);
			bowing.obj.addMouseMotionListener(jf.ma);
			ss.obj.addMouseListener(jf.ma);
			ss.obj.addMouseMotionListener(jf.ma);
			flashlight.obj.addMouseListener(jf.ma);
			flashlight.obj.addMouseMotionListener(jf.ma);
			glass.obj.addMouseListener(jf.ma);
			glass.obj.addMouseMotionListener(jf.ma);
			
		}
		if(jf.level==4)
		{
			jf.jpcentre.remove(bowing.obj);
			jf.jpcentre.remove(ss.obj);
			jf.jpcentre.remove(flashlight.obj);
			jf.jpcentre.remove(glass.obj);
			jf.jpcentre.remove(balloon.obj);
			
			steel=new Steel(290,200,0);
			balloon=new Balloon(200,200);
			balloon2=new Balloon(200,300);
			flashlight=new Flashlight(520,50);
			glass=new Glass(520,150);
			bellow=new Bellows(520,230);
			ss=new see_saw(225,175);
			baseball=new Baseball(270,180);
			
			jf.jpcentre.add(baseball.obj);
			jf.jpcentre.add(steel.obj);
			jf.jpcentre.add(balloon.obj);
			jf.jpcentre.add(balloon2.obj);
			jf.jpcentre.add(flashlight.obj);
			jf.jpcentre.add(glass.obj);
			jf.jpcentre.add(bellow.obj);
			jf.jpcentre.add(ss.obj);

			flashlight.obj.addMouseListener(jf.ma);
			flashlight.obj.addMouseMotionListener(jf.ma);
			glass.obj.addMouseListener(jf.ma);
			glass.obj.addMouseMotionListener(jf.ma);
			bellow.obj.addMouseListener(jf.ma);
			bellow.obj.addMouseMotionListener(jf.ma);
			
		}
	}
	
}
