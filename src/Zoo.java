import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Zoo extends JFrame
{
	public Zoo() 
	{
		JPanel overall = new JPanel();
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
		
		JMenuBar menu = new JMenuBar();
		JMenuItem home = new JMenuItem("Home");
		menu.add(home);
		
		Welcome welcome = new Welcome();
		overall.add(welcome, "Welcome");
		
		cl.show(welcome, "Welcome");
		
		setBounds(100,100,800,600);
		this.setJMenuBar(menu);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		home.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(welcome, "Welcome");
						
			}
			
		});
			
	}

	public static void main(String [] args)
	{
		new Zoo();
	}
}
