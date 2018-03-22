import java.awt.*;
import java.applet.*;
import java.awt.Color.*;
/*
<applet code="funnysmile" width=2000 height=675>
</applet>
*/
public class funnysmile extends Applet
{
	boolean flag=false;
	public void paint(Graphics g)
	{
		int a=50;
		for(int i=0;a<=1600;i++)
		{
			if(i%2==0)	
			{
				g.setColor(Color.white);
				g.fillRect(0,0,2000,500);
				g.setColor(Color.black);
				g.drawOval(9+a-250,9,201,201);
				g.setColor(Color.yellow);
				g.fillOval(10+a-250,10,200,200);
				g.setColor(Color.black);
				g.drawOval(39+a-250,59,51,51);
				g.drawOval(129+a-250,59,51,51);
				g.setColor(Color.white);
				g.fillOval(40+a-250,60,50,50);
				g.fillOval(130+a-250,60,50,50);
				g.setColor(Color.black);
				g.fillOval(50+a-250,70,30,30);
				g.fillOval(140+a-250,70,30,30);
				g.drawArc(44+a-250,114,131,76,0,-180);
				g.drawLine(44+a-250,151,175+a-250,151);
				g.setColor(Color.red);
				g.fillArc(45+a-250,115,130,75,0,-180);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			else
			{
				g.setColor(Color.white);
				g.fillRect(0,0,2000,500);
				g.setColor(Color.black);
				g.drawOval(9+a-250,9,201,201);
				g.setColor(Color.yellow);
				g.fillOval(10+a-250,10,200,200);
				g.setColor(Color.black);
				g.drawOval(39+a-250,59,51,51);
				g.setColor(Color.white);
				g.fillOval(40+a-250,60,50,50);
				g.setColor(Color.black);
				g.fillOval(50+a-250,70,30,30);
				g.drawArc(130+a-250,80,50,30,180,-180);
				g.drawArc(44+a-250,114,131,76,0,-180);
				g.drawLine(44+a-250,151,175+a-250,151);
				g.setColor(Color.red);
				g.fillArc(45+a-250,115,130,75,0,-180);
				g.setColor(Color.black);
				g.drawArc(69+a-250,99,81,121,0,-180);
				g.drawLine(69+a-250,159,150+a-250,159);
				g.setColor(Color.pink);
				g.fillArc(70+a-250,100,80,120,0,-180);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			a=a+20;
			if(flag)
				break;
		}
		repaint();
    }
	public void stop()
	{
		flag=true;
	}
}