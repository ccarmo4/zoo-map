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
		g.fillRect(1200, 100, 220, 100);
		g.setColor(new Color(145, 145, 145)); //divider
		g.drawRect(1200, 110, 110, 90);		
		g.drawRect(1310, 110, 110, 90);
		g.setColor(Color.blue); //doors
		g.fillRect(1220, 165, 20, 35);		
		g.fillRect(1380, 165, 20, 35);
		g.setColor(Color.white); //signs
		g.setFont(new Font("RESTROOMS", Font.ITALIC, 12));
		g.drawString("RESTROOMS", 1270, 110);
		g.setFont(new Font("MENS", Font.BOLD, 10));
		g.drawString("MENS", 1217, 160);		
		g.drawString("WOMENS", 1367, 160);
		
		//Gift Shop
		g.setColor(new Color(128, 64, 64)); //building
		g.fillRect(200, 250, 140, 140); 
		g.setColor(Color.gray); //doors
		g.drawRect(247, 355, 20, 35); 
		g.drawRect(246, 354, 22, 37);
		g.drawRect(245, 353, 23, 38);
		g.drawRect(267, 355, 20, 35);
		g.drawRect(266, 354, 22, 37);
		g.drawRect(265, 353, 24, 38);
		g.setColor(Color.white); //sign
		g.setFont(new Font("GIFT SHOP", Font.ITALIC, 14));
		g.drawString("GIFT SHOP", 235, 275);
		
		//Restaurant (Burger place)
		g.setColor(Color.yellow);
		g.fillRect(600, 200, 140, 140); //building
		g.setColor(Color.black);
		g.setFont(new Font("JOE'S BURGER SHACK", Font.ITALIC, 12));
		g.drawString("JOE'S BURGER SHACK", 605, 225);
		
		AnimatedMan.drawMan(g);
		
		
		
	}
	
	
}
