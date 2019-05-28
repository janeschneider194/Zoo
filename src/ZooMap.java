import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZooMap extends JPanel
{
	public ZooMap()
	{
		JPanel overall = new JPanel();
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
		
		setBounds(100,100,800,800);
		setLayout(null);
		
		Primates p = new Primates();
		overall.add(p, "Primates");
		Amphibians a = new Amphibians();
		overall.add(a, "Amphibians");
		Birds b = new Birds();
		overall.add(b,"Birds");
		Cats c = new Cats();
		overall.add(c,"Cats");
		Reptiles r = new Reptiles();
		overall.add(r,"Reptiles");
		SeaCreatures s = new SeaCreatures();
		overall.add(s, "Sea Creatures");
			
		
		JLabel primate = new JLabel("Primates");
		primate.setBounds(0,0,100,50);
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
		JButton prim = new JButton("Explore Primates");
		prim.setBounds(0,250,100,30);
		
		
		JLabel ampibians = new JLabel("Amphibians");
		ampibians.setBounds(0,400,100,100);
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
		JButton amp = new JButton("Explore Amphibians");
		amp.setBounds(0,650,100,30);
		
		
		JLabel birds = new JLabel("Birds");
		birds.setBounds(150,0,100,50);
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
		JButton bir = new JButton("Explore Birds");
		bir.setBounds(150,250,100,30);
		
		JLabel sea = new JLabel("Sea Creatures");
		sea.setBounds(150,400,100,50);
		BufferedImage imgsea = null;
		try 
		{
			imgsea = ImageIO.read(new File("sea creatures.jpg"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		JLabel labelsea = new JLabel(new ImageIcon(imgsea));
		labelsea.setLocation(150,500);
		JButton creatures = new JButton("Explore Sea Creatures");
		creatures.setBounds(150,650,100,30);
		
		
		JLabel cats = new JLabel("Cats");
		cats.setBounds(300,0,100,50);
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
		JButton ca = new JButton("Explore Cats");
		ca.setBounds(300,250,100,30);
		
		
		JLabel reptiles = new JLabel("Reptiles");
		reptiles.setBounds(300,400,100,50);
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
		JButton rep = new JButton("Explore Reptiles");
		rep.setBounds(300,700,100,30);
		
		prim.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(p, "Primates");
						
			}
			
		});
		amp.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(a, "Amphibians");
						
			}
			
		});
		
		bir.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(b, "Birds");
						
			}
			
		});
		creatures.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(s, "Sea Creatures");
						
			}
			
		});
		ca.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(c, "Cats");
						
			}
			
		});
		rep.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(r, "Reptiles");
						
			}
			
		});
		
		setVisible(true);
	}
}
