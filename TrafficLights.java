
// This is an creative program created by me to give you the creative example of the
// applets in java
// hope you will find this program interesting

import java.awt.*;
import java.applet.*;
import java.awt.Color.*;
/*
<applet code="TrafficLights" width=1000 height=675>
</applet>
*/
public class TrafficLights extends Applet
{
public int y=800;
public void paint(Graphics g)
{
try
{
g.drawRect(50,50,150,400);
g.setColor(Color.black);
g.fillRect(50,50,150,400);
g.drawRect(80,400,85,520);
g.setColor(Color.black);
g.fillRect(80,400,85,520);
g.drawRect(40,520,950,525);
g.setColor(Color.gray);
g.fillRect(0,520,990,565);
g.setColor(Color.red);
g.fillOval(75,75,100,100);
g.setColor(Color.red);
g.fillRect(y+5,530,60,60);
g.setColor(Color.black);
g.fillOval(y,590,30,30);
g.fillOval(y+40,590,30,30);
Thread.sleep(10000);
}
catch(InterruptedException ie)
{
}


try
{
g.drawRect(50,50,150,400);
g.setColor(Color.black);
g.fillRect(50,50,150,400);
g.drawRect(80,400,85,520);
g.setColor(Color.black);
g.fillRect(80,400,85,520);
g.drawRect(40,520,950,525);
g.setColor(Color.gray);
g.fillRect(0,520,990,565);
g.setColor(Color.yellow);
g.fillOval(75,225,100,100);
g.setColor(Color.red);
g.fillRect(y+5,530,60,60);
g.setColor(Color.black);
g.fillOval(y,590,30,30);
g.fillOval(y+40,590,30,30);
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
}



try
{
g.drawRect(50,50,150,400);
g.setColor(Color.black);
g.fillRect(50,50,150,400);
g.drawRect(80,400,85,520);
g.setColor(Color.black);
g.fillRect(80,400,85,520);
g.drawRect(40,520,950,525);
g.setColor(Color.gray);
g.fillRect(0,520,990,525);
g.setColor(Color.green);
g.fillOval(75,300,100,100);
for(int i=0;i<80;i++)
{
g.setColor(Color.gray);
g.fillRect(y+5,530,60,60);
g.fillOval(y,590,30,30);
g.fillOval(y+40,590,30,30);
y=y-100;

g.setColor(Color.red);
g.fillRect(y+5,530,60,60);
g.setColor(Color.black);
g.fillOval(y,590,30,30);
g.fillOval(y+40,590,30,30);
Thread.sleep(200);
}
Thread.sleep(10000);
}
catch(InterruptedException ie)
{
}


}
}