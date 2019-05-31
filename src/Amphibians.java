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

public class Amphibians extends JPanel
{
	private Zoo fram;
	public Amphibians(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//frog
		JLabel frog = new JLabel("Frog");
		frog.setSize(100,50);
		add(frog,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgfrog = null;
			try 
			{
				imgfrog = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelfrog = new JLabel(new ImageIcon(imgfrog));
			add(labelfrog,gbc);
		
		gbc.gridy = 2;
		JButton frogclick = new JButton("Click to Explore Frogs");
		frogclick.setSize(100,50);
		add(frogclick,gbc);
		
		//salamander
		gbc.gridx = 1;
		
		JLabel salamander = new JLabel("Salamander");
		salamander.setSize(100,50);
		add(salamander,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgsalamander = null;
			try 
			{
				imgsalamander = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelsalamander= new JLabel(new ImageIcon(imgsalamander));
			add(labelsalamander,gbc);
		
		gbc.gridy = 4;
		JButton salamanderclick = new JButton("Click to Explore Salamander");
		salamanderclick.setSize(100,50);
		add(salamanderclick,gbc);
		
		//toad
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel toad = new JLabel("Toad");
		toad.setSize(100,50);
		add(toad,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgtoad = null;
			try 
			{
				imgtoad = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labeltoad = new JLabel(new ImageIcon(imgtoad));
			add(labeltoad,gbc);
		
		gbc.gridy = 2;
		JButton toadclick = new JButton("Click to Explore Toads");
		toadclick.setSize(100,50);
		add(toadclick,gbc);
		
		frogclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Frog");
						
			}
			
		});
		salamanderclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Salamander");
						
			}
			
		});
		toadclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Toad");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}
