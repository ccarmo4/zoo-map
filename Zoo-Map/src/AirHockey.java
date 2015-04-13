
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
    
    public AirHockey(String craft) {
    
    	ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
		

        image = ii.getImage();
        x = 0;
        y = 500;
    }


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

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

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
