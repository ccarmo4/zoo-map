
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
import javax.swing.JPanel;
import javax.swing.WindowConstants;

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

//setting up the top part and the title (with quit option)
setTitle("Habitats");
setSize(300, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButton quitButton = new JButton("Quit");
//adding an action listener that allows the user to quit when the program is prompted
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

//creating the pane
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
//this class will set up the background image
public class ImagePanel extends JPanel {

    private Image image = null;

    public ImagePanel(String Capture) {
        this.image = new ImageIcon(Capture).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(null), image.getHeight(null), null);
    }

    /**
     * @param args
     */
    public void main(String[] args) {
        ImagePanel panel = new ImagePanel("resources/image.jpg");

        JFrame frame = new JFrame("Frame");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}


    
    private void createMenuBar() {
        
        final JMenuBar menubar = new JMenuBar();
        
        //images
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        final ImageIcon iconExit = new ImageIcon("exit.png");
        
        //classifies the different sub-menus there will be
        final JMenu fileMenu = new JMenu("Habitats");
         final JMenu impMenu = new JMenu("Aquarium");
         final JMenu varMenu = new JMenu("Safari");
         final JMenu zarMenu = new JMenu("Mountains");
         final JMenu parMenu = new JMenu("Tropical Paradise");
         
       //aquarium   (setting up a new subtopic for each animal)
         JMenuItem PenguinMi = new JMenuItem("Penguin");
         
         //Penguin submenu launch (calling file and opening it when clicked)
         impMenu.add(PenguinMi);
         PenguinMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		PenguinPart penguinPart = new PenguinPart();
         		penguinPart.go();
         		penguinPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         		
      //Safari (setting up a new subtopic for each animal)
         JMenuItem ElephantMi = new JMenuItem ("Elephant");
         JMenuItem HippoMi = new JMenuItem ("Hippo");
         
      //Elephant Submenu set up and launch (calling file and opening it when clicked)
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
         		HippoPart hippoPart = new HippoPart();
         		hippoPart.go();
         		hippoPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
         
         //Mountains (setting up a new subtopic for each animal)
         JMenuItem SnowLeopardMi = new JMenuItem ("Snow Leopard");
         
         //Snow Leopard Submenu set up and launch (calling file and opening it when clicked)
        /* zarMenu.add(SnowLeopardMi);
         SnowLeopardMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		SnowLeopardPart snowLeopardPart = new SnowLeopardPart();
         		snowLeopardPart.go();
         		snowLeopardPart.SnowLeopard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
         */
         //Tropical Paradise (setting up a new subtopic for each animal)
         
         JMenuItem FlamingoMi = new JMenuItem ("Flamingo");
         
         
         //Flamingo Submenu set up and launch (calling file and opening it when clicked)
         
       /*  zarMenu.add(FlamingoMi);
         FlamingoMi.addActionListener(new ActionListener() {
         	@Override
         	public void actionPerformed(ActionEvent event) {
         		FlamingoPart flamingoPart = new FlamingoPart();
         		flamingoPart.go();	
         	flamingoPart.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         	}
         });
             */                      
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
     public void main(String[] args) {
         
         EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                 
                 ZooDirectory ex = new ZooDirectory();
                 ex.setVisible(true);
     }
     });
     }
     {}} );
      
         		
         		
         		
         	}
        
         
        
       
        
        
        
    }

