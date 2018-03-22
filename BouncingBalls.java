/* 
	JAVA MINI PROJECT - 2 balls bouncing in a box, changing their colors, creating sound on collision and providing a start/stop functionality
	CO5G
	MANSI KHAMKAR - 16
	KOMAL BAGWE - 20
*/	

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Ball
{
	int x,y,diam,dx,dy;
	Color BallColor;

	public Ball(int x,int y,int diam,int dx,int dy,Color bColor)
	{
		this.x=x;
		this.y=y;
		this.diam=diam;
		this.dx=dx;
		this.dy=dy;
		BallColor=bColor;
	}
}

public class BouncingBalls extends Applet implements Runnable,MouseListener,ActionListener
{
	Thread t;
	Button b1;
	Button b2;
	Ball ball1,ball2;
	AudioClip soundFile1;
	Font f1;
	
	public void mouseExited(MouseEvent evt){}
	public void mousePressed(MouseEvent evt) {} 
    public void mouseReleased(MouseEvent evt) {} 
    public void mouseEntered(MouseEvent evt) {} 
    public void mouseClicked(MouseEvent evt) {} 
	
	public void init()
	{
		setLayout(null);
		b1=new Button("Start");
		b2=new Button("Stop");
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		b1.setBounds(200,480,70,40);
		b2.setBounds(350,480,70,40);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1 = new Font("Times New Roman",Font.BOLD|Font.ITALIC,25);
		soundFile1 = getAudioClip(getDocumentBase(),"jump.au"); 
		ball1=new Ball(280,280,20,2,4,Color.red);
		ball2=new Ball(240,270,20,4,2,Color.black);
		t=new Thread(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
			{
				if(t!=null)
					t.start();
				else if(t==null)
				{
					t=new Thread(this);
					t.start();
				}
			}
			else if(e.getSource()==b2)
			{
				t.stop();
				t=null;
			}
		}
		catch(Exception ex){}	
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(20,100,590,450);
		g.drawRect(199,199,221,221);
		g.setColor(Color.yellow);
		g.fillRect(200,200,220,220);
		g.setColor(ball1.BallColor);
		g.fillOval(ball1.x, ball1.y, ball1.diam, ball1.diam);
		g.setColor(ball2.BallColor);
		g.fillOval(ball2.x, ball2.y, ball2.diam, ball2.diam);
		g.setFont(f1);
		g.drawString("!!! COLOUR CHANGING BOUNCING BALLS !!!",50,150);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				displacementOperation(ball1);
				displacementOperation(ball2);
				Thread.sleep(20);
				repaint();
			}
			catch(Exception e){}
		}
	}
	
	//This method checks the boundary condition of ball movement
	public void displacementOperation(Ball ball)
	{
		if(ball.y >= 400 || ball.y <= 200 || ball.x >= 400 || ball.x <= 200)
		{
			if(ball.y <= 200)
			{
				ball.dy=-ball.dy;
				ball.BallColor=Color.blue;
			}
			else if(ball.x <= 200)
			{
				ball.dx=-ball.dx;
				ball.BallColor=Color.magenta;
			}
			else if(ball.y >= 400)
			{
				ball.dy=-ball.dy;
				ball.BallColor=Color.black;
			}
			else if(ball.x >= 400)
			{
				ball.dx=-ball.dx;
				ball.BallColor=Color.red;
			}
			soundFile1.play();
		}
		ball.y=ball.y-ball.dy;
		ball.x=ball.x-ball.dx;
	} 
}

/*
	<applet code="BouncingBalls" width=1000 height=1000>
	</applet>
*/