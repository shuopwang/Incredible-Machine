import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class success extends JFrame{
	JFrame frame=new JFrame("Incredible Machine");
	JButton button1=new JButton("Continue");
	JButton button2=new JButton("Quit");
	JPanel jp1 = new JPanel();JPanel jp2 = new JPanel();  
	JFinterface jf;
	public success (JFinterface interf){
		jf=interf;
		JLabel l1=new JLabel("YOU WIN THE LEVEL "+jf.level,JLabel.CENTER);
		
		if(jf.level==4&&jf.failed==false)
			{
				l1=new JLabel("THANKS TO PLAY THIS GAME,YOU ARE GREAT",JLabel.CENTER);
				button1 =new JButton("Tanks againe");
			}
		if(jf.failed==true)
			{
				l1=new JLabel("YOU LOSE ! TRY ANGAIN OR QUIT",JLabel.CENTER);
				button1=new JButton("RETRY");
			}
		JLabel l2=new JLabel("THE TOTAL_SCORE "+ jf.total_score,JLabel.CENTER);
		frame.setLayout(new GridLayout(2,1)); 
		jp2.setLayout(new GridLayout(2,1));
		jp2.add(l1);
		jp2.add(l2);
		frame.add(jp2);
		jp1.add(button1);
		jp1.add(button2);
		
		
		frame.add(jp1);
		
		frame.setBounds(300,100,600,500);
		
		myevent();
		frame.setLocation(500,250);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    frame.setVisible(true); 
	}
	private void myevent() {
		button2.addActionListener(new ActionListener() {  
            
            public void actionPerformed(ActionEvent e) {  
            	System.exit(0);  
            }     
        });  
		button1.addActionListener(new ActionListener() {  
            
            public void actionPerformed(ActionEvent e) {  
            	//notify();
            	frame.setVisible(false);
            	Textlevel();
            	if(jf.level==5)
            		System.exit(0);
            }     
        }); 
		
		
	}
	public void Textlevel() {
		if(jf.level==1)
			{
				jf.tip1= new JLabel("only let two bowings on the see-saw touche the ground you win the game");
				jf.tip2=new JLabel("when you are ready,click the yellow area to start,good luck!");
				jf.jlscore.setText("0000");
				jf.jlbonu1.setText("0150");
			}
		if(jf.level==2)
		{
			jf.tip1.setText("In level 2,try to make the bowing falling on the flooring");
			jf.tip2.setText("Good luck,have fun");
			jf.jlscore.setText("0000");
			jf.jlbonu1.setText("0200");
		}
		if(jf.level==3)
		{
			jf.tip1.setText("Level 3,good boy,this time try to make the boallon 'boom'!");
			jf.tip2.setText("Hope you are lucky and smart(tip:you don't need to use all the tool)");
			jf.jlscore.setText("0000");
			jf.jlbonu1.setText("0250");
		}
		if(jf.level==4)
		{
			jf.tip1.setText("Level 4,live or die, make your choise!");
			jf.tip2.setText("Hope you are lucky and smart(tip:you don't need to use all the tool)");
			jf.jlscore.setText("0000");
			jf.jlbonu1.setText("0300");
		}
	}
}
