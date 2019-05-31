import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JPanel
{
	private Zoo fram;
	public Welcome(Zoo frame)
	{
		fram = frame;
		this.setBounds(100,100,800,600);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel welcome = new JLabel("Welcome to the Virtual Zoo");
		setSize(100,100);
		add(welcome, gbc);
		
		gbc.gridy = 1;
	
		
		ImageIcon imageIcon = new ImageIcon("zoo.jpeg");
	    JLabel label = new JLabel(imageIcon);
	    add(label,gbc);
		
		gbc.gridy = 2;
		JButton click = new JButton("Click to Learn");
		setSize(200,300);
		add(click, gbc);
		click.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Zoo Map");
						
			}
			
		});
		
		setVisible(true);
	}
	

}
