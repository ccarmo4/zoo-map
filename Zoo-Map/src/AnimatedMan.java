import java.awt.Color;
import java.awt.Graphics;


public class AnimatedMan {

	
	public static void drawMan(Graphics g)
	{
		//Animated Man

		// same x, just add to change....same y, just add to change...
		
		
		
		g.setColor(new Color(244, 206, 149));
		g.fillOval(20, 550, 80, 80);
		g.fillRect(48, 625, 25, 10);
		g.setColor(new Color(65, 20, 255));
		g.fillRect(40, 635, 40, 65);
		g.setColor(Color.BLACK);
		g.fillOval(40, 575, 10, 10);//eyes
		g.fillOval(70, 575, 10, 10);
		
		
	}
}
