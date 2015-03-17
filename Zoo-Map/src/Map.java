

import java.awt.*;
import java.applet.*;


public class Map extends Applet
{
	public void paint(Graphics g)
	{
		//Gift Shop
		g.setColor(Color.orange);
		g.fillRect(200, 300, 140, 140); 
		g.setColor(Color.green);
		g.drawString("Gift Shop", 250, 325);
		
		
		//Restaurant (Burger place)
		g.setColor(Color.yellow);
		g.fillRect(500, 200, 140, 140);
		g.setColor(Color.black);
		g.drawString("Joe's Burger Shack", 520, 230);
		
		
		//Path
		g.setColor(Color.blue);
		
		Polygon path = new Polygon();
		path.addPoint(0, 200);
		path.addPoint(100, 200);
		path.addPoint(150, 150);
		path.addPoint(150, 250);
		path.addPoint(100, 300);
		path.addPoint(1, 300);
		//Animated Man
		g.setColor(new Color(244, 206, 149));
		g.fillOval(300, 600, 80, 80);
		g.fillRect(328, 675, 25, 10);
		g.setColor(new Color(65, 20, 255));
		g.fillRect(320, 685, 40, 65);
		
		
		
		
	}
	
	
}