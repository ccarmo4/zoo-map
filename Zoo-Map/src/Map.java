// ZOO MAP
// Carla Carmona, Gryphon Skaggs
// Brenda Martinez, Kathleen McCusker, Keamber McCracken
// 8th period

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Map extends Applet implements Runnable, KeyListener

{
	int x = 0;
	int y = 550;
/****/ private static final long 
serialVersionUID = 1L;

private AirHockey craft;

	public void paint(Graphics g)
	
	{
		//Importing image (grass) for background
		final AirHockey grass = new AirHockey("pixalted grass.png");
		g.drawImage(grass.getImage(),0,0,grass);
		
		//Drawing the Main Path by making a new polygon
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
	
		//calling the buildings file and the class "drawem" in order to draw the buildings when the main file (map) is run
		buildings.drawem(g);

		//LINKING PART
		//Draws Elephant successfully
		ElephantPart.drawPanel.paintComponent(g);
		//Draws Flamingo successfully
		FlamingoPart.drawHabitat(g);
		//Draws Hippo successfully
		HippoPart.drawPanel.paintComponent(g);
		//Draws Snow Leopard successfully
		SnowLeopardPart.drawHabitat(g);
		//Draws Penguin successfully
		PenguinPart.drawPanel.paintComponent(g);
		//Calling the image in class AirHockey
		 craft = new AirHockey();
		 
		 g.drawImage(craft.getImage(), x, y, craft);
		 System.out.println("Airhockey yo");
		 
		 
		 
		addKeyListener(craft);
	}
		//Run Method to move the man
	Thread runner;
	 public void start() {
	     if (runner == null) {
	       runner = new Thread(this);
	       runner.start();
	     }
	   }

	  
	  
	   public void run() {
	     while (true) {
	     // craft.move(1,1);
	       repaint();
	      try { Thread.sleep(10); }
	    
	       catch (InterruptedException e) {}
	     }
	   }
	   //This shows what happens when you press each key (x and y control whether the man moves up/down/left/right)
	    public void keyPressed(KeyEvent e) {

	        int key = e.getKeyCode();
	        System.out.println(key);
	        if (key == KeyEvent.VK_LEFT) {
	            x = -1;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            x = 1;
	        }

	        if (key == KeyEvent.VK_UP) {
	            y = -1;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            y = 1;
	        }
	    }

	    public void keyReleased(KeyEvent e) {
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	           x = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	           x = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	            y = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            y = 0;
	        }
	    }
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            x = -1;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            x = 1;
	        }

	        if (key == KeyEvent.VK_UP) {
	            y = -1;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            y = 1;
	        }
	
		}

	   
}
