
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//Creating a new class, which is gonna use JFrame format
public class ZooDirectory extends JFrame {

	JLabel label;
	Graphics g;
    public ZooDirectory() {
        
        initUI();
    }

    private void initUI() {
    	
    	//This starts the program and labels the zoo
        String zoo =  "Zoo Directory";
        
        label = new JLabel(zoo);
        /*
        
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(250, 50, 25));
       
        */
        createMenuBar();

        
setTitle("Habitats");
setSize(300, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButton quitButton = new JButton("Quit");

quitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
});

//creates quit button
createLayout(quitButton);
createLayout(label);

setTitle("Thank you for visiting!");
}


private void createLayout(JComponent... arg) {

Container pane = getContentPane();
GroupLayout gl = new GroupLayout(pane);
pane.setLayout(gl);        

gl.setAutoCreateContainerGaps(true);

gl.setHorizontalGroup(gl.createSequentialGroup()
        .addComponent(arg[0])
);

gl.setVerticalGroup(gl.createParallelGroup()
        .addComponent(arg[0])
);}




    
    private void createMenuBar() {
        
        JMenuBar menubar = new JMenuBar();
        
        //images
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        ImageIcon iconExit = new ImageIcon("exit.png");
        
        //classifies the different sub-menus there will be
        JMenu fileMenu = new JMenu("Habitats");
         JMenu impMenu = new JMenu("Aquarium");
         JMenu varMenu = new JMenu("Safari");
         JMenu zarMenu = new JMenu("Mountains");
         JMenu parMenu = new JMenu("Tropical Paradise");
         
       //aquarium   
         JMenuItem PenguinMi = new JMenuItem("Penguin");
         
         //Penguin submenu launch
         impMenu.add(PenguinMi);
         PenguinMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		PenguinPart PenguinPart = new PenguinPart();
         		PenguinPart.go();
         		PenguinPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         		
      //Safari
         JMenuItem ElephantMi = new JMenuItem ("Elephant");
         JMenuItem HippoMi = new JMenuItem ("Hippo");
         
      //Elephant Submenu set up and launch
         varMenu.add(ElephantMi);
         ElephantMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		ElephantPart ElephantPart = new ElephantPart();
         		ElephantPart.go();
         		ElephantPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
      //Hippo Submenu set up and launch
         varMenu.add(HippoMi);
         HippoMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		HippoPart HippoPart = new HippoPart();
         		HippoPart.go();
         		HippoPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
         
         //Mountains
         JMenuItem SnowLeopardMi = new JMenuItem ("Snow Leopard");
         
         //Snow Leopard Submenu set up and launch
         ZarMenu.add(SnowLeopardMi);
         SnowLeopardMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		SnowLeopardPart SnowLeopardPart = new SnowLeopardPart();
         		SnowLeopardPart.go();
         		SnowLeopardPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
         
         //Tropical Paradise
         
         JMenuItem FlamingoMi = new JMenuItem ("Flamingo");
         
         
         //Flamingo Submenu set up and launch
         
         ZarMenu.add(FlamingoMi);
         FlamingoMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		FlamingoPart FlamingoPart = new FlamingoPart();
         		FlamingoPart.go();	
         	FlamingoPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
                                   
         JMenuItem exitMi = new JMenuItem("Exit Directory", iconExit);
         exitMi.setToolTipText("Exit application");

         exitMi.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent event) {
                 System.exit(0);
             }
         });
         
        
         
         //Separates categories within the menu
         fileMenu.add(impMenu);
         fileMenu.addSeparator();
         fileMenu.add(varMenu);
         fileMenu.addSeparator();
         fileMenu.add(zarMenu);
         fileMenu.addSeparator();
         fileMenu.add(parMenu);
         fileMenu.addSeparator();
         fileMenu.addSeparator();
         fileMenu.add(exitMi);

         menubar.add(fileMenu);

         setJMenuBar(menubar);        
     }
     
     //Runs the program
     public static void main(String[] args) {
         
         EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                 
                 ZooDirectory ex = new ZooDirectory();
                 ex.setVisible(true);
     }
     });
     }
     {}}
      
         		
         		
         		
         	}
         });
         
        
       
        
        
        
    }
}