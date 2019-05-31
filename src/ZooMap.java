import java.awt.CardLayout;
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

public class ZooMap extends JPanel
{
	private Zoo fram;
	
//get rid of locations
	public ZooMap(Zoo frame)
	{
		fram = frame;
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		setBounds(100,100,800,800);
		setLayout(null);
	
		JLabel primate = new JLabel("Primates");
		primate.setBounds(0,0,100,50);
		add(primate);
		BufferedImage imgprim = null;
		try 
		{
			imgprim = ImageIO.read(new File("monkey.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelmonkey = new JLabel(new ImageIcon(imgprim));
		labelmonkey.setLocation(0,100);
		add(labelmonkey);
		JButton prim = new JButton("Explore Primates");
		prim.setBounds(0,250,100,30);
		add(prim);
		
		
		JLabel ampibians = new JLabel("Amphibians");
		ampibians.setBounds(0,400,100,100);
		add(ampibians);
		BufferedImage imgamp = null;
		try 
		{
			imgamp = ImageIO.read(new File("ampibians.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelamp = new JLabel(new ImageIcon(imgamp));
		labelamp.setLocation(0,500);
		add(labelamp);
		JButton amp = new JButton("Explore Amphibians");
		amp.setBounds(0,650,100,30);
		add(amp);
		
		
		JLabel birds = new JLabel("Birds");
		birds.setBounds(150,0,100,50);
		add(birds);
		BufferedImage imgbird = null;
		try 
		{
			imgbird = ImageIO.read(new File("birds.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelbird = new JLabel(new ImageIcon(imgbird));
		labelbird.setLocation(100,100);
		add(labelbird);
		JButton bir = new JButton("Explore Birds");
		bir.setBounds(150,250,100,30);
		add(bir);
		
		JLabel sea = new JLabel("Sea Creatures");
		sea.setBounds(150,400,100,50);
		add(sea);
		BufferedImage imgsea = null;
		try 
		{
			imgsea = ImageIO.read(new File("sea creatures.jpeg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelsea = new JLabel(new ImageIcon(imgsea));
		labelsea.setLocation(150,500);
		add(labelsea);
		
		JButton creatures = new JButton("Explore Sea Creatures");
		creatures.setBounds(150,650,100,30);
		add(creatures);
		
		
		JLabel cats = new JLabel("Cats");
		cats.setBounds(300,0,100,50);
		add(cats);
		BufferedImage imgcats = null;
		try 
		{
			imgcats = ImageIO.read(new File("lion.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelcats = new JLabel(new ImageIcon(imgcats));
		labelcats.setLocation(300,100);
		add(labelcats);
		JButton ca = new JButton("Explore Cats");
		ca.setBounds(300,250,100,30);
		add(ca);
		
		
		JLabel reptiles = new JLabel("Reptiles");
		reptiles.setBounds(300,400,100,50);
		add(reptiles);
		BufferedImage imgrep = null;
		try 
		{
			imgrep = ImageIO.read(new File("reptiles.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelrep = new JLabel(new ImageIcon(imgrep));
		labelrep.setLocation(300,550);
		add(labelrep);
		JButton rep = new JButton("Explore Reptiles");
		rep.setBounds(300,700,100,30);
		add(rep);
		
		prim.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Primates");
						
			}
			
		});
		amp.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Amphibians");		
			}
			
		});
		
		bir.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Birds");
						
			}
			
		});
		creatures.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Sea Creatures");
						
			}
			
		});
		ca.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Cats");
						
			}
			
		});
		rep.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				fram.showPanel("Reptiles");
						
			}
			
		});
		
		setVisible(true);
	}

}
