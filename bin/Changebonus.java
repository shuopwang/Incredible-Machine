import java.io.IOException;

public class Changebonus implements Runnable{
	JFinterface jf;
	success s;
	public Changebonus(JFinterface interf)
	{
		this.jf=interf;
	}
	
	public void run() {
		while(true)
		{	
			ctb();
			if(jf.flag==true)
			{	
				jf.start=false;
				ctp();
				jf.GameSpeed=0;
				try {
					ctf();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(jf.failed==true)
			{	
				jf.start=false;
				jf.GameSpeed=0;
				try {
					restart();
					jf.failed=false;
				} catch (IOException e) {e.printStackTrace();} 		
			}
			try{
					if(jf.GameSpeed==0)
						Thread.sleep(1000);
					if(jf.GameSpeed>0)
						Thread.sleep(250);
					if(jf.GameSpeed<0)
						Thread.sleep(4000);
			}
			catch(InterruptedException e){
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
				}
		}
	}
	private void restart() throws IOException {
		s=new success(jf);
		if(jf.level==1)
		{
			jf.lv=new Level(jf);	
		}
		if(jf.level>=2)
			{	
				jf.lv.create();
				System.out.println("retry level "+jf.level);
			}
		
	}

	public void ctb()//every sencond the bonus will -1
		{
			if(jf.flag==false)
			{
				//System.out.println("change bonus");
				String tmp=jf.jlbonu1.getText();
				int temp=Integer.parseInt(tmp);
				temp--;
				if(temp>=0)
				jf.jlbonu1.setText(temp+"");
			}
		}
	public void ctp()//change the point when we win the game
	{
		String tmp=jf.jlbonu1.getText();
		int tem=Integer.parseInt(tmp);
		String score=jf.jlscore.getText();
		int s=Integer.parseInt(score);
		int sum=s+tem;
		jf.total_score+=sum;
		jf.jlscore.setText(jf.total_score+"");
		jf.jlbonu1.setText(0000+"");
	}
	
	public void ctf() throws IOException {
		s=new success(jf);
		jf.level++;
		jf.flag=false;
		jf.GameSpeed=0;
		jf.lv.create();
	}
}
