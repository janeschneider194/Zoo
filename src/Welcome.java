import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel
{
	public Welcome()
	{
		this.setBounds(100,100,800,600);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel welcome = new JLabel("Welcome to the Virtual Zoo");
		setSize(100,100);
		add(welcome, gbc);
		
		gbc.gridy = 1;
		
		BufferedImage img = null;
		try 
		{
			img = ImageIO.read(new File("Zoo-PNG-HIgh-Quality-Image.png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel label = new JLabel(new ImageIcon(img));
		add(label, gbc);
		
		gbc.gridy = 2;
		JButton click = new JButton("Click to Learn");
		setSize(200,300);
		add(click, gbc);
		
		
	}

}
