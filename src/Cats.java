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

public class Cats extends JPanel
{
	private Zoo fram;
	public Cats(Zoo frame)
	{
		fram = frame;
		
		setBounds(100,100,800,800);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//lion
		JLabel lion = new JLabel("Lion");
		lion.setSize(100,50);
		add(lion,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imglion = null;
			try 
			{
				imglion = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labellion = new JLabel(new ImageIcon(imglion));
			add(labellion,gbc);
		
		gbc.gridy = 2;
		JButton lionclick = new JButton("Click to Explore Lion");
		lionclick.setSize(100,50);
		add(lionclick,gbc);
		
		//tiger
		gbc.gridx = 1;
		
		JLabel tiger = new JLabel("Tiger");
		tiger.setSize(100,50);
		add(tiger,gbc);
		
		gbc.gridy = 3;
		//picture
			BufferedImage imgtiger = null;
			try 
			{
				imgtiger = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labeltiger = new JLabel(new ImageIcon(imgtiger));
			add(labeltiger,gbc);
		
		gbc.gridy = 4;
		JButton tigerclick = new JButton("Click to Explore Tigers");
		tigerclick.setSize(100,50);
		add(tigerclick,gbc);
		
		//leopard
		gbc.gridx = 3;
		gbc.gridy = 0;
		
		JLabel leopard = new JLabel("Leopard");
		leopard.setSize(100,50);
		add(leopard,gbc);
		
		gbc.gridy = 1;
		//picture
			BufferedImage imgleopard = null;
			try 
			{
				imgleopard = ImageIO.read(new File("ampibians.jpg"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			JLabel labelleopard = new JLabel(new ImageIcon(imgleopard));
			add(labelleopard,gbc);
		
		gbc.gridy = 2;
		JButton leopardclick = new JButton("Click to Explore Leopard");
		leopardclick.setSize(100,50);
		add(leopardclick,gbc);
		
		lionclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Lion");
						
			}
			
		});
		tigerclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Tiger");
						
			}
			
		});
		leopardclick.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Leopard");
						
			}
			
		});
		
		this.setVisible(true);
		
	}
}
