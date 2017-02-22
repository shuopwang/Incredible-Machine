import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

public class Mouseaction implements MouseInputListener{
	JFinterface jf;
	Welcome welcome;
	int i=0;
	public Mouseaction(JFinterface jfinterface) {
		super();
		this.jf=jfinterface;
	}
	
	public void mousePressed(MouseEvent e)
	{
		if(jf.level==1)
		{	if(jf.lv.bowings.size()-i>0)
				{if(e.getSource()==jf.lv.bowings.get(i).obj)
					jf.point=SwingUtilities.convertPoint(jf.lv.bowings.get(i).obj,e.getPoint(),jf.lv.bowings.get(i).obj.getParent()); //得到当前坐标点
				i++;
				}
		}
		if(jf.level==2)
		{
			if(e.getSource()==jf.lv.pg.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.pg.obj,e.getPoint(),jf.lv.pg.obj.getParent()); //得到当前坐标点
		}
		if(jf.level==3)
		{
			if(e.getSource()==jf.lv.bowing.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.bowing.obj,e.getPoint(),jf.lv.bowing.obj.getParent()); //得到当前坐标点
			if(e.getSource()==jf.lv.ss.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.ss.obj,e.getPoint(),jf.lv.ss.obj.getParent()); //得到当前坐标点
			if(e.getSource()==jf.lv.flashlight.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.flashlight.obj,e.getPoint(),jf.lv.flashlight.obj.getParent()); //得到当前坐标点
			if(e.getSource()==jf.lv.glass.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.glass.obj,e.getPoint(),jf.lv.glass.obj.getParent()); 
		}
		if(jf.level==4)
		{
			if(e.getSource()==jf.lv.flashlight.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.flashlight.obj,e.getPoint(),jf.lv.flashlight.obj.getParent()); //得到当前坐标点
			if(e.getSource()==jf.lv.glass.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.glass.obj,e.getPoint(),jf.lv.glass.obj.getParent()); 
			if(e.getSource()==jf.lv.bellow.obj)
				jf.point=SwingUtilities.convertPoint(jf.lv.bellow.obj,e.getPoint(),jf.lv.bellow.obj.getParent()); //得到当前坐标点
		}
	
	}

	public void mouseDragged(MouseEvent e)
	{	i=0;
		if(jf.level==1)
		{	
				if(e.getSource()==jf.lv.bowings.get(i).obj)
				{	
					System.out.println(jf.point);
					jf.lv.bowings.get(i).x=jf.point.x;
					jf.lv.bowings.get(i).y=jf.point.y;
					Point newPoint=SwingUtilities.convertPoint(jf.lv.bowings.get(i).obj,e.getPoint(),jf.lv.bowings.get(i).obj.getParent()); //转换坐标系统
					jf.lv.bowing.obj.setLocation(jf.lv.bowings.get(i).obj.getX()+(newPoint.x-jf.point.x),jf.lv.bowings.get(i).obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
					jf.point=newPoint; //更改坐标点
				}
				i++;
				
		}
		if(jf.level==2)
		{
			if(e.getSource()==jf.lv.pg.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.pg.x=jf.point.x;
				jf.lv.pg.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.pg.obj,e.getPoint(),jf.lv.pg.obj.getParent()); //转换坐标系统
				jf.lv.pg.obj.setLocation(jf.lv.pg.obj.getX()+(newPoint.x-jf.point.x),jf.lv.pg.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
				jf.lv.pg.f=jf.lv.pg.x;
			}
		}
		if(jf.level==3)
		{
			if(e.getSource()==jf.lv.bowing.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.bowing.x=jf.point.x;
				jf.lv.bowing.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.bowing.obj,e.getPoint(),jf.lv.bowing.obj.getParent()); //转换坐标系统
				jf.lv.bowing.obj.setLocation(jf.lv.bowing.obj.getX()+(newPoint.x-jf.point.x),jf.lv.bowing.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
			if(e.getSource()==jf.lv.ss.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.ss.x=jf.point.x;
				jf.lv.ss.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.ss.obj,e.getPoint(),jf.lv.ss.obj.getParent()); //转换坐标系统
				jf.lv.ss.obj.setLocation(jf.lv.ss.obj.getX()+(newPoint.x-jf.point.x),jf.lv.ss.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
			
			if(e.getSource()==jf.lv.flashlight.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.flashlight.x=jf.point.x;
				jf.lv.flashlight.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.flashlight.obj,e.getPoint(),jf.lv.flashlight.obj.getParent()); //转换坐标系统
				jf.lv.flashlight.obj.setLocation(jf.lv.flashlight.obj.getX()+(newPoint.x-jf.point.x),jf.lv.flashlight.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
			if(e.getSource()==jf.lv.glass.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.glass.x=jf.point.x;
				jf.lv.glass.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.glass.obj,e.getPoint(),jf.lv.glass.obj.getParent()); //转换坐标系统
				jf.lv.glass.obj.setLocation(jf.lv.glass.obj.getX()+(newPoint.x-jf.point.x),jf.lv.glass.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
		}
		if(jf.level==4)
		{
			if(e.getSource()==jf.lv.flashlight.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.flashlight.x=jf.point.x;
				jf.lv.flashlight.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.flashlight.obj,e.getPoint(),jf.lv.flashlight.obj.getParent()); //转换坐标系统
				jf.lv.flashlight.obj.setLocation(jf.lv.flashlight.obj.getX()+(newPoint.x-jf.point.x),jf.lv.flashlight.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
			if(e.getSource()==jf.lv.glass.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.glass.x=jf.point.x;
				jf.lv.glass.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.glass.obj,e.getPoint(),jf.lv.glass.obj.getParent()); //转换坐标系统
				jf.lv.glass.obj.setLocation(jf.lv.glass.obj.getX()+(newPoint.x-jf.point.x),jf.lv.glass.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
			if(e.getSource()==jf.lv.bellow.obj)
			{	
				//System.out.println(jf.point);
				jf.lv.bellow.x=jf.point.x;
				jf.lv.bellow.y=jf.point.y;
				Point newPoint=SwingUtilities.convertPoint(jf.lv.bellow.obj,e.getPoint(),jf.lv.bellow.obj.getParent()); //转换坐标系统
				jf.lv.bellow.obj.setLocation(jf.lv.bellow.obj.getX()+(newPoint.x-jf.point.x),jf.lv.bellow.obj.getY()+(newPoint.y-jf.point.y)); //设置标签图片的新位置
				jf.point=newPoint; //更改坐标点
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==jf.jpcs)
		{
			jf.GameSpeed--;
		}
		if(e.getSource()==jf.jpcf)
		{
			jf.GameSpeed++;
		}
		
		if(e.getSource()==jf.jpcp)
			{	
				jf.start=true;
				
				if(jf.level==1)
				{	if(jf.lv.bowing.x>500)
						{
							jf.start=false;
						}
					if(jf.lv.bowing.x<500)
						jf.lv.bowing.flag=true;
					jf.lv.b1.flag=true;
					jf.lv.b2.flag=true;
					
				}
				if(jf.level==2)
				{
					if(jf.lv.pg.x>500)
						jf.start=false;
					if(jf.lv.pg.x<500)
						jf.lv.pg.flag=true;
					System.out.println("pg x.flag = "+jf.lv.pg.flag);
				}
				if(jf.level==3)
				{
					if(jf.lv.bowing.x>500&&jf.lv.ss.x>500&&jf.lv.flashlight.x>500)
						jf.start=false;
					if(jf.lv.bowing.x<500)
						jf.lv.bowing.flag=true;
					if(jf.lv.ss.x<500)
						jf.lv.ss.flag=true;
					if(jf.lv.flashlight.x<500)
						jf.lv.flashlight.flag=true;
				}
				if(jf.level==4)
				{
					if(jf.lv.glass.x>500&&jf.lv.bellow.x>500&&jf.lv.flashlight.x>500)
						jf.start=false;
					if(jf.lv.bowing.x<500)
						jf.lv.bowing.flag=true;
					if(jf.lv.bellow.x<500)
						jf.lv.bellow.flag=true;
					if(jf.lv.flashlight.x<500)
						jf.lv.flashlight.flag=true;
				}
				
				
				
				
			}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
