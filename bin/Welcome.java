import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame{
	public JLabel jl=new JLabel();
	public JLabel j2=new JLabel("Start a magic experience",JLabel.CENTER);
	public JLabel j3=new JLabel("Leave",JLabel.CENTER);
	ImageIcon p1;
	boolean start=false;
	public Welcome() throws IOException
	{	
		this.setLayout(null);
		this.setSize(400, 300);
		this.setUndecorated(true);
		this.setLocation(400, 200);
		
		p1=new ImageIcon(new Item(452,1726,400,189).getsubimage());
		
		jl=new JLabel(p1);
		jl.setSize(p1.getIconWidth(),p1.getIconHeight());
		jl.setLocation(0,0);
		
		j2.setSize(300,100);
		j2.setLocation(0,200);
		
		j3.setSize(100,100);
		j3.setLocation(300,200);
		this.add(jl);
		this.add(j2);
		this.add(j3);
		this.setVisible(true);
		addMouseListener(new MouseAdapter(){
				
				public void mouseClicked(MouseEvent e){
					if(e.getX()<300)
					{
						Welcome.this.dispose();
						try {
							JFinterface jf=new JFinterface();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
					if(e.getX()>300)
					{
						System.exit(0);
					}
				}
				});
	}
	
}
