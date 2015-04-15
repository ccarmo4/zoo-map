// ZOO MAP
// Carla Carmona, Gryphon Skaggs
// Brenda Martinez, Kathleen McCusker, Keamber McCracken
// 8th period

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Map extends Applet implements Runnable

{
	int x = 0;
	int y = 550;
/****/ private static final long 
serialVersionUID = 1L;

//public void Jmenu() {
//}

private AirHockey craft;

	public void paint(Graphics g)
	
	{
		//Background image (grass)
		final AirHockey grass = new AirHockey("pixalted grass.png");
		g.drawImage(grass.getImage(),0,0,grass);
		//Main Path
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
		
	
	
	
		
		

		//LINKING PART
		ElephantPart.drawPanel.paintComponent(g);
		FlamingoPart.drawHabitat(g);
		buildings.drawem(g);
		

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
		
		
		

		//drawing man
		 craft = new AirHockey();
		 
		 g.drawImage(craft.getImage(), x, y, craft);

		
	}
		//Run Method 
	Thread runner;
	 public void start() {
	     if (runner == null) {
	       runner = new Thread(this);
	       runner.start();
	     }
	   }

	  
	  
	   public void run() {
	     while (true) {
	      x++;
	       repaint();
	      try { Thread.sleep(10); }
	    
	       catch (InterruptedException e) {}
	     }
	   }
	   
}
