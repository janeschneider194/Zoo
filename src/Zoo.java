import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Zoo extends JFrame
{
	private JPanel overall;
	private CardLayout cl;
	public Zoo() 
	{

		overall = new JPanel();
		cl = new CardLayout();
		overall.setLayout(cl);
		
		JMenuBar menu = new JMenuBar();
		JMenuItem home = new JMenuItem("Home");
		menu.add(home);
//PANELS
		
	//welcome panel
		Welcome welcome = new Welcome(this);
		overall.add(welcome, "Welcome");
	//zoomap
		ZooMap zoomap = new ZooMap(this);
		overall.add(zoomap, "Zoo Map");
		
	//primates
		Primates p = new Primates(this);
		overall.add(p, "Primates");
		
		Gorilla gor = new Gorilla(this);
		overall.add(gor, "Gorilla");
		Monkey monk = new Monkey(this);
		overall.add(monk, "Monkey");
		Lemur lem = new Lemur(this);
		overall.add(lem, "Lemur");
		
	//amphibians
		Amphibians a = new Amphibians(this);
		overall.add(a, "Amphibians");
		
		Frog frog = new Frog(this);
		overall.add(frog, "Frog");
		Salamander salamander = new Salamander(this);
		overall.add(salamander, "Salamander");
		Toad toad = new Toad(this);
		overall.add(toad, "Toad");
		
	//birds
		Birds b = new Birds(this);
		overall.add(b,"Birds");
		
		Penguin penguin = new Penguin(this);
		overall.add(penguin, "Penguin");
		Toucan toucan = new Toucan(this);
		overall.add(toucan, "Toucan");
		Owl owl = new Owl(this);
		overall.add(owl, "Owl");
		
	//cats
		Cats c = new Cats(this);
		overall.add(c,"Cats");
		
		Lion lion = new Lion(this);
		overall.add(lion, "Lion");
		Tiger tiger = new Tiger(this);
		overall.add(tiger, "Tiger");
		Leopard leopard = new Leopard(this);
		overall.add(leopard, "Leopard");
		
	//reptiles	
		Reptiles r = new Reptiles(this);
		overall.add(r,"Reptiles");
		
		Turtle turtle = new Turtle(this);
		overall.add(turtle, "Turtle");
		Crocodile croc = new Crocodile(this);
		overall.add(croc, "Crocodile");
		Chameleon chameleon = new Chameleon(this);
		overall.add(chameleon, "Chameleon");
		
	//sea creatures	
		SeaCreatures s = new SeaCreatures(this);
		overall.add(s, "Sea Creatures");
		
		Starfish starfish = new Starfish(this);
		overall.add(starfish, "Starfish");
		Jellyfish jellyfish = new Jellyfish(this);
		overall.add(jellyfish, "Jellyfish");
		Dolphin dolphin = new Dolphin(this);
		overall.add(dolphin, "Dolphin");
		
		cl.show(overall, "Welcome");
		
		setBounds(100,100,800,800);
		this.setJMenuBar(menu);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		home.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(overall, "Welcome");		
			}
			
		});
	}
		public void showPanel(String type)
		{
			cl.show(overall,type);
		}
			
	

	public static void main(String [] args)
	{
		new Zoo();
	}
}
