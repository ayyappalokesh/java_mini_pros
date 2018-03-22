/* 
CO6G 
AJP MINI-PROJECT - GRAPH GENERATOR
BY - 
MANSI KHAMKAR - 16
KOMAL BAGWE - 20
PINKY RATHOD - 21
RUCHITA YEOLE - 22
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class autobarapp extends Applet implements ActionListener
{
	Button b1,b2;
	Font f1 = new Font("Times New Roman",Font.BOLD,18);
	Font f2 = new Font("Times New Roman",Font.BOLD,24);
	String gn ="GRAPH NAME";
	String xn="X-axis Name";
	String yn="Y-axis Name";
	String fd1[];
	int fl,i,j;
	int fd2[], pg[];
	Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4;
	Label lb1[];
	Label lb2[];
	TextField tf1[];
	TextField tf2[];

    public void init()
    {
		setBackground(Color.cyan);
		setLayout(null);
        l1 = new Label("Graph Name:");
	    l1.setBounds(40,75,100,15);
        add(l1);
		t1 = new TextField(20);
	    t1.setBounds(150,70,105,20);
        add(t1);
   	    l2 = new Label("X-axis Name:");
 	    l2.setBounds(40,100,100,15);
        add(l2);
        t2 = new TextField(20);
	    t2.setBounds(150,95,105,20);
        add(t2);
		l3 = new Label("Y-axis Name:");
	    l3.setBounds(40,125,100,15);
        add(l3);
		t3 = new TextField(20);
	    t3.setBounds(150,120,105,20);
        add(t3);
		l4 = new Label("No. Of Fields:");
	    l4.setBounds(40,150,100,15);
        add(l4);
		t4 = new TextField(20);
	    t4.setBounds(150,145,105,20);
        add(t4);
		b1=new Button("Enter Field Details");
		b1.setBackground(Color.gray);
		b1.setBounds(40,175,120,30);
		add(b1);
		b1.addActionListener(this);
		b2=new Button("Draw Graph");
		b2.setBackground(Color.gray);
		b2.setBounds(40,510,120,30);
		add(b2);
		b2.addActionListener(this);
    }

	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b1)
			{
				gn = t1.getText();
				xn = t2.getText();
				yn = t3.getText();
				fl = Integer.parseInt(t4.getText());
				if(fl>10)
					throw new IndexOutOfBoundsException("Field Limit Is 10!");
				tf1=new TextField[fl+1];
				tf2=new TextField[fl+1];
				lb1=new Label[fl+1];
				fd1=new String[fl+1];
				fd2=new int[fl+1];
				setLayout(null);
				l5 = new Label("Name");
				l5.setBounds(120,225,60,15);
				add(l5);
				l6 = new Label("Value(%)");
				l6.setBounds(200,225,60,15);
				add(l6);
				for(int i=1;i<=fl;i++)
				{
					lb1[i] = new Label("Field"+i+":");
					lb1[i].setBounds(40,230+(25*i),60,15);
					add(lb1[i]);
					tf1[i] = new TextField(10);
					tf1[i].setBounds(115,225+(25*i),60,20);
					add(tf1[i]);
					tf2[i] = new TextField(10);
					tf2[i].setBounds(195,225+(25*i),60,20);
					add(tf2[i]);
					repaint();
				}
				
			}
			if(ae.getSource()==b2)
			{
				for(i=1;i<=fl;i++)
				{
					fd1[i]=tf1[i].getText();
					fd2[i]=Integer.parseInt(tf2[i].getText());
				}
				repaint();
			}
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println(ie);
		}
		catch(Exception e){}
	}
	
	public void paint(Graphics g)
	{
		pg=new int[fl+1];
		g.drawRect(340,20,970,580);
		g.setFont(f2);
		g.drawString(gn,700,70);
		g.setFont(f1);
		g.drawRect(20,20,260,540);
		g.drawString("Fill Bar Graph Details",50,50);
		g.drawLine(410,140,410,500);
		g.drawLine(410,500,1270,500);
		g.drawString(yn,370,120);
		g.drawString(xn,720,560);
		try
		{
			j=0;
			for(i=1;i<=fl;i++)
			{
				pg[i]=fd2[i]*300/100;
				g.setColor(Color.blue);
				g.fillRect(460+(j*80),500-pg[i],50,pg[i]);
				g.setColor(Color.red);
				g.drawString(fd1[i],460+(j*80)+5,520);
				g.drawString(fd2[i]+"%",460+(j*80)+10,500-pg[i]-15);
				j++;
			}
		}
		catch(Exception e){}
	}
}
/*
<applet code="autobarapp" width=300 height=300>
</applet>
*/