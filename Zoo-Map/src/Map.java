// ZOO MAP
// Carla Carmona, Gryphon Skaggs
// Brenda Martinez, Kathleen McCusker, Keamber McCracken
// 8th period

import java.awt.*;
import java.applet.*;

public class Map extends Applet
{
/****/ private static final long 
serialVersionUID = 1L;

	public void paint(Graphics g)
	{
	g.setColor(Color.blue);
		Polygon path = new Polygon();

		path.addPoint(0, 550);
		path.addPoint(450, 345);
		path.addPoint(800, 345);
		path.addPoint(1175, 245);
		path.addPoint(2500, 245);
		path.addPoint(2500, 445);
		path.addPoint(1175, 445);
		path.addPoint(800, 545);
		path.addPoint(450, 545);
		path.addPoint(0, 750);
		g.fillPolygon(path);
	
		
		//Restrooms
		g.setColor(new Color(128, 128, 128)); //building
		g.fillRect(800, 100, 220, 100);
		g.setColor(new Color(145, 145, 145)); //divider
		g.drawRect(800, 110, 110, 90);		
		g.drawRect(910, 110, 110, 90);
		g.setColor(Color.blue); //doors
		g.fillRect(820, 165, 20, 35);		
		g.fillRect(980, 165, 20, 35);
		g.setColor(Color.white); //signs
		g.setFont(new Font("RESTROOMS", Font.ITALIC, 12));
		g.drawString("RESTROOMS", 870, 110);
		g.setFont(new Font("MENS", Font.BOLD, 10));
		g.drawString("MENS", 817, 160);		
		g.drawString("WOMENS", 967, 160);
		
		//Gift Shop
		g.setColor(new Color(128, 64, 64)); //building
		g.fillRect(200, 300, 140, 140); 
		g.setColor(Color.gray); //doors
		g.drawRect(247, 405, 20, 35); 
		g.drawRect(246, 404, 22, 37);
		g.drawRect(245, 403, 23, 38);
		g.drawRect(267, 405, 20, 35);
		g.drawRect(266, 404, 22, 37);
		g.drawRect(265, 403, 24, 38);
		g.setColor(Color.white); //sign
		g.setFont(new Font("GIFT SHOP", Font.ITALIC, 14));
		g.drawString("GIFT SHOP", 235, 325);
		
		//Restaurant (Burger place)
		g.setColor(Color.yellow);
		g.fillRect(500, 200, 140, 140); //building
		g.setColor(Color.black);
		g.setFont(new Font("JOE'S BURGER SHACK", Font.ITALIC, 12));
		g.drawString("JOE'S BURGER SHACK", 505, 225);
		
		//Animated Man
		g.setColor(new Color(244, 206, 149));
		g.fillOval(300, 600, 80, 80); // head
		g.fillRect(328, 675, 25, 10); // smallllll neck
		g.setColor(new Color(65, 20, 255));
		g.fillRect(320, 685, 40, 65); //body
		
		
		
		
	}
	
	
}
