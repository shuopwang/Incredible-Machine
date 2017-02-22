import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFinterface extends JFrame{
	
	public static final int WIDTH=600,HEIGHT=600;
	
	public JPanel jpbutton=new JPanel();
	public JPanel jpcentre=new JPanel();
	public JPanel jpcs=new JPanel();
	public JPanel jpcp=new JPanel();
	public JPanel jpcf=new JPanel();
	public JPanel jpu=new JPanel();
	
	public JLabel jlscore=new JLabel("000000",JLabel.CENTER);
	public JLabel jlbonu1=new JLabel("0150",JLabel.CENTER);
	public JLabel jlbonu2=new JLabel("0300",JLabel.CENTER);
	
	public JLabel jls=new JLabel("SCORE",JLabel.CENTER);
	public JLabel jlb1=new JLabel("BONUS1",JLabel.CENTER);
	public JLabel jlb2=new JLabel("BONUS2",JLabel.CENTER);
	
	public JLabel tip1= new JLabel("only let two bowings on the see-saw touche the ground you win the game");
	public JLabel tip2=new JLabel("when you are ready,click the yellow area to start,good luck!");
	public JLabel tip3=new JLabel("TIPS: ‘<<’ is slow are;the ground is normal speed;‘>>’ is fast speed");
	
	boolean flag=false;// flag means whether you win the game
	boolean start=false;//start means start the game
	boolean failed=false;
	int level=1;//level
	int total_score=0;
	Mouseaction ma=new Mouseaction(this);
	Start play=new Start(this);
	PaintThread pt=new PaintThread();
	Thread thread=new Thread(pt);
	Changebonus cb=null;
	Level lv;
	int GameSpeed=0;
	
	
	Image offScreenImage=null;//avoid the flash
	Graphics goff=null;

	
	Button_fast f=new Button_fast(0,0);
	Button_start n=new Button_start(20,10);//this set the location the object-x-y
	Button_slow s=new Button_slow(0,0);
	//background
	Flooring f1=new Flooring(5,400);
	Flooring f2=new Flooring(75,400);
	Flooring f3=new Flooring(145,400);
	Flooring f4=new Flooring(215,400);
	Flooring f5=new Flooring(285,400);
	Flooring f6=new Flooring(355,400);
	Flooring f7=new Flooring(425,400);

	Steel h1=new Steel(0,0,0);
	Steel h2=new Steel(37,0,0);
	Steel h3=new Steel(74,0,0);
	Steel h4=new Steel(111,0,0);
	Steel h5=new Steel(148,0,0);
	Steel h6=new Steel(185,0,0);
	Steel h7=new Steel(222,0,0);
	Steel h8=new Steel(259,0,0);
	Steel h9=new Steel(296,0,0);
	Steel h10=new Steel(333,0,0);
	Steel h11=new Steel(370,0,0);
	Steel h12=new Steel(407,0,0);
	Steel h13=new Steel(444,0,0);
	Steel h14=new Steel(481,0,0);
	
	Steel s1=new Steel(0,0,1);
	Steel s2=new Steel(0,35,1);
	Steel s3=new Steel(0,69,1);
	Steel s4=new Steel(0,104,1);
	Steel s5=new Steel(0,139,1);
	Steel s6=new Steel(0,174,1);
	Steel s7=new Steel(0,209,1);
	Steel s8=new Steel(0,244,1);
	Steel s9=new Steel(0,279,1);
	Steel s10=new Steel(0,314,1);
	Steel s11=new Steel(0,349,1);
	Steel s12=new Steel(0,384,1);
	
	Steel sr1=new Steel(500,0,1);
	Steel sr2=new Steel(500,35,1);
	Steel sr3=new Steel(500,69,1);
	Steel sr4=new Steel(500,104,1);
	Steel sr5=new Steel(500,139,1);
	Steel sr6=new Steel(500,174,1);
	Steel sr7=new Steel(500,209,1);
	Steel sr8=new Steel(500,244,1);
	Steel sr9=new Steel(500,279,1);
	Steel sr10=new Steel(500,314,1);
	Steel sr11=new Steel(500,349,1);
	Steel sr12=new Steel(500,384,1);
	
	Steel sr0=new Steel(500,0,1);
	Steel srm1=new Steel(500,35,1);
	
	
	Point point=new Point(0,0);
	public JFinterface() throws IOException {
		this.setLayout(null);
		this.setSize(WIDTH, HEIGHT+20);
		jpcentre.setLayout(null);
		jpbutton.setLayout(null);
		jpcs.setLayout(null);
		jpcp.setLayout(null);
		jpcf.setLayout(null);
		
		jpu.setBounds(0, 0, 500, 80);
		
		jpcp.setBounds(500,0,100,60);
		jpcs.setBounds(520, 60, 30, 30);
		jpcf.setBounds(550, 60, 30, 30);
		
		jpcentre.setBounds(0,80,600,420);
		jpbutton.setBounds(0, 500, 600, 100);
		
		this.add(jpcentre);
		this.add(jpbutton);
		this.add(jpcs);
		this.add(jpcp);
		this.add(jpcf);
		this.add(jpu);
		jpcp.add(sr0.obj);
		jpcp.add(srm1.obj);
		
		jpcf.add(f.obj);
		
		jpcp.setBackground(Color.yellow.darker().brighter());
		jpcp.add(n.obj);
		
		jpcs.add(s.obj);
		
		jpcs.addMouseListener(ma);
		jpcp.addMouseListener(ma);
		jpcf.addMouseListener(ma);
		
		jpu.setBackground(Color.yellow.darker());
		jpu.setLayout(new GridLayout(3,1));
		jpu.add(tip1,JPanel.LEFT_ALIGNMENT);
		jpu.add(tip2,JPanel.LEFT_ALIGNMENT);
		jpu.add(tip3,JPanel.LEFT_ALIGNMENT);
		
		jpcentre.setBackground(Color.cyan.darker());
		lv=new Level(this);
		jpcentre.add(f1.obj);
		jpcentre.add(f2.obj);
		jpcentre.add(f3.obj);
		jpcentre.add(f4.obj);
		jpcentre.add(f5.obj);
		jpcentre.add(f6.obj);
		jpcentre.add(f7.obj);
		
		jpcentre.add(h1.obj);
		jpcentre.add(h2.obj);
		jpcentre.add(h3.obj);
		jpcentre.add(h4.obj);
		jpcentre.add(h5.obj);
		jpcentre.add(h6.obj);
		jpcentre.add(h7.obj);
		jpcentre.add(h8.obj);
		jpcentre.add(h9.obj);
		jpcentre.add(h10.obj);		
		jpcentre.add(h11.obj);	
		jpcentre.add(h12.obj);	
		jpcentre.add(h13.obj);	
		jpcentre.add(h14.obj);
		
		jpcentre.add(s1.obj);
		jpcentre.add(s2.obj);
		jpcentre.add(s3.obj);
		jpcentre.add(s4.obj);
		jpcentre.add(s5.obj);
		jpcentre.add(s6.obj);
		jpcentre.add(s7.obj);
		jpcentre.add(s8.obj);
		jpcentre.add(s9.obj);
		jpcentre.add(s10.obj);
		jpcentre.add(s11.obj);
		jpcentre.add(s12.obj);
		
		jpcentre.add(sr1.obj);
		jpcentre.add(sr2.obj);
		jpcentre.add(sr3.obj);
		jpcentre.add(sr4.obj);
		jpcentre.add(sr5.obj);
		jpcentre.add(sr6.obj);
		jpcentre.add(sr7.obj);
		jpcentre.add(sr8.obj);
		jpcentre.add(sr9.obj);
		jpcentre.add(sr10.obj);
		jpcentre.add(sr11.obj);
		jpcentre.add(sr12.obj);
		
		jpbutton.setLayout(new GridLayout(2,3));
		jlb2.setFont(new java.awt.Font("Times",2,15));
		jlb1.setFont(new java.awt.Font("Times",2,15));
		jls.setFont(new java.awt.Font("Times",2,15));
		jls.setBorder(BorderFactory.createLineBorder(Color.black));
		jlb1.setBorder(BorderFactory.createLineBorder(Color.black));
		jlb2.setBorder(BorderFactory.createLineBorder(Color.black));
		jlscore.setFont(new java.awt.Font("Times",1,15));
		jlbonu1.setFont(new java.awt.Font("Times",1,15));
		jlbonu2.setFont(new java.awt.Font("Times",1,15));
		jlscore.setBorder(BorderFactory.createLineBorder(Color.black));
		jlbonu1.setBorder(BorderFactory.createLineBorder(Color.black));
		jlbonu2.setBorder(BorderFactory.createLineBorder(Color.black));
		jpbutton.add(jls);
		jpbutton.add(jlb1);
		jpbutton.add(jlb2);
		jpbutton.add(jlscore);
		jpbutton.add(jlbonu1);
		jpbutton.add(jlbonu2);
		
		
		this.setBackground(Color.gray);
		this.setTitle("Incredible Machine by shuopeng");
		this.addWindowListener(new WindowAdapter()//now we could close the windows
				{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}});
		this.setLocation(400, 200);
		this.setVisible(true);
		cb=new Changebonus(this);
		(new Thread(cb)).start();
		thread.start();
		
		
	}
	public void paint(Graphics g) {
		paintComponents(g);
	}
	
	public void update(Graphics g) {
		if(offScreenImage==null)
			offScreenImage=this.createImage(this.getSize().width, this.getSize().height);
		goff=offScreenImage.getGraphics();
		paint(goff);
		g.drawImage(offScreenImage,0,0,null);
	}
	
	private class PaintThread implements Runnable
	{
		public void run() {
			while(true){
			repaint();//recrit paint,to make the picture look like moving 
			
			if(start==true)
				play.start_level();
			try{
				Thread.sleep(500);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
			}
		}
		
	}
	
}
