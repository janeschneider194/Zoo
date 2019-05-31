import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reptiles extends JPanel
{
	private Zoo fram;
	public Reptiles(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//turtle
		JLabel turtle = new JLabel("Turtle");
		turtle.setSize(100,50);
		add(turtle,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgturtle = null;
			try 
			{
				imgturtle = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelturtle = new JLabel(new ImageIcon(imgturtle));
			add(labelturtle,gbc);
		
		gbc.gridy = 2;
		JButton turtleclick = new JButton("Click to Explore Turtle");
		turtleclick.setSize(100,50);
		add(turtleclick,gbc);
		
		//crocodile
		gbc.gridx = 1;
		
		JLabel crocodile = new JLabel("Crocodile");
		crocodile.setSize(100,50);
		add(crocodile,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgcrocodile = null;
			try 
			{
				imgcrocodile = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelcrocodile = new JLabel(new ImageIcon(imgcrocodile));
			add(labelcrocodile,gbc);
		
		gbc.gridy = 4;
		JButton crocodileclick = new JButton("Click to Explore Crocodile");
		crocodileclick.setSize(100,50);
		add(crocodileclick,gbc);
		
		//chameleon
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel chameleon = new JLabel("Chameleon");
		chameleon.setSize(100,50);
		add(chameleon,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgchameleon = null;
			try 
			{
				imgchameleon = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelchameleon = new JLabel(new ImageIcon(imgchameleon));
			add(labelchameleon,gbc);
		
		gbc.gridy = 2;
		JButton chameleonclick = new JButton("Click to Explore Chameleon");
		chameleonclick.setSize(100,50);
		add(chameleonclick,gbc);
		
		turtleclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Turtle");
						
			}
			
		});
		crocodileclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Crocodile");
						
			}
			
		});
		chameleonclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Chameleon");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}
