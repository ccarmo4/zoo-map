
import java.applet.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
//This states the name of the class, the type it is (Applet) and the KeyListener which will allow the program to know the key being pressed
public class AirHockey extends Applet implements KeyListener {

	private String craft = "craft.jpg";
	//Declaring the variables that we will use to establish the location of the man
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public AirHockey() {
    //This is retrieving the image and setting its initial location
    	ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
		
        image = ii.getImage();
        x = 0;
        y = 500;
    }    
    //calling the craft (the image) so that it can be used
    public AirHockey(String craft) {
    
    	ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
		

        image = ii.getImage();
        x = 0;
        y = 500;
    }

//This is the class where the directions and the variables that control moving are located
   
    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
//In this class, it tells the program what to do when a certain key is pressed
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
//once the program recieves the information on what key is pressed, it will do the action which correlates to that key
//for example, if the key pressed is the left key, the x value will decrease by one until the key is released
        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }
//This class tells the program that once the key is released, that no action needs to be taken
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
