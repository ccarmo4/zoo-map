// ZOO MAP
// Carla Carmona, Gryphon Skaggs
// Brenda Martinez, Kathleen McCusker, Keamber McCracken
// 8th period

import java.awt.*;
import java.applet.*;

import java.awt.event.*;

public class Map extends Applet implements Runnable

{
	int x = 0;
	int y = 550;
/****/ private static final long 
serialVersionUID = 1L;

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
	
		
		buildings.drawem(g);

		//LINKING PART
		AnimatedMan.drawMan(g);
		
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
