import java.io.IOException;

public class Start {
	JFinterface jf;
	int i=2;
	Thread t1,t2,t3;
	
	public Start(JFinterface jfinterface) {
		super();
		this.jf=jfinterface;
	}
	@SuppressWarnings("deprecation")
	public void start_level()
	{
		if(jf.level==1)
		{		
			if(jf.GameSpeed>0)
				{
				jf.lv.b1.Gamespeed=jf.lv.b1.Gamespeed/2;
				jf.lv.b2.Gamespeed=jf.lv.b2.Gamespeed/2;
				jf.lv.bowing.Gamespeed=jf.lv.bowing.Gamespeed/2;
				}
			
			if(jf.GameSpeed<0)
			{
				jf.lv.b1.Gamespeed=jf.lv.b1.Gamespeed*2;
				jf.lv.b2.Gamespeed=jf.lv.b2.Gamespeed*2;
				jf.lv.bowing.Gamespeed=jf.lv.bowing.Gamespeed*2;
			}
			if(jf.GameSpeed==0)
			{
				jf.lv.b1.Gamespeed=30;
				jf.lv.b2.Gamespeed=30;
				jf.lv.bowing.Gamespeed=30;
			}
			
			if(jf.lv.bowing.controlthread==true&&jf.lv.bowing.flag==true)
					{	
						t3=(new Thread(jf.lv.bowing));
						jf.lv.bowing.controlthread=false;
						t3.start();
					}
				if(jf.lv.bowing.obj.getX()-jf.lv.b1.obj.getX()<50&&jf.lv.bowing.obj.getY()>200&&jf.lv.b1.controlthread==true&&jf.lv.b2.controlthread==true&&(jf.lv.bowing.obj.getX()-jf.lv.b1.obj.getX())>0)
				{
					System.out.println("x entre(225,290)");
					jf.lv.ss.i=-1;
					jf.lv.ss.obj.setIcon(jf.lv.ss.ssl);
					jf.lv.b2.y=jf.lv.b2.y-20;
					jf.lv.b2.obj.setLocation(jf.lv.b2.x, jf.lv.b2.y);
					jf.lv.b1.y=jf.lv.b1.y+20;
					jf.lv.b1.obj.setLocation(jf.lv.b1.x,jf.lv.b1.y);
					jf.lv.bowing.y=jf.lv.bowing.y+20;
					jf.lv.bowing.obj.setLocation(jf.lv.bowing.x, jf.lv.bowing.y);
					jf.lv.bowing.right=-1;
					jf.lv.b1.right=-1;
					jf.lv.b2.right=1;
					t1=new Thread(jf.lv.b1);
					t1.start();
					t2=(new Thread(jf.lv.b2));
					t2.start();
					jf.lv.b1.controlthread=false;
					jf.lv.b2.controlthread=false;
				}
				if(jf.lv.b2.obj.getX()-jf.lv.bowing.obj.getX()<50&&jf.lv.bowing.obj.getY()>200&&jf.lv.b1.controlthread==true&&jf.lv.b2.controlthread==true&&(jf.lv.b2.obj.getX()-jf.lv.bowing.obj.getX())>0)
				{	
					System.out.println("i came the are x entre(290,350)");
					jf.lv.ss.i=1;
					jf.lv.ss.obj.setIcon(jf.lv.ss.ssr);;
					jf.lv.b1.y=jf.lv.b1.y-20;
					jf.lv.b1.obj.setLocation(jf.lv.b1.x, jf.lv.b1.y);
					jf.lv.b2.y=jf.lv.b2.y+20;
					jf.lv.b2.obj.setLocation(jf.lv.b2.x,jf.lv.b2.y);
					jf.lv.bowing.y=jf.lv.bowing.y+20;
					jf.lv.bowing.obj.setLocation(jf.lv.bowing.x, jf.lv.bowing.y);
					jf.lv.bowing.right=1;
					jf.lv.b1.right=-1;
					jf.lv.b2.right=1;
					t1=new Thread(jf.lv.b1);
					t1.start();
					t2=(new Thread(jf.lv.b2));
					t2.start();
					jf.lv.b1.controlthread=false;
					jf.lv.b2.controlthread=false;
				}
	
			
			if(jf.lv.b1.obj.getY()>=360&&jf.lv.b2.obj.getY()>=360)
				{
					jf.flag=true;
					
					t1.stop();
					t2.stop();
					t3.stop();
				}
			if(jf.lv.b1.obj.getY()==200&&jf.lv.b2.obj.getY()==200&&jf.lv.bowing.obj.getY()>300)
				{
					jf.failed=true;
					System.out.println("failed");
				}
			if(jf.flag==true||jf.failed==true)
			{	if(jf.failed==true)
					{	
						t3.stop();
					}
				jf.jpcentre.remove(jf.lv.ss.obj);
				jf.jpcentre.remove(jf.lv.b1.obj);
				jf.jpcentre.remove(jf.lv.b2.obj);
				jf.jpcentre.remove(jf.lv.bowing.obj);
				
			}
			
			
	
		}
		if(jf.level==2)
		{	
			if(jf.GameSpeed>0)
			{
				jf.lv.b1.Gamespeed=jf.lv.b1.Gamespeed/2;
				jf.lv.pg.Gamespeed=jf.lv.pg.Gamespeed/2;
			}
	
			if(jf.GameSpeed<0)
			{
				jf.lv.b1.Gamespeed=jf.lv.b1.Gamespeed*2;
				jf.lv.pg.Gamespeed=jf.lv.pg.Gamespeed*2;
			}
			if(jf.GameSpeed==0)
			{
				jf.lv.b1.Gamespeed=30;
				jf.lv.pg.Gamespeed=120;
			}
	
			
			if(jf.lv.pg.flag==true&&jf.lv.pg.controlthread==true)
			{
				t1=(new Thread(jf.lv.pg));
				t1.start();
				jf.lv.pg.controlthread=false;
				
			}		
			if((jf.lv.pg.obj.getX()-5)<=(jf.lv.b1.obj.getX()+40))
				{
				jf.lv.b1.start=true;
				jf.lv.b1.right=-1;
				}
			if(jf.lv.b1.start==true&&jf.lv.b1.controlthread==true)
				{
					t2=(new Thread(jf.lv.b1));
					t2.start();
					jf.lv.b1.controlthread=false;
				}
			if(jf.lv.pg.i>7&&jf.lv.b1.obj.getY()==200)
				jf.failed=true;
			if(jf.lv.b1.obj.getY()>=370)
				{
					jf.flag=true;
					jf.lv.pg.i=2;
					t1.stop();
					t2.stop();
				}
			
			if(jf.flag==true||jf.failed==true)
			{
				jf.jpcentre.remove(jf.lv.ss.obj);
				jf.jpcentre.remove(jf.lv.b1.obj);
				jf.jpcentre.remove(jf.lv.pg.obj);
				if(jf.failed==true)
				{
					t1.stop();
				}
			}
			
		}
		if(jf.level==3)
		{	if(jf.GameSpeed>0)
			{
				jf.lv.bowing.Gamespeed=jf.lv.bowing.Gamespeed/2;
				jf.lv.balloon.Gamespeed=jf.lv.balloon.Gamespeed/2;
			}
	
			if(jf.GameSpeed<0)
			{
				jf.lv.balloon.Gamespeed=jf.lv.balloon.Gamespeed*2;
				jf.lv.bowing.Gamespeed=jf.lv.bowing.Gamespeed*2;
			}
			if(jf.GameSpeed==0)
			{
				jf.lv.balloon.Gamespeed=120;
				jf.lv.bowing.Gamespeed=30;
			}
	
			
			if(jf.lv.flashlight.x+40>jf.lv.glass.x)
				jf.lv.glass.meetflash=true;
			if(jf.lv.flashlight.flag==true&&jf.lv.glass.meetflash==true)
				jf.lv.flashlight.on();
			if(jf.lv.flashlight.x+65>jf.lv.balloon.x&&jf.lv.flashlight.i==1&&jf.lv.balloon.controlthread==true)
				{
					t1=(new Thread(jf.lv.balloon));
					t1.start();
					jf.lv.balloon.controlthread=false;
				}
			if(jf.lv.flashlight.x+65<jf.lv.balloon.x||jf.lv.flashlight.x>=jf.lv.balloon.x||jf.lv.glass.meetflash==false)
				jf.failed=true;
			if(jf.lv.balloon.i>=7)
			{
				jf.flag=true;
				t1.stop();
			}
			if(jf.lv.bowing.flag==true&&jf.lv.bowing.controlthread==true)
				{
					t2=(new Thread(jf.lv.bowing));
					t2.start();
					
				}
			if(jf.lv.bowing.obj.getY()>=370)
			{
				jf.failed=true;
				t2.stop();
			}
			if(jf.flag==true||jf.failed==true)
			{
				jf.jpcentre.remove(jf.lv.bowing.obj);
				jf.jpcentre.remove(jf.lv.ss.obj);
				jf.jpcentre.remove(jf.lv.flashlight.obj);
				jf.jpcentre.remove(jf.lv.glass.obj);
				jf.jpcentre.remove(jf.lv.balloon.obj);
			}
		}
		if(jf.level==4)
		{	if(jf.GameSpeed>0)
			{
				jf.lv.bowing.Gamespeed=jf.lv.b1.Gamespeed/2;
				jf.lv.balloon.Gamespeed=jf.lv.balloon.Gamespeed/2;
				jf.lv.balloon2.Gamespeed=jf.lv.balloon2.Gamespeed/2;
				jf.lv.baseball.Gamespeed=jf.lv.baseball.Gamespeed/2;
			}

			if(jf.GameSpeed<0)
			{
				jf.lv.bowing.Gamespeed=jf.lv.bowing.Gamespeed*2;
				jf.lv.balloon.Gamespeed=jf.lv.balloon.Gamespeed*2;
				jf.lv.balloon2.Gamespeed=jf.lv.balloon2.Gamespeed*2;
				jf.lv.baseball.Gamespeed=jf.lv.baseball.Gamespeed*2;
			}
			if(jf.GameSpeed==0)
			{
				jf.lv.balloon.Gamespeed=120;
				jf.lv.balloon2.Gamespeed=120;
				jf.lv.baseball.Gamespeed=50;
				jf.lv.bowing.Gamespeed=30;
			}

			if(jf.lv.flashlight.x+40>jf.lv.glass.x)
				jf.lv.glass.meetflash=true;
			if(jf.lv.flashlight.flag==true&&jf.lv.glass.meetflash==true)
				jf.lv.flashlight.on();
			if(jf.lv.flashlight.x+65>jf.lv.balloon.x&&jf.lv.flashlight.i==1&&jf.lv.balloon.controlthread==true)
			{
				t1=(new Thread(jf.lv.balloon));
				t1.start();
				jf.lv.balloon.controlthread=false;
			}
			if(jf.lv.balloon.i>4)
				try {
					jf.lv.ss.i=-1;
					jf.lv.ss.change();
					//System.out.println("see_saw changed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(jf.lv.flashlight.x+65<jf.lv.balloon.x||jf.lv.flashlight.x>=jf.lv.balloon.x||jf.lv.bellow.x>jf.lv.balloon2.x)
				jf.failed=true;
			
			if(jf.lv.ss.i==-1&&jf.lv.baseball.controlthread==true)
			{	jf.lv.baseball.right=-1;
				t2=(new Thread(jf.lv.baseball));
				t2.start();
				jf.lv.baseball.controlthread=false;
			}
			if(jf.lv.baseball.obj.getX()<jf.lv.bellow.obj.getX()&&jf.lv.baseball.obj.getY()>jf.lv.bellow.obj.getY())
			{
				//System.out.println("bellow haved used");
				jf.lv.bellow.offbellow();
			}
			if(jf.lv.bellow.state>=4&&jf.lv.balloon2.controlthread==true&&jf.lv.bellow.x+90>jf.lv.balloon2.x&&jf.lv.balloon2.x>jf.lv.bellow.x)
			{
				t3=(new Thread(jf.lv.balloon2));
				t3.start();
				jf.lv.balloon2.controlthread=false;
			}
			if(jf.lv.balloon2.i==7)
			{
				//System.out.println("flag=true");
				jf.flag=true;
				jf.lv.balloon2.i=2;
				t1.stop();
				t2.stop();
				t3.stop();
			}
			if(jf.flag==true||jf.failed==true)
			{
				jf.jpcentre.remove(jf.lv.balloon.obj);
				jf.jpcentre.remove(jf.lv.ss.obj);
				jf.jpcentre.remove(jf.lv.flashlight.obj);
				jf.jpcentre.remove(jf.lv.glass.obj);
				jf.jpcentre.remove(jf.lv.balloon2.obj);
				jf.jpcentre.remove(jf.lv.bellow.obj);
				jf.jpcentre.remove(jf.lv.steel.obj);
				jf.jpcentre.remove(jf.lv.baseball.obj);
			}
		}
		
	}

}
