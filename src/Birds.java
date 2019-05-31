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

public class Birds extends JPanel
{
	private Zoo fram;
	public Birds(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//penguin
		JLabel penguin = new JLabel("Penguin");
		penguin.setSize(100,50);
		add(penguin,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgpenguin = null;
			try 
			{
				imgpenguin = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelpenguin = new JLabel(new ImageIcon(imgpenguin));
			add(labelpenguin,gbc);
		
		gbc.gridy = 2;
		JButton penguinclick = new JButton("Click to Explore Starfish");
		penguinclick.setSize(100,50);
		add(penguinclick,gbc);
		
		//toucan
		gbc.gridx = 1;
		
		JLabel toucan = new JLabel("Jellyfish");
		toucan.setSize(100,50);
		add(toucan,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgtoucan = null;
			try 
			{
				imgtoucan = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labeltoucan = new JLabel(new ImageIcon(imgtoucan));
			add(labeltoucan,gbc);
		
		gbc.gridy = 4;
		JButton toucanclick = new JButton("Click to Explore Toucans");
		toucanclick.setSize(100,50);
		add(toucanclick,gbc);
		
		//owl
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel owl = new JLabel("Owl");
		owl.setSize(100,50);
		add(owl,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgowl = null;
			try 
			{
				imgowl = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelowl = new JLabel(new ImageIcon(imgowl));
			add(labelowl,gbc);
		
		gbc.gridy = 2;
		JButton owlclick = new JButton("Click to Explore Owls");
		owlclick.setSize(100,50);
		add(owlclick,gbc);
		
		penguinclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Penguin");
						
			}
			
		});
		toucanclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Toucan");
						
			}
			
		});
		owlclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Owl");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}