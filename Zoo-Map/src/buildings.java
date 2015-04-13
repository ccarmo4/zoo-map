import java.awt.*;
import java.util.Random;


public class buildings {

	public static void drawem(Graphics g)
	{
		//Drawing the restrooms building
		g.setColor(new Color(128, 128, 128)); 
		g.fillRect(1200, 100, 220, 100);
		g.setColor(new Color(145, 145, 145)); 
		//divider for the doors
		g.drawRect(1200, 110, 110, 90);		
		g.drawRect(1310, 110, 110, 90);
		g.setColor(Color.blue); 
		//doors
		g.fillRect(1220, 165, 20, 35);		
		g.fillRect(1380, 165, 20, 35);
		g.setColor(Color.white); 
		//signs for the restroom (setting the font and drawing a string (text) to make it show up)
		g.setFont(new Font("RESTROOMS", Font.ITALIC, 12));
		g.drawString("RESTROOMS", 1270, 110);
		g.setFont(new Font("MENS", Font.BOLD, 10));
		g.drawString("MENS", 1217, 160);		
		g.drawString("WOMENS", 1367, 160);
		
		//Gift Shop building
		g.setColor(new Color(128, 64, 64)); 
		g.fillRect(150, 250, 140, 140); 
		g.setColor(Color.gray); 
		//doors
		g.drawRect(227, 355, 20, 35); 
		g.drawRect(226, 354, 22, 37);
		g.drawRect(225, 353, 23, 38);
		g.drawRect(247, 355, 20, 35);
		g.drawRect(246, 354, 22, 37);
		g.drawRect(245, 353, 24, 38); 
		//windows
		g.drawRect(155, 345, 60, 25);
		g.drawRect(154, 344, 62, 27);
		g.drawRect(153, 343, 63, 28);
		//sign
		g.setColor(Color.white); 
		g.setFont(new Font("GIFT SHOP", Font.ITALIC, 14));
		g.drawString("GIFT SHOP", 185, 265);
		
				
		//Restaurant (Burger place) building drawing
		g.setColor(Color.yellow); 
		g.fillRect(600, 180, 180, 140); 
		//building
		g.fillRect(600, 205, 180, 115); 
		g.setColor(Color.gray); 
		//doors
		g.drawRect(671, 282, 20, 35); 
		g.drawRect(670, 281, 22, 37);
		g.drawRect(669, 280, 23, 38);
		g.drawRect(691, 282, 20, 35);
		g.drawRect(690, 281, 22, 37);
		g.drawRect(689, 280, 23, 38);
		//windows
		g.drawRect(610, 280, 45, 20);
		g.drawRect(609, 279, 47, 22);
		g.drawRect(608, 278, 48, 23);
		//second set of windows drawn
		g.drawRect(725, 280, 45, 20);
		g.drawRect(724, 279, 47, 22);
		g.drawRect(723, 278, 48, 23);
		//sign
		g.setColor(Color.black);
		g.setFont(new Font("JOE'S BURGER SHACK", Font.ITALIC, 12));
		g.drawString("JOE'S BURGER SHACK", 625, 260);
		
		//adding a lake
		g.setColor(new Color(128,255,255));
		g.fillOval(250,100,250,100);
		//adding a bush
		g.setColor(new Color(0, 255,0));
		g.fillOval(240, 95,35,35);
		g.fillOval(250, 75,35,35);
		g.fillOval(260, 95,35,35);
		
		
		Random randint = new Random(12345);
		for (int k = 1; k <= 100; k++)
		{

			int x = randint.nextInt(200) + 605;
			int y = randint.nextInt(80) + 450;
			g.fillOval(x, y, 5, 5);
			int black = randint.nextInt(50);
			g.setColor(new Color (black));
		}
	}
}











	
