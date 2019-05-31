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

public class SeaCreatures extends JPanel
{
	private Zoo fram;
	public SeaCreatures(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//starfish
		JLabel starfish = new JLabel("Starfish");
		starfish.setSize(100,50);
		add(starfish,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgstarfish = null;
			try 
			{
				imgstarfish = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelstarfish = new JLabel(new ImageIcon(imgstarfish));
			add(labelstarfish,gbc);
		
		gbc.gridy = 2;
		JButton starfishclick = new JButton("Click to Explore Starfish");
		starfishclick.setSize(100,50);
		add(starfishclick,gbc);
		
		//jellyfish
		gbc.gridx = 1;
		
		JLabel jellyfish = new JLabel("Jellyfish");
		jellyfish.setSize(100,50);
		add(jellyfish,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgjellyfish = null;
			try 
			{
				imgjellyfish = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labeljellyfish = new JLabel(new ImageIcon(imgjellyfish));
			add(labeljellyfish,gbc);
		
		gbc.gridy = 4;
		JButton jellyfishclick = new JButton("Click to Explore Jellyfish");
		jellyfishclick.setSize(100,50);
		add(jellyfishclick,gbc);
		
		//dolphin
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel dolphin = new JLabel("Dolphin");
		dolphin.setSize(100,50);
		add(dolphin,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgdolphin = null;
			try 
			{
				imgdolphin = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labeldolphin = new JLabel(new ImageIcon(imgdolphin));
			add(labeldolphin,gbc);
		
		gbc.gridy = 2;
		JButton dolphinclick = new JButton("Click to Explore Dolphins");
		dolphinclick.setSize(100,50);
		add(dolphinclick,gbc);
		
		starfishclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Starfish");
						
			}
			
		});
		jellyfishclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Jellyfish");
						
			}
			
		});
		dolphinclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Dolphin");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}
