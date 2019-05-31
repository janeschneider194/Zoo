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

public class Primates extends JPanel
{
	private Zoo fram;
	public Primates(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//gorilla
		JLabel gorilla = new JLabel("Gorilla");
		gorilla.setSize(100,50);
		add(gorilla,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imggorilla = null;
			try 
			{
				imggorilla = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelgorilla = new JLabel(new ImageIcon(imggorilla));
			add(labelgorilla,gbc);
		
		gbc.gridy = 2;
		JButton gorillaclick = new JButton("Click to Explore Gorilla");
		gorillaclick.setSize(100,50);
		add(gorillaclick,gbc);
		
		//monkey
		gbc.gridx = 1;
		
		JLabel monkey = new JLabel("Monkey");
		monkey.setSize(100,50);
		add(monkey,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgmonkey = null;
			try 
			{
				imgmonkey = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelmonkey = new JLabel(new ImageIcon(imgmonkey));
			add(labelmonkey,gbc);
		
		gbc.gridy = 4;
		JButton monkeyclick = new JButton("Click to Explore Monkeys");
		monkeyclick.setSize(100,50);
		add(monkeyclick,gbc);
		
		//lemur
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel lemur = new JLabel("Lemur");
		lemur.setSize(100,50);
		add(lemur,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imglemur = null;
			try 
			{
				imglemur = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labellemur = new JLabel(new ImageIcon(imglemur));
			add(labellemur,gbc);
		
		gbc.gridy = 2;
		JButton lemurclick = new JButton("Click to Explore Lemurs");
		lemurclick.setSize(100,50);
		add(lemurclick,gbc);
		
		gorillaclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Gorilla");
						
			}
			
		});
		monkeyclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Monkey");
						
			}
			
		});
		lemurclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Lemur");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}
